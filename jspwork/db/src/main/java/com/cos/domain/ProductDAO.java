package com.cos.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cos.db.DBConn;

public class ProductDAO { // Data Access Object
//여기에 적어두면 재사용할 수 있다.
//jsp에 적어두면 요청이 올 때마다 새로 작성
//프레임워크를 쓰면 자동으로 만들어 줌

//모델링
//VO = Value Object
//실행이 되려면 커넥션 객체가 필요함, DBConn에 있음

	public int 상품추가(String name, int price) {
		String sql = "INSERT INTO product(id, name, price) VALUES(product_seq.nextval,?,?)";
		try {
			Connection conn = DBConn.디비연결();
			
			// 그냥 버퍼를 달면 프로토콜 적용이 안됨
			//1. PreparedStatement는 ?로 변수 바인딩이 가능
			//2. PreparedStatement는 인젝션 공격을 방어해준다
			PreparedStatement pstmt = conn.prepareStatement(sql); // 프로토콜이 적용된 버퍼
			//pstmt.setInt(1, id); //물음표 순서는 1부터 시작 
			pstmt.setString(1, name); //물음표 순서는 1부터 시작 
			pstmt.setInt(2, price); //물음표 순서는 1부터 시작
			
			return pstmt.executeUpdate(); //내부적으로 커밋이 일어남, 변경된 행의 갯수를 리턴
			//pstmt.executeQuery();  //커밋은 안 일어나지만 결과를 리턴해줌
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	public List<Product> 상품전체보기() {
		List<Product> products = new ArrayList<>();
		String sql = "SELECT * FROM product order by id";
		try {
			Connection conn = DBConn.디비연결();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("Price"));
				products.add(product);
			}
			return products;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	//한 건 벡터
	//여러 건 스칼라
	//CURSOR  
	public Product 상품한건보기(int id) {
		Product p = new Product();
		String sql = "SELECT * FROM product WHERE id=?";
		try {
			Connection conn = DBConn.디비연결();
			
			PreparedStatement pstmt = conn.prepareStatement(sql); // 프로토콜이 적용된 버퍼
			pstmt.setInt(1, id);
			
		 ResultSet rs = pstmt.executeQuery();  //커밋은 안 일어나지만 결과를 리턴해줌 //레코드(로우) 하나 리턴,
		 	//하나일지 여러 개일지 모르기 때문에 셋으로 받음
		 while(rs.next()) {
			 //단점, 값을 가져올 때는 키값(컬럼명//별칭)을 문자열로 받아옴
			 //객체에 저장을 해서 사용하면 컴파일 시에 오류 확인 가능
			p.setId(rs.getInt("id"));
		    p.setName(rs.getString("name"));
		    p.setPrice(rs.getInt("price"));
		    System.out.println();
		 }
		 return p; //없는 값을 넣더라도 객체를 반환하기 때문에 오류 안남(실제로는 예외처리 필요) 
			} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		 
	}

	public void 상품한건수정하기() {

	}

	public void 상품한건삭제하기() {

	}

}
