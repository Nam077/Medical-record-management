package BaiTapCuoiKy;
import java.security.KeyStore.ProtectionParameter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class KetNoi {
	Connection conn;
	Statement st;
	public void Connec() {
		try{ 
    		conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"+" databaseName = JAVA; user=namnam;password=123"); 
    	    System.out.println("thanh cong");
    	}
    	catch(Exception e){ 
    		e.printStackTrace();
    	} 
	}
	public void addtk(Vector list) {
		String sql = "SELECT * FROM DANGNHAP";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Tai_Khoan tk = new Tai_Khoan();
				tk.setUsername(rs.getString(1));
				tk.setMatkhau(rs.getString(2));
				tk.setHoten(rs.getString(3));
				tk.setEmail(rs.getString(4));
				tk.setNgaysinh(rs.getString(5));
				list.add(tk);	
			}	
		}catch (Exception e) {
			System.out.println("Loi");
		}
	}
	public void addbn(Vector list2) {
		String sql = "SELECT * FROM BENHNHAN";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ThongTin tt = new ThongTin();
				tt.setTenbn(rs.getString(2));
				tt.setDiachi(rs.getString(3));
				tt.setCmnd(rs.getString(4));
				tt.setSdt(rs.getString(5));
				tt.setBenh(rs.getString(6));
				list2.add(tt);
			}
			
		}catch (Exception e) {
		}
	}
	public void addba(Vector list3) {
		String sql = "SELECT * FROM BENH_AN";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Thong_Tin2 tt = new Thong_Tin2();
				tt.setTien(rs.getInt(2));
				tt.setBacsi(rs.getString(3));
				tt.setNgayvao(rs.getString(4));
				tt.setNgayra(rs.getString(5));
				list3.add(tt);
			}	
		}catch (Exception e) {
		}
	}
}