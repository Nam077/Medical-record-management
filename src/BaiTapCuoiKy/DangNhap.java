package BaiTapCuoiKy;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Enumeration;
import java.util.Vector;
public class DangNhap extends JFrame implements ActionListener {
	Vector list = new Vector();
	Vector list2 = new Vector();
	Vector list3 = new Vector();
	private JButton bt1,bt2,bt3;
	private JPasswordField tf2;
	private JTextField tf1;
	private JPanel pn1,pn2,pn3;
	private Container cn1;
	private JLabel lb1,lb2,lb3;
	String j;
  public DangNhap(String s) {
	super(s);
	Container cn1 = this.getContentPane();
	JLabel lb1 = new JLabel("TÊN ĐĂNG NHẬP");
	lb1.setFont(new Font("Arial", 1, 20));
	JLabel lb2 = new JLabel("MẬT KHẨU");
	lb2.setFont(new Font("Arial", 1, 20));
	tf1 = new JTextField();
	tf2 = new JPasswordField();
	JButton bt1 = new JButton("ĐĂNG NHẬP");
	bt1.addActionListener(this);
	tf1.setFont(new Font("Arial", 1, 40));
	tf2.setFont(new Font("Arial", 1, 40));
	bt1.setFont(new Font("Arial", 1, 20));
	bt1.setBackground(Color.green);
	JButton bt2 = new JButton("ĐĂNG KÝ");
	bt2.addActionListener(this);
	JButton bt3 = new JButton("THOÁT");
	bt3.addActionListener(this);
	JButton bt4 = new JButton("QUÊN MẬT KHẨU");
	bt4.addActionListener(this);
	bt2.setFont(new Font("Arial", 1, 20));
	bt3.setFont(new Font("Arial", 1, 20));
	bt4.setFont(new Font("Arial", 1, 20));
	bt2.setBackground(Color.YELLOW);
	bt3.setBackground(Color.RED);
	bt4.setBackground(Color.ORANGE);
	JPanel pn1 = new JPanel();
	pn1.setLayout(new GridLayout(2,2));
	pn1.add(lb1);
	pn1.add(tf1);
	pn1.add(lb2);
	pn1.add(tf2);
	JPanel pn2 = new JPanel();
	pn2.setLayout(new GridLayout(1,1));
	pn2.add(bt1);
	JPanel pn3 = new JPanel();
	pn3.setLayout(new GridLayout(1,3));
	pn3.add(bt2);
	pn3.add(bt4);
	pn3.add(bt3);
	cn1.add(pn1,"North");
	cn1.add(pn2,"Center");
	cn1.add(pn3,"South");
	this.setSize(1000, 220);
	this.setLocationRelativeTo(null);
	this.setVisible(true);
	KetNoi kn = new KetNoi();
	kn.Connec();
	kn.addtk(list);
	kn.addbn(list2);
	kn.addba(list3);
  }
  public void actionPerformed (ActionEvent e) {
	  if(e.getActionCommand()=="ĐĂNG KÝ") {
		  this.dispose();
		  new DangKy("ĐĂNG KÝ");
	  }
	  if(e.getActionCommand()==("THOÁT")) this.dispose();
	  if(e.getActionCommand()=="QUÊN MẬT KHẨU") { 
		  this.dispose();
		  new QuenMatKhau("QUÊN MẬT KHẨU");
	  }
	  if(e.getActionCommand()=="ĐĂNG NHẬP") { 
		  boolean kt = false;
		  boolean kn = false;
		  if(tf1.getText().length()!=0&&tf2.getText().length()!=0) {
			  kn=true;
		  }
		  if(kn) {
		  Enumeration vNum = list.elements();
		  while(vNum.hasMoreElements()) {
			  Tai_Khoan tk = (Tai_Khoan) vNum.nextElement();
			  if (tf1.getText().equals(tk.getUsername())&&tf2.getText().equals(tk.getMatkhau())) {
				  kt = true;
				  break;
			  }
		  }
		  if (kt) {
			  this.dispose();
			  new ChucNang(list,list2,list3);
		  } else {
			  new ThongBao("Thông Tin Tài Khoản Hoặc Mật Khẩu Không Chính Xác"); 
		  }
		  }
		  else new ThongBao("Vui Lòng Điền Đủ Thông Tin");
	}
  }
}
