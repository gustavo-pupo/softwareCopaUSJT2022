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
        String sql = "SELECT * FROM time";
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
                int id = rs.getInt("idTime");
                String nome = rs.getString("nome");
                int grupo = rs.getInt("grupo_idGrupo");
                times[cont++] = new Time(id, nome, 0, 0, 0, grupo, 0);
            }
            return times;
        }
    }
}
    
