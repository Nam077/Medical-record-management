package BaiTapCuoiKy;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Vector;

import javax.swing.*;
import BaiTapCuoiKy.DangNhap;
	public class DangKy extends JFrame implements ActionListener {
		Vector list = new Vector();
		private JButton bt1,bt2,bt3;
		private JPasswordField 	tf3,tf4;
		private JTextField tf1,tf2,tf5;
		private JPanel pn1,pn2,pn3;
		private Container con;
		private Choice cb1,cb2,cb3;
		private JLabel lb6,lb1,lb2,lb3,lb4,lb5;
    public DangKy(String s) {
    	super(s);
    	 con = this.getContentPane();
    	 lb1 = new JLabel("Họ Và Tên");
    	 lb2 = new JLabel("Tên Đăng Nhập");
         lb3 = new JLabel("Mật Khẩu");
         lb4 = new JLabel("Nhập Lại Mật Khẩu");
         lb5 = new JLabel("Nhập Email");
         lb6 = new JLabel("Ngày Sinh");
         tf1 = new JTextField();
         tf2 = new JTextField();
         tf3 = new JPasswordField();
         tf4 = new JPasswordField();
         tf5 = new JTextField();
         lb6.setFont( new Font("Arial",1 , 20));
         tf1.setFont( new Font("Arial", 1, 30));
         lb1.setFont( new Font("Arial",1 , 20));
         tf2.setFont( new Font("Arial", 1, 30));
         lb2.setFont( new Font("Arial",1 , 20));
         tf3.setFont( new Font("Arial", 1, 30));
         lb3.setFont( new Font("Arial",1 , 20));
         tf4.setFont( new Font("Arial", 1, 30));
         lb4.setFont( new Font("Arial",1 , 20));
         tf5.setFont( new Font("Arial", 1, 30));
         lb5.setFont( new Font("Arial",1 , 20));
         cb1 = new Choice();
         cb3 = new Choice();
         cb2 = new Choice();
         cb1.setFont(new Font("Arial",1 , 20));
         cb2.setFont(new Font("Arial",1 , 20));
         cb3.setFont(new Font("Arial",1 , 20));
         
         for(int i=1;i<=31;i++) {
    		cb1.addItem(Integer.toString(i));
         }
         for(int i=1;i<=12;i++) {
    		cb2.addItem("Tháng "+Integer.toString(i));
         }
         for(int i=2007;i>1940;i--) {
    		cb3.addItem(Integer.toString(i));
         }
    	bt1 = new JButton("Đăng Nhập");
    	bt2 = new JButton("Thoát");
    	bt3 = new JButton("Đăng Ký");
    	bt1.addActionListener(this);
    	bt1.setFont(new Font("Arial", 1, 20));
    	bt2.setFont(new Font("Arial", 1, 20));
    	bt3.setFont(new Font("Arial", 1, 20));
    	bt2.addActionListener(this);
    	bt3.addActionListener(this);
    	bt1.setBackground(Color.GREEN);
    	bt2.setBackground(Color.RED);
    	bt3.setBackground(Color.ORANGE);
    	JPanel pn1 = new JPanel();
    	pn1.setLayout(new GridLayout(5,2));
    	pn1.add(lb1);
    	pn1.add(tf1);
    	pn1.add(lb2);
    	pn1.add(tf2);
    	pn1.add(lb3);
    	pn1.add(tf3);
    	pn1.add(lb4);
    	pn1.add(tf4);
    	pn1.add(lb5);
    	pn1.add(tf5);
    	pn2 = new JPanel();
    	pn2.setLayout(new GridLayout(1,4));
    	pn2.add(lb6);
    	pn2.add(cb1);
    	pn2.add(cb2);
    	pn2.add(cb3);
    	pn3 = new JPanel();
    	pn2.setLayout(new GridLayout(1,3));
    	pn3.add(bt3);
    	pn3.add(bt1);
    	pn3.add(bt2);
    	con.add(pn1, "North");
    	con.add(pn2,"Center");
    	con.add(pn3, "South");
    	this.setSize(700, 330);
    	this.setLocationRelativeTo(null);
    	this.setVisible(true);
    	KetNoi kn = new KetNoi();
    	kn.Connec();
    	kn.addtk(list);
    }
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Đăng Ký") {
			  boolean kt = true;
			  boolean kn = false;
			  boolean kh = false;
			  boolean kk = false;
			  if(tf1.getText().length()!=0&&tf2.getText().length()!=0&&tf3.getText().length()!=0&&tf4.getText().length()!=0&&tf5.getText().length()!=0){
				  kn=true;
				  if(kn) {
					  		Enumeration vNum = list.elements();
					  		while(vNum.hasMoreElements()) {
					  		Tai_Khoan tk = (Tai_Khoan) vNum.nextElement();
					  		if(tf2.getText().equals(tk.getUsername())) {
					  			kt = false;
					  			break;
					  		}
					  		}
					  		if(kt) {
					  			int i = tf2.getText().indexOf(' ');
					  				if(i==-1)
					  					kk=true;
					  			if(kk) {
					  					if(tf3.getText().equals(tf4.getText())) kh =true;
					  					if(kh) {
					  						new ThongBao("Thành Công");
					  						String sql2 = "INSERT INTO TAI_KHOAN(HO_TEN,TEN_TAI_KHOAN,MAT_KHAU,SDT) VALUES(?,?,?,?)";
					  						try {
					  							Connection conn2 = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"+" databaseName = JAVA; user=namnam;password=123");
					  							PreparedStatement ps = conn2.prepareStatement(sql2);
					  							ps.setString(1, tf1.getText());
					  							ps.setString(2, tf2.getText());
					  							ps.setString(3, tf3.getText());
					  							ps.setString(4, tf5.getText());
					  							ps.executeQuery();
					  							ps.executeUpdate();
					  							JOptionPane.showMessageDialog(null, "Nam ^^");
					  							ps.close();
					  							conn2.close();
					  						}catch (SQLException ex) {
					  						//	ex.printStackTrace();
					  						}
					  					}
					  					else new ThongBao("Mật Khẩu Không Giống Nhau");		
					  			}
					  			else new ThongBao("Tên Đăng Nhập Chứa Khoảng Trắng");
					  		}
					  		else new ThongBao("Tên Đăng Nhập Đã Tồn Tại");
				 }
			  }
			  else  new ThongBao("Vui lòng nhập đầy đủ thông tin");
		}
		if(e.getActionCommand()=="Thoát") {
			this.dispose();
		}
		if(e.getActionCommand()=="Đăng Nhập") {
			this.dispose();
			new  DangNhap("HHHH");
		}
			
			
	}
}
	
