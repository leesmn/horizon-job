package com.xxl.job.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@SpringBootApplication
public class XxlJobAdminApplication {

	public static void main(String[] args) {
        SpringApplication.run(XxlJobAdminApplication.class, args);
	}

//	public static void main(String[] args) throws SQLException {
//		Connection con;
//		con = DriverManager.getConnection("jdbc:mysql://10.80.100.134:3306/gateway", "micro", "123456");
//		DatabaseMetaData dbmd = con.getMetaData();
//		// ResultSet resultSet = dbmd.getTables(null, "mysql",
//		// "route_definition", new String[] { "TABLE", "VIEW" });
//		// System.out.println(resultSet.toString());
//		ResultSet route_definition = dbmd.getPrimaryKeys(null, "mysql", "route_definition");
//		System.out.println(route_definition.toString());
//	}
}