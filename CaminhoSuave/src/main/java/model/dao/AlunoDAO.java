package model.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlunoDAO {

	public void create(Aluno a) {
		
		
		Connection conn = Banco.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("INSERT INTO ALUNO (NOME, SOBRENOME, MATRICULA, NIVEL, NP1, NP2, NT1, NT2, PESOPROVA, PESOTRABALHO, MEDIAFINAL, SITUACAO) VALUES(?, ?, ?, ?, ?, ? , ?, ?, ?, ?, ?, ?)");
			
			
			stmt.setString(1, a.getNome().toUpperCase());
			stmt.setString(2, a.getSobrenome().toUpperCase());
			stmt.setInt(3, a.getMatricula());
			stmt.setString(4, a.getNivel().toUpperCase());
			stmt.setDouble(5, a.getNp1());
			stmt.setDouble(6, a.getNp2());
			stmt.setDouble(7, a.getNt1());
			stmt.setDouble(8, a.getNt2());
			stmt.setInt(9, a.getPesoProva());
			stmt.setInt(10, a.getPesoTrabalho());
			stmt.setDouble(11, a.getMediaFinal());
			stmt.setString(12, a.getSituacao().toUpperCase());
			
			stmt.executeUpdate();
			
			System.out.println("Salvo com sucesso");
			
		} catch (SQLException e) {
			System.out.println("Erro ao salvar" + e);
			e.printStackTrace();
		}finally {
			Banco.closeConnection(conn);
			Banco.closeStatement(stmt);
		}
		
		
	}
	
	public boolean pesquisarMatricula(Aluno a) {
		

		Connection conn = Banco.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			
			
			stmt = conn.prepareStatement("SELECT MATRICULA FROM ALUNO WHERE MATRICULA = ?");
			
			stmt.setInt(1, a.getMatricula());
			
			rs = stmt.executeQuery();
					
			if(rs.next()) {
				return true;
			}else {
				return false;
			}	
			
			
		} catch (SQLException e) {
			System.out.println("Erro ao pesquisar " + e);
			e.printStackTrace();
			return false;
		}finally {
			Banco.closeConnection(conn);
			Banco.closeStatement(stmt);
		}
		
		
		
		
		
	}
		
		
}
	
	

