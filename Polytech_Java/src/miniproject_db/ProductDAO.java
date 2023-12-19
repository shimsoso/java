package miniproject_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	//0. JDBC Driver, URL, ID, PW 설정	
	String jdbcdriver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3305/mydb";
	String id = "root";
	String pw = "1234";	
	ArrayList<Product> product_list = null;
	Product p; //상품정보를 위한 객체
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	// DB 연결 메서드 
	public void connectDB() {
		try {
			Class.forName(jdbcdriver);
			conn = DriverManager.getConnection(url, id, pw);			
		}
		catch(Exception e) {e.printStackTrace();}
	}
	
	// DB 종료 메서드 
	public void closeDB() {
		try {
			pstmt.close();
			conn.close();
		}
		catch(Exception e) {e.printStackTrace();}
	}
	
	/* 상품 정보 관련 : CRUD 
	 =============================================== */	
	// 전체 Product 리스트로 구성된 ArrayList를 리턴 (전체조회)
	public ArrayList<Product> getAll(){}
	 
	// 파라미터에서 pcode 에 해당하는 상품을 리턴 (일부조회)
	public Product getProduct(int pcode) {
		//1. DB연결
		connectDB();
		//2. pstmt 에 sql 을 활용해서, executeQuery
		sql = "select * from product where pcode = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pcode);
			rs = pstmt.executeQuery();
			rs.next();
			
			//todo : CellPhone 또는 SmartTV 로 분류해서 값을 넣어줘야 함. 
			p = new SmartTV();
			p = new CellPhone();
			
			p.setPcode(rs.getInt("pcode"));
			p.setPname(rs.getString("pname"));
			p.setPrice(rs.getInt("price"));
			p.setMf(rs.getString("mf"));
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
		//3. DB종료
			closeDB();
		}
		return p;
	}	
	 
	// Product 객체 내용을 DB 저장 (insert)
	public boolean newProduct(Product product) {
		//1. DB연결
		connectDB();
		//2. pstmt 에 sql 을 활용해서, executeUpdate 메소드 활용하여 insert
		sql = "insert into product(pname, price, mf) values(?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getPname());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getMf());
			pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
		//3. DB종료
			closeDB();
		}
		return true;
	}	
	
	// Product 객체에서 pcode에 해당하는 객체를 DB 에서 삭제 (delete)
	public boolean delProduct(int pcode) {
		//1. DB연결
		connectDB();
		//2. pstmt 에 sql 을 활용해서, executeUpdate 메소드 활용하여 insert
		sql = "delete from product where pcode = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pcode);
			pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
		//3. DB종료
			closeDB();
		}
		return true;
	}
	 
	// Product 객체의 내용을 업데이트 (update)
	public boolean updateProduct(Product product) {
		//1. DB연결
		connectDB();
		//2. pstmt 에 sql 을 활용해서, executeUpdate 메소드 활용하여 insert
		sql = "update product set pname=?, price=?, mf=? where pcode=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getPname());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getMf());
			pstmt.setInt(4, product.getPcode());
			pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
		//3. DB종료
			closeDB();
		}
		return true;		
	}
}
