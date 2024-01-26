package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {	
	public static void main(String[] args) {
		DAO.conectar();
	}
	private static final String URL = "jdbc:mysql://uclce0vk46fyzgvz:leUhDshSQzkbGiCPOeB0@buodpwwbk5xwb83mjclx-mysql.services.clever-cloud.com:3306/buodpwwbk5xwb83mjclx";
	private static final String USER = "uclce0vk46fyzgvz";
	private static final String PASSWD = "leUhDshSQzkbGiCPOeB0";
	
	public static Connection conectar() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("Conexao feita com sucesso!!!");
			}catch (SQLException e) {
				System.out.println("Erro de conexao");
			}
		return con;
	}
}
