package BaiTapCuoiKy;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ThongBao extends JFrame implements ActionListener  {
		private JLabel tb;
		private Button bt;
		private Container cn1; 
		private JPanel pn1,pn2;
		public ThongBao(String j) {
			super ("Thông Báo");
			cn1=this.getContentPane();
			bt = new Button("OK");
			bt.addActionListener(this);;
			bt.setFont(new Font("Arial",1,30));
			bt.setBackground(Color.GREEN);
			tb= new JLabel(j);
			tb.setFont(new Font("Arial", 1, 30));
			pn1=new JPanel();
			pn1.setLayout(new FlowLayout());
			pn2=new JPanel();
			pn2.setLayout(new FlowLayout());
			pn1.add(tb);
			pn2.add(bt);
			cn1.add(pn1);
			cn1.add(pn2,"East");
			cn1.setBackground(Color.RED);
			this.pack();;
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		}
	public void actionPerformed(ActionEvent e) {	
		if(e.getActionCommand()=="OK") {
			this.dispose();
		}
	}
	
}
