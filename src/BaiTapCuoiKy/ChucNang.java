package BaiTapCuoiKy;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;
public class ChucNang extends JFrame implements ActionListener {
	Vector list,list2,list3;
	private JButton bt1,bt2,bt3;
	private JPasswordField tf3;
	private JTextField tf1,tf2,tf;
	private JPanel pn1,pn2,pn3;
	private Container cn1;
	private JLabel lb1,lb2,lb3;
  public ChucNang(Vector list,Vector list2,Vector list3) {
	  super("Chức Năng");
	  this.list = list;
	  this.list2=list2;
	  this.list3=list3;
	  Container cn = this.getContentPane();
	  JLabel bt0 = new JLabel("--------------CHƯƠNG TRÌNH----------------");
	  JLabel lb1 = new JLabel(" >>>>QUẢN LÝ HỒ SƠ BỆNH ÁN<<<<");
	  JLabel ln2 = new JLabel("----------MỜI CHỌN CHỨC NĂNG---------");
	  bt0.setFont( new Font("Arial",1 , 30));
	  JButton bt1 = new JButton("XEM THÔNG TIN");
	  JButton bt2 = new JButton("THÊM THÔNG TIN");
	  JButton bt3 = new JButton("SỬA THÔNG TIN");
	  JButton bt4 = new JButton("XÓA THÔNG TIN");
	  JButton bt5 = new JButton("XEM BỆNH ÁN");
	  JButton bt6 = new JButton("SẮP XẾP");
	  JButton bt7 = new JButton("THAY MẬT KHẨU");
	  JButton bt8 = new JButton("THOÁT");
	  bt1.addActionListener(this);
	  bt2.addActionListener(this);
	  bt3.addActionListener(this);
	  bt4.addActionListener(this);
	  bt5.addActionListener(this);
	  bt6.addActionListener(this);
	  bt7.addActionListener(this);
	  bt8.addActionListener(this);
	  bt1.setBackground(Color.YELLOW);
	  bt5.setBackground(Color.YELLOW);
	  bt2.setBackground(Color.GREEN);
	  bt3.setBackground(Color.GREEN);
	  bt4.setBackground(Color.orange);
	  bt6.setBackground(Color.orange);
	  bt7.setBackground(Color.RED);
	  bt8.setBackground(Color.RED);
	  bt1.setFont( new Font("Arial",1 , 30));
      bt2.setFont( new Font("Arial", 1, 30));
      bt3.setFont( new Font("Arial",1 , 30));
      bt4.setFont( new Font("Arial", 1, 30));
      bt5.setFont( new Font("Arial",1 , 30));
      bt6.setFont( new Font("Arial", 1, 30));
      bt7.setFont( new Font("Arial",1 , 30));
      bt8.setFont( new Font("Arial", 1, 30));
      lb1.setFont( new Font("Arial",1 , 30));
      ln2.setFont( new Font("Arial", 1, 30));
	  JPanel pn1 = new JPanel();
	  pn1.setLayout(new GridLayout(3, 1));
	  pn1.add(bt0);
	  pn1.add(lb1);
	  pn1.add(ln2);
	  JPanel pn2 = new JPanel();
	  pn2.setLayout(new GridLayout(4,1));
	  pn2.add(bt1);
	  pn2.add(bt2);
	  pn2.add(bt4);
	  pn2.add(bt7);
	  JPanel pn3 = new JPanel();
	  pn3.setLayout(new GridLayout(4,1));
	  pn3.add(bt5);
	  pn3.add(bt3);
	  pn3.add(bt6);
	  pn3.add(bt8);
	  cn.add(pn1);
	  cn.add(pn3,"West");
	  cn.add(pn2,"East");
	  this.pack();
	  this.setLocationRelativeTo(null);
	  this.setVisible(true);  
  }
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="THOÁT") {
			this.dispose();
	}
		if(e.getActionCommand()=="THÊM THÔNG TIN") {
			this.dispose();
			new Insert("");
	}	
		if(e.getActionCommand()=="SỬA THÔNG TIN") {
			this.dispose();
			new Insert("");
		}
		if (e.getActionCommand()=="XEM THÔNG TIN") {
			new XemBenhNhan(list2);
		}
		if (e.getActionCommand()=="XEM BỆNH ÁN") {
			new XemBenhAn(list3);
		}
	}
}