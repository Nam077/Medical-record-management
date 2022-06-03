package BaiTapCuoiKy;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Enumeration;
import java.util.Vector;
public class QuenMatKhau extends JFrame implements ActionListener {
	private JButton bt1,bt2,bt3;
	private JTextField tf1,tf2;
	private JPanel pn1,pn2,pn3;
	private Container cn1;
	private JLabel lb1,lb2,lb3;
	Vector list = new Vector();
	private Choice cb1,cb2,cb3;
	public QuenMatKhau(String s) {
		super (s);
		Container cn1 = this.getContentPane();
		JLabel lb1 = new JLabel("Tên Tài Khoản");
		JLabel lb2 = new JLabel("Tài Khoản Email");
		JLabel lb3 = new JLabel("Ngày Sinh");
		JLabel lb4 = new JLabel("Tháng Sinh");
		JLabel lb5 = new JLabel("Năm Sinh");
		tf1 = new JTextField();
		tf2 = new JTextField();
		Choice cb1 = new Choice();
    	Choice cb3 = new Choice();
    	Choice cb2 = new Choice();
    	cb1.setFont( new Font("Arial",1 , 20));
        cb2.setFont( new Font("Arial", 1, 20));
        cb3.setFont( new Font("Arial",1 , 20));
    	for(int i=1;i<=31;i++) {
    		cb1.addItem(Integer.toString(i));
    	}
    	for(int i=1;i<=12;i++) {
    		cb2.addItem("Tháng "+Integer.toString(i));
    	}
    	for(int i=2007;i>1940;i--) {
    		cb3.addItem(Integer.toString(i));
    	}
    	JButton bt1 = new JButton("Xong");
    	JButton bt2 = new JButton("Đăng Nhập");
    	JButton bt3 = new JButton("Đăng Ký");
    	JButton bt4 = new JButton("Thoát");
		bt1.setFont( new Font("Arial", 1, 30));
	    bt2.setFont( new Font("Arial",1 , 30));
	    bt3.setFont( new Font("Arial", 1, 30));
	    bt4.setFont( new Font("Arial",1 , 30));
        tf1.setFont( new Font("Arial", 1, 30));
        lb1.setFont( new Font("Arial",1 , 20));
        tf2.setFont( new Font("Arial", 1, 30));
        lb2.setFont( new Font("Arial",1 , 20));
        lb3.setFont( new Font("Arial",1 , 20));
        lb4.setFont( new Font("Arial",1 , 20));
        lb5.setFont( new Font("Arial",1 , 20));
    	bt1.addActionListener(this);
    	bt2.addActionListener(this);
    	bt3.addActionListener(this);
    	bt4.addActionListener(this);
    	bt1.setBackground(Color.GREEN);
    	bt2.setBackground(Color.YELLOW);
    	bt3.setBackground(Color.ORANGE);
    	bt4.setBackground(Color.RED);
    	JPanel pn1 = new JPanel();
    	pn1.setLayout(new GridLayout(3,2));
    	pn1.add(lb1);
    	pn1.add(tf1);
    	pn1.add(lb2);
    	pn1.add(tf2);
    	JPanel pn2 = new JPanel();
    	pn2.setLayout(new GridLayout(1,6));
    	pn2.add(lb3);
    	pn2.add(cb1);
    	pn2.add(lb4);
    	pn2.add(cb2);
    	pn2.add(lb5);
    	pn2.add(cb3);
    	JPanel pn3 = new JPanel();
    	pn3.setLayout(new GridLayout(1,4));
    	pn3.add(bt1);
    	pn3.add(bt2);
    	pn3.add(bt3);
    	pn3.add(bt4);
    	cn1.add(pn1,"North");
    	cn1.add(pn2,"Center");
    	cn1.add(pn3,"South");
    	this.pack();
    	this.setLocationRelativeTo(null);
    	this.setVisible(true);
    	KetNoi kn = new KetNoi();
    	kn.Connec();
    	kn.addtk(list);
    	String i="";
	}
	public void actionPerformed(ActionEvent e) {
		  String i,k;
		    if(e.getActionCommand()=="Đăng Ký") {
				  this.dispose();
				  new DangKy("HHHH");
			  }
			if(e.getActionCommand()=="Đăng Nhập") {
				this.dispose();
				new  DangNhap("HHHH");
			}
			if(e.getActionCommand()==("Thoát")) this.dispose();
				  
	 if(e.getActionCommand()=="Xong") { 
		  boolean kt = false;
		  boolean kn = false;
		  String i1 = null;
		  if(tf1.getText().length()!=0&&tf2.getText().length()!=0) {
			  kn=true;
		  }
		  if(kn) {
		  Enumeration vNum = list.elements();
		  while(vNum.hasMoreElements()) {
			  Tai_Khoan tk = (Tai_Khoan) vNum.nextElement();
			  if (tf1.getText().equals(tk.getUsername())&&tf2.getText().equals(tk.getEmail())) {
				  kt=true;
				  i1 = tk.getMatkhau();
				  break;
			  }
		  }
		  if (kt) {
			  this.dispose();
			  new ThongBao("Mật Khẩu Của Bạn Là '"+i1+"'");
		  } else {
			  new ThongBao("Thông Tin Tài Khoản Không Chính Xác \n Hoặc liên hệ đến Nguyễn Văn Nam Để được hỗ trợ"); 
		  }
		  }
		  else new ThongBao("Vui Lòng Điền Đủ Thông Tin");
	}
	}}
		
	
