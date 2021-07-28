import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class SampleSingleton {

	private static Connection conn = null;
	private static SampleSingleton instance = null;

	public SampleSingleton getInstance() {
		if (instance == null) { // check
			synchronized (this) { // lock
				if (instance == null) { // check
					instance = new SampleSingleton();
				}
			}
		}
		return instance;
	}

	protected Connection setConnection(String url, String u, String p) {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); 
		//doesn't work since oracle isn't connected, I'm assuming that this was more 
		//about setting up the singleton class rather than getting it to compile it a main function

		try {
			conn = DriverManager.getConnection(url, u, p);
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		return conn;
	}

	protected Connection getConnection(Connection conn) {
		return conn;
	}

	public static void main(String[] args) {

		boolean valid = false;
		Scanner s = new Scanner(new InputStreamReader(System.in));
		SampleSingleton Ss = new SampleSingleton();
		Statement statement;

		while (valid == false) {

			System.out.println("Enter a database url...");
			String url = s.next();

			System.out.println("Enter username...");
			String user = s.next();

			System.out.println("Enter password...");
			String password = s.next();

			Ss.setConnection(url, user, password);

			try {
				if (Ss.conn.isValid(0))
					valid = true;

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("What statment would you like to preform...");
		String sql = s.next();

		System.out.println("\nNow trying statment...\n");

		try {
			statement = Ss.conn.createStatement();
			statement.execute(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
