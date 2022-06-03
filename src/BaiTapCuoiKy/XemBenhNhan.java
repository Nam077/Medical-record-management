package BaiTapCuoiKy;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;
public class XemBenhNhan extends JFrame implements KeyListener{
	Vector list2;
	Vector vD = new Vector();
	Vector vT = new Vector();
	JScrollPane jsc;
	DefaultTableModel model;
	JTable tb;
	Container cn;
	public XemBenhNhan(Vector list2) {
		super("Danh Sach Bệnh Nhân");
		cn = this.getContentPane();
		try {
			vT.clear();
			vD.clear();
			vT.add("Họ Tên");
			vT.add("Địa Chỉ");
			vT.add("Số CMND");
			vT.add("Số Điện Thoại");
			vT.add("Tên Bệnh");
			Enumeration vNum = list2.elements();
			while (vNum.hasMoreElements()) {
				Vector vo = new Vector();
				ThongTin tt = (ThongTin) vNum.nextElement();
				vo.add(tt.getTenbn());
				vo.add(tt.getDiachi());
				vo.add(tt.getCmnd());
				vo.add(tt.getSdt());
				vo.add(tt.getBenh());
				vD.add(vo);
			}
		}catch (Exception e) {
		}
		try {
			model = new DefaultTableModel(vD, vT);
			tb = new JTable(model);
			tb.addKeyListener(this);
			jsc = new JScrollPane(tb);
			cn.add(jsc,"North");
			this.setVisible(true);
			this.setSize(1000, 500);
			this.setLocationRelativeTo(null);
			
		}catch (Exception e) {
			System.out.println("ml");
		}
	}
	public void keyPressed(KeyEvent e) {
		
	}
	public void keyReleased(KeyEvent e) {
		
	}
	public void keyTyped(KeyEvent e) {
		
	}
}
