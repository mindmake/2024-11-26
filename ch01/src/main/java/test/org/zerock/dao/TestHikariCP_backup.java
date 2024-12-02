package test.org.zerock.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class TestHikariCP_backup {

	public static void main(String[] args) throws SQLException {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/webdb");
		config.setUsername("aaa");
		config.setPassword("bbb");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		HikariDataSource ds = new HikariDataSource(config);
		
		Connection conn = ds.getConnection();
		ResultSet result= conn.prepareStatement("select now()").executeQuery();
		result.next(); //첫번째 행을 접근해서
		System.out.println(result.getString(1));
		
	}

}
