package com.cos.blog.domain.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.List;

import com.cos.blog.config.DBConn;
import com.cos.blog.domain.CrudDAO;
import com.cos.blog.domain.board.Board;

public class UserDAO implements CrudDAO<User>{

	//싱글톤 패턴, 스프링은 다 싱글톤
	//객체는 하나만 생성해 둔 뒤 사용, 새로 생성 불가, 딱 하나만 필요할 때 사용
	
	private static UserDAO instance = new UserDAO();
	private UserDAO() {}
	public static UserDAO getInstance() {
		return instance;
	}
	
	public User findByUsernameAndPassword(String username, String password) {
		User user = new User();
		String sql = "SELECT id,username,email,address,created FROM users WHERE username =? AND password=?"; //where절에 콤마 안 
		//세션은 서버 메모리에 떠 있는데 서버 메모리 공간은 db처럼 안전하지 않다 =>password는 담으면 안됨
		try {
		Connection conn = DBConn.DBConnect();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,username);
		pstmt.setString(2,password);
		
		ResultSet rs = pstmt.executeQuery();	
		while(rs.next()) {
			user.setId(rs.getInt("id")); 
			//password는 쿼리에 조회를 안 했으므로 넣으면 안됨
			user.setUsername(rs.getString("username"));
			user.setEmail(rs.getString("email"));
			user.setAddress(rs.getString("address"));
			user.setCreated(rs.getTimestamp("created")); //아이디 비번 말고 나머지도 다 채워넣어야 함
			return user;
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Board findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(User data) {
		//쿼리를 망가뜨려서 Script.back() 함수 테스트 해보기
		String sql = "INSERT INTO users(ID, USERNAME, PASSWORD, EMAIL, ADDRESS, CREATED) VALUES(USER_SEQ.NEXTVAL,?,?,?,?,SYSDATE)";

		// TimeStamp 타입 ->DB에 넣을 수 있음
		LocalDateTime.now();
		// Timestamp now = Timestamp.valueOf(LocalDateTime.now()); //현재시간 구하는 법

		try {
			Connection conn = DBConn.DBConnect();
			PreparedStatement pstmt = conn.prepareStatement(sql);

			User user = (User) data; // data의 타입이 아직 결정되지 않았기 때문에 다운캐스팅을 해줘야 함
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress());

			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public int update(User data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
