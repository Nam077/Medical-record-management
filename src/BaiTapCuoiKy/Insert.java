package BaiTapCuoiKy;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;
public class Insert  extends JFrame implements ActionListener {
	private JButton bt1,bt2,bt3;
	Vector list = new Vector();
	Vector list2 = new Vector();
	Vector list3 = new Vector();
	private JTextField tf1,tf2,tf;
	private JPanel pn1,pn2,pn3;
	private Container cn1;
	private JLabel lb1,lb2,lb3;
	private Choice n,n1;
  public Insert(String s) {
	  super(s);
	Container cn1 = this.getContentPane();
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JTextField tf3 = new JTextField();
	JTextField tf4 = new JTextField();
	JTextField tf5 = new JTextField();
	JTextField tf6 = new JTextField();
	JTextField tf7 = new JTextField();
	JLabel lb1 = new JLabel("Tên Bệnh Nhân");
	JLabel lb2 = new JLabel("Số CMND");
	JLabel lb3 = new JLabel("Địa Chỉ");
	JLabel lb4 = new JLabel("SĐT");
	JLabel lb5 = new JLabel("Bệnh");
	JLabel lb6 = new JLabel("Tiền Viện Phí");
	JLabel lb7 = new JLabel("Bác Sĩ Phụ Trách");
	JLabel n1a = new JLabel("Ngày Sinh");
	JLabel lb9 = new JLabel("Ngày Vào Viện");
	JLabel lb10 = new JLabel("Ngày Ra Viện");
	Choice n1 = new Choice();
	Choice n2 = new Choice();
	Choice n3 = new Choice();
	Choice n4 = new Choice();
	Choice n5 = new Choice();
	Choice n6 = new Choice();
	Choice n7 = new Choice();
	Choice n8 = new Choice();
	Choice n9 = new Choice();
	JButton bt1 = new JButton("Xong");
	JButton bt2 = new JButton("Trở Lại");
	JButton bt3 = new JButton("Thoát");
	JButton bt4 = new JButton("Làm Mới");
	bt1.addActionListener(this);
	bt2.addActionListener(this);
	bt3.addActionListener(this);
	bt4.addActionListener(this);
	for(int i=1;i<=31;i++) {
		n1.addItem(Integer.toString(i));
	}
	for(int i=1;i<=12;i++) {
		n2.addItem("Tháng "+Integer.toString(i));
	}
	for(int i=2007;i>1940;i--) {
		n3.addItem(Integer.toString(i));
	}
	for(int i=1;i<=31;i++) {
		n4.addItem(Integer.toString(i));
	}
	for(int i=1;i<=12;i++) {
		n5.addItem("Tháng "+Integer.toString(i));
	}
	for(int i=2007;i>1940;i--) {
		n6.addItem(Integer.toString(i));
	}
	for(int i=1;i<=31;i++) {
		n7.addItem(Integer.toString(i));
	}
	for(int i=1;i<=12;i++) {
		n8.addItem("Tháng "+Integer.toString(i));
	}
	for(int i=2007;i>1940;i--) {
		n9.addItem(Integer.toString(i));
	}
	JPanel pn1 = new JPanel();
	pn1.setLayout(new GridLayout(7,2));
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
	pn1.add(lb6);
	pn1.add(tf6);
	pn1.add(lb7);
	pn1.add(tf7);
	JPanel pn2 = new JPanel();
	pn2.setLayout(new GridLayout(1,4));
	pn2.add(n1a);
	pn2.add(n1);
	pn2.add(n2);
	pn2.add(n3);
	JPanel pn5 = new JPanel();
	pn5.setLayout(new GridLayout(3,4));
	pn5.add(lb9);
	pn5.add(n4);
	pn5.add(n5);
	pn5.add(n6);
	pn5.add(lb10);
	pn5.add(n7);
	pn5.add(n8);
	pn5.add(n9);
	pn5.add(bt1);
	pn5.add(bt4);
	pn5.add(bt2);
	pn5.add(bt3);
	cn1.add(pn1,"North");
	cn1.add(pn2,"Center");
	cn1.add(pn5,"South");
	this.setSize(400,290);
	this.setLocationRelativeTo(null);
	this.setVisible(true);
	KetNoi kn = new KetNoi();
	kn.Connec();
	kn.addtk(list);
	kn.addbn(list2);
	kn.addba(list3);
	}
 public void actionPerformed(ActionEvent e) {
	 if(e.getActionCommand()==("Thoát")) this.dispose();
	  if(e.getActionCommand()=="Xong") { 
		  this.dispose();
	  }
	  if(e.getActionCommand()=="Trở Lại") { 
		  this.dispose();
		  new ChucNang(list,list2,list3);
	  }
	  if(e.getActionCommand()=="Làm Mới") { 
		  this.dispose();
		  new Insert("fff");
       }
  }
}
