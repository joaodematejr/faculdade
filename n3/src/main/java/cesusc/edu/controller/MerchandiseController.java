package cesusc.edu.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cesusc.edu.connect.SQLiteJDBCDriverConnection;
import cesusc.edu.models.Merchandise;

public class MerchandiseController {
	private SQLiteJDBCDriverConnection connection;
	
	public MerchandiseController() {
		connection = new SQLiteJDBCDriverConnection();
		connection.connectionBd();
	}
	
	final String createTableMerchandise = "CREATE TABLE IF NOT EXISTS tb_merchandise (id_merchandise INTEGER NOT NULL primary key AUTO_INCREMENT, name VARCHAR (256) NOT NULL, description VARCHAR (256) NOT NULL);";
	final String insertTableMerchandise = "INSERT INTO tb_merchandise (name, description) VALUES (?, ?);";
	final String selectMerchandise = "SELECT * FROM tb_merchandise";
	
	public void add(Merchandise merchandise) throws SQLException {		
		try {
			connection.preparation(createTableMerchandise);
			connection.preparation(insertTableMerchandise);
			connection.getPreparedStatement().setString(1, merchandise.getName());
			connection.getPreparedStatement().setString(2, merchandise.getDescription());
			connection.getPreparedStatement().executeUpdate();
			JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso !!!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	

    public List<Merchandise> queryMerchandise() {
        ResultSet rs = null;
        ArrayList<Merchandise> merchandises = new ArrayList<Merchandise>();
        try {
            rs = connection.getStatement().executeQuery(selectMerchandise);
            while (rs.next()) {
            	Merchandise merchandise = new Merchandise(rs.getInt(1), rs.getString(2), rs.getString(3));
            	merchandise.setId(rs.getInt("id_merchandise"));
            	merchandise.setName(rs.getString("name"));
            	merchandise.setDescription(rs.getString("description"));
                merchandises.add(merchandise);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return merchandises;
    }
	
}
