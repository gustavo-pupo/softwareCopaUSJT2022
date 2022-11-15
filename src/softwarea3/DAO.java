package softwarea3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
    public boolean existeUsuario (Usuario usuario) throws Exception {
        String sql = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";
        try (Connection c = ConectorBD.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    public boolean checaCargo (Usuario usuario) throws Exception {
        String sql = "SELECT cargo FROM usuario WHERE nome = ? AND senha = ?";
        try (Connection c = ConectorBD.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                if(rs.getInt(1) != 1){
                    return false;
                }
                return true;
            }
        }
    }
    public void cadastrarUsuario (Usuario usuario) throws Exception {
        String sql = "INSERT INTO usuario (nome, senha, cargo) VALUES (? , ?, 0)";
        try (Connection c = ConectorBD.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            ps.execute();
        }
    }
    public Time[] getTimesOficiais() throws Exception {
        String sql = "SELECT * FROM timeOficial";
        try (Connection conn = ConectorBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(
             sql, ResultSet.TYPE_SCROLL_INSENSITIVE, 
                  ResultSet.CONCUR_READ_ONLY )) {
            ResultSet rs = ps.executeQuery();
            int totalTimes = rs.last()? rs.getRow(): 0;
            Time[] times = new Time[totalTimes];
            rs.beforeFirst();
            int cont = 0;
            while (rs.next()) {
                int id = rs.getInt("idTimeOficial");
                String nome = rs.getString("nome");
                times[cont++] = new Time(id, nome, 0, 0, 0, 0, 0);
            }
            return times;
        }
    }
    public boolean existeTime (Time time) throws Exception {
        String sql = "SELECT * FROM time WHERE idTime = ?";
        try (Connection c = ConectorBD.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, time.getId());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    
    public void inserirTime (Time time) throws Exception {
        String sql = "INSERT INTO time (idTime, nome, saldoGols, golsSofridos, pontos, grupo_idGrupo, eliminatorias) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection c = ConectorBD.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, time.getId());
            ps.setString(2, time.getNome());
            ps.setInt(3, time.getSaldoGols());
            ps.setInt(4, time.getGolsSofridos());
            ps.setInt(5, time.getPontos());
            ps.setInt(6, time.getIdGrupo());
            ps.setInt(7, time.getEliminatorias());
            ps.execute();
        }
    }
    public Time[] getTimesPorGrupo(int grupo) throws Exception {
        String sql = "SELECT * FROM time WHERE grupo_idGrupo = ?";
        try (Connection conn = ConectorBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(
             sql, ResultSet.TYPE_SCROLL_INSENSITIVE, 
                  ResultSet.CONCUR_READ_ONLY )){ 
            ps.setInt(1, grupo);
            ResultSet rs = ps.executeQuery();
            int totalTimes = rs.last()? rs.getRow(): 0;
            Time[] times = new Time[totalTimes];
            rs.beforeFirst();
            int cont = 0;
            while (rs.next()) {
                int id = rs.getInt("idTime");
                String nome = rs.getString("nome");
                int saldoGols = rs.getInt("saldoGols");
                int golsSofridos = rs.getInt("golsSofridos");
                int pontos = rs.getInt("pontos");
                int eliminatorias = rs.getInt("eliminatorias");
                times[cont++] = new Time(id, nome, saldoGols, golsSofridos, pontos, grupo, eliminatorias);
            }
            return times;
        }
    }
    public void criaPartida (Partida partida) throws Exception {
        String sql = "INSERT INTO jogo (idjogo, host, visitante, scoreHost, scoreVisitante) VALUES (?, ?, ?, ?, ?)";
        try (Connection c = ConectorBD.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, partida.getId());
            ps.setInt(2, partida.getHost());
            ps.setInt(3, partida.getAway());
            ps.setInt(4, partida.getScoreHost());
            ps.setInt(5, partida.getScoreAway());
            ps.execute();
        }
    }
    public void atualizaGolsHome (Partida partida) throws Exception {
        String sql = "UPDATE time SET saldoGols = saldoGols + ?, golsSofridos = golsSofridos + ? WHERE idTime = ?";
        try (Connection c = ConectorBD.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, partida.getScoreHost());
            ps.setInt(2, partida.getScoreAway());
            ps.setInt(3, partida.getHost());
            ps.execute();
        }
    }
    public void contaVitoriaHost (Partida partida) throws Exception {
        String sql = "UPDATE time SET pontos = pontos + 3 WHERE idTime = ?";
        try (Connection c = ConectorBD.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, partida.getHost());
            ps.execute();
        }
    }
    public void contaVitoriaAway (Partida partida) throws Exception {
        String sql = "UPDATE time SET pontos = pontos + 3 WHERE idTime = ?";
        try (Connection c = ConectorBD.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, partida.getAway());
            ps.execute();
        }
    }
    public void contaEmpate(Partida partida) throws Exception {
        String sql = "UPDATE time SET pontos = pontos + 1 WHERE idTime = ? OR idTime = ?";
        try (Connection c = ConectorBD.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, partida.getHost());
            ps.setInt(2, partida.getAway());
            ps.execute();
        }
    }
    public void atualizaGolsAway (Partida partida) throws Exception {
        String sql = "UPDATE time SET saldoGols = saldoGols + ?, golsSofridos = golsSofridos + ? WHERE idTime = ?";
        try (Connection c = ConectorBD.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, partida.getScoreAway());
            ps.setInt(2, partida.getScoreHost());
            ps.setInt(3, partida.getAway());
            ps.execute();
        }
    }
    public Partida[] getPartidas() throws Exception {
        String sql = "SELECT * FROM jogo";
        try (Connection conn = ConectorBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(
             sql, ResultSet.TYPE_SCROLL_INSENSITIVE, 
                  ResultSet.CONCUR_READ_ONLY )) {
            ResultSet rs = ps.executeQuery();
            int totalPartidas = rs.last()? rs.getRow(): 0;
            Partida[] partidas = new Partida[totalPartidas];
            rs.beforeFirst();
            int cont = 0;
            while (rs.next()) {
                int id = rs.getInt("idjogo");
                String nome = rs.getString("nome");
                int host = rs.getInt("host");
                int away = rs.getInt("visitante");
                int scoreHost = rs.getInt("scoreHost");
                int scoreAway = rs.getInt("scoreVisitante");
                partidas[cont++] = new Partida(host, away, scoreHost, scoreAway);
            }
            return partidas;
        }
    }  
    public void defineEliminatorias(int time)throws Exception{
        String sql = "UPDATE time SET eliminatorias = 1 WHERE idTime = ?";
        try (Connection c = ConectorBD.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, time);
            ps.execute();
        }
    }
}
    
