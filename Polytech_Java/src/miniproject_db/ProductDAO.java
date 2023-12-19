package miniproject_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	//0. JDBC Driver, URL, ID, PW ����	
	String jdbcdriver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3305/mydb";
	String id = "root";
	String pw = "1234";	
	ArrayList<Product> product_list = null;
	Product p; //��ǰ������ ���� ��ü
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	// DB ���� �޼��� 
	public void connectDB() {
		try {
			Class.forName(jdbcdriver);
			conn = DriverManager.getConnection(url, id, pw);			
		}
		catch(Exception e) {e.printStackTrace();}
	}
	
	// DB ���� �޼��� 
	public void closeDB() {
		try {
			pstmt.close();
			conn.close();
		}
		catch(Exception e) {e.printStackTrace();}
	}
	
	/* ��ǰ ���� ���� : CRUD 
	 =============================================== */	
	// ��ü Product ����Ʈ�� ������ ArrayList�� ���� (��ü��ȸ)
	public ArrayList<Product> getAll(){}
	 
	// �Ķ���Ϳ��� pcode �� �ش��ϴ� ��ǰ�� ���� (�Ϻ���ȸ)
	public Product getProduct(int pcode) {
		//1. DB����
		connectDB();
		//2. pstmt �� sql �� Ȱ���ؼ�, executeQuery
		sql = "select * from product where pcode = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pcode);
			rs = pstmt.executeQuery();
			rs.next();
			
			//todo : CellPhone �Ǵ� SmartTV �� �з��ؼ� ���� �־���� ��. 
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
		//3. DB����
			closeDB();
		}
		return p;
	}	
	 
	// Product ��ü ������ DB ���� (insert)
	public boolean newProduct(Product product) {
		//1. DB����
		connectDB();
		//2. pstmt �� sql �� Ȱ���ؼ�, executeUpdate �޼ҵ� Ȱ���Ͽ� insert
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
		//3. DB����
			closeDB();
		}
		return true;
	}	
	
	// Product ��ü���� pcode�� �ش��ϴ� ��ü�� DB ���� ���� (delete)
	public boolean delProduct(int pcode) {
		//1. DB����
		connectDB();
		//2. pstmt �� sql �� Ȱ���ؼ�, executeUpdate �޼ҵ� Ȱ���Ͽ� insert
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
		//3. DB����
			closeDB();
		}
		return true;
	}
	 
	// Product ��ü�� ������ ������Ʈ (update)
	public boolean updateProduct(Product product) {
		//1. DB����
		connectDB();
		//2. pstmt �� sql �� Ȱ���ؼ�, executeUpdate �޼ҵ� Ȱ���Ͽ� insert
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
		//3. DB����
			closeDB();
		}
		return true;		
	}
}
