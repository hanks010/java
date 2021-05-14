package com.cos.db;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConn {

	public static Connection 디비연결() {
		try {
		
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");// 외부 파일 연결, 고정값
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle"); // web.xml이 참조하고 있는 이름과 같아야 함
			Connection conn = ds.getConnection();
			System.out.println("DB 연결성공");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DB 연결실패");
		return null;

	}

	}
