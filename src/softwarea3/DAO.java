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
}
    
