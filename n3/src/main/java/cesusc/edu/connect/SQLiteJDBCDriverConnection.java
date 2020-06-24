package cesusc.edu.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class SQLiteJDBCDriverConnection {
	private final String url = "jdbc:mysql://ns572.hostgator.com.br/clangu84_testes";
	private final String user = "clangu84_root";
	private final String password = "EkHHGwyiCHvv8b7";
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private Statement statement = null;

	public void connectionBd() {
		try {
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public void preparation(String comando) throws SQLException {
		preparedStatement = connection.prepareStatement(comando);
	}

	public void executesCommand(String comando) throws SQLException {
		preparation(comando);
		preparedStatement.executeUpdate();
	}

	public Connection getConnection() {
		return connection;
	}

	public PreparedStatement getPreparedStatement() {
		return preparedStatement;
	}

	public Statement getStatement() {
		return statement;
	}

}