package cesusc.edu.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import cesusc.edu.connect.SQLiteJDBCDriverConnection;
import cesusc.edu.models.Charters;

public class ChartersController {
	private SQLiteJDBCDriverConnection connection;
	
	
	public ChartersController() {
		connection = new SQLiteJDBCDriverConnection();
		connection.connectionBd();
		
	}
	
	final String createTableCharters = "CREATE TABLE IF NOT EXISTS tb_charters (id_charters INTEGER NOT NULL primary key AUTO_INCREMENT, merchandise VARCHAR (256) NOT NULL, description VARCHAR (256) NOT NULL);";
	final String insertTableCharters = "INSERT INTO tb_charters (merchandise, description) VALUES (?, ?);";
	final String selectCharters = "SELECT * FROM tb_charters";

	public void add(Charters charters) {
		try {
			connection.preparation(createTableCharters);
			connection.preparation(insertTableCharters);
			connection.getPreparedStatement().setString(1, charters.getMerchandise());
			connection.getPreparedStatement().setString(2, charters.getDescription());
			connection.getPreparedStatement().executeUpdate();
			JOptionPane.showMessageDialog(null, "Fretamento Cadastrado Realizado com Sucesso !!!");
			queryCharters();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}	
	}
	
	   public ArrayList<Charters> queryCharters() {
	        ResultSet rs = null;
	        ArrayList<Charters> charters = new ArrayList<Charters>();
	        try {
	            rs = connection.getStatement().executeQuery(selectCharters);
	            while (rs.next()) {
	            	Charters charter = new Charters(rs.getInt(1), rs.getString(2), rs.getString(3));
	            	charter.setId(rs.getInt("id_charters"));
	            	charter.setMerchandise(rs.getString("merchandise"));
	            	charter.setDescription(rs.getString("description"));
	            	charters.add(charter);
	            }
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, e.getMessage());
	        }
	        System.out.println(charters);
	        return charters;
	    }
	

}
