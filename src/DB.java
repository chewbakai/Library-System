import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

	static final String driver = "com.mysql.jdbc.Driver";
	static final String url = "jdbc:mysql://127.0.0.1:3306/library?serverTimezone=UTC";
	static final String user = "root";
	static final String pass = "";

	public static Connection getConnection() {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database..");
			con = DriverManager.getConnection(url, user, pass);

			System.out.println("Connected to database successfully");
		}catch (Exception e){
			System.out.println(e);
		}

//			st = con.createStatement();
//			String sql = "CREATE TABLE LIBRARIAN" +
//					"(id INTEGER not null," +
//					"name VARCHAR(255),"+
//					"password VARCHAR(100) not null,"+
//					"email VARCHAR(100) not null," +
//					"address VARCHAR(200) not null," +
//					"city VARCHAR(100) not null," +
//					"contact VARCHAR(20) not null," +
//					"PRIMARY KEY (id))";
//
//			st.executeUpdate(sql);
//			System.out.println("Table created successfully");

//			String sql1 = null;
//			sql1 = "CREATE TABLE BOOKS" +
//					"(id INTEGER not null," +
//					"callno VARCHAR(100),"+
//					"name VARCHAR(255),"+
//					"author VARCHAR(100) not null,"+
//					"publisher VARCHAR(100) not null," +
//					"quantity INTEGER(10) not null," +
//					"issued INTEGER(10) not null," +
//					"added_date timestamp not null default  current_timestamp on update CURRENT_TIMESTAMP," +
//					"PRIMARY KEY (id)," +
//					"UNIQUE KEY callno (callno))";
//
//			st.executeUpdate(sql1);
//			System.out.println("Table created successfully");
//
//			String sql2 = null;
//			sql2 = "CREATE TABLE ISSUEBOOKS" +
//					"(id INTEGER not null," +
//					"bookcallno VARCHAR(50),"+
//					"Librarianid INTEGER(11),"+
//					"Librarianname VARCHAR(50) not null,"+
//					"Librariancontact VARCHAR(20) not null," +
//					"issued_date timestamp not null default  current_timestamp on update CURRENT_TIMESTAMP," +
//					"PRIMARY KEY (id))";
//
//			st.executeUpdate(sql2);
//			System.out.println("Table created successfully");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (st != null)
//					st.close();
//			} catch (SQLException e1) {
//			}
//			try {
//				if (con != null)
//					con.close();
//
//			} catch (SQLException e2) {
//				e2.printStackTrace();
//			}
//		}
		System.out.println("-----PROGRAM IS SUCCESSFUL----");
		return con;
	}
}

