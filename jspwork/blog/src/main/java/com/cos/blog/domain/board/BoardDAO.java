package com.cos.blog.domain.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cos.blog.config.DBConn;
import com.cos.blog.domain.CrudDAO;
import com.cos.blog.web.dto.BoardDetailDTO;

public class BoardDAO implements CrudDAO<Board>{
	
	private static BoardDAO instance = new BoardDAO();
	private BoardDAO() {}
	public static BoardDAO getInstance() {
		return instance;
	}
	
	//상세보기 시 Board 정보와 User 정보를 조인해서 가져올 함수
	public BoardDetailDTO mDetail(Integer id) {
		//Board: id, title, content 여기까지 화면에 표시//   created, userId
				//User: username
		BoardDetailDTO dto= new BoardDetailDTO();
				//조인문은 Board를 리턴 못함
				String sql = "SELECT b.id, b.title, b.content, b.created, u.username, u.id FROM users u INNER JOIN boards b ON u.id = b.userId WHERE b.id=?";
				try {
					Connection conn = DBConn.DBConnect();

					PreparedStatement pstmt = conn.prepareStatement(sql); // 프로토콜이 적용된 버퍼
					pstmt.setInt(1, id);

					ResultSet rs = pstmt.executeQuery(); // 커밋은 안 일어나지만 결과를 리턴해줌 //레코드(로우) 하나 리턴,
					
					
					while (rs.next()) {
					dto.setId(rs.getInt(1));
					dto.setTitle(rs.getString(2));
					dto.setContent(rs.getString(3));
					dto.setCreated(rs.getString(4));
					dto.setUsername(rs.getString(5));
					dto.setUserId(rs.getInt(6));
					
				System.out.println(dto);
						
					}
					return dto; 
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return null;
	}

	@Override
	public Board findById(Integer id) {
		
		return null;
	}

	@Override
	public List<Board> findAll() {
		List<Board> boards = new ArrayList<>();
		String sql = "SELECT * FROM boards order by id DESC";
		try {
			Connection conn = DBConn.DBConnect();
			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board board = new Board();
				board.setId(rs.getInt("id"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setUserId(rs.getInt("userId"));
				board.setCreated(rs.getTimestamp("created"));
				boards.add(board);
				//return boards;
			}
			return boards;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int save(Board data) {
		Board board = data;
		String sql = "INSERT INTO boards(ID, TITLE, CONTENT, USERID, CREATED) VALUES(BOARD_SEQ.NEXTVAL,?,?,?,SYSDATE)";
		
		try {
			Connection conn = DBConn.DBConnect();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setString(1,board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3,board.getUserId());
			
			return pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
		
	}

	@Override
	public int update(Board data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
