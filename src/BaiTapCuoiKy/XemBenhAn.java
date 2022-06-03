package BaiTapCuoiKy;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;
public class XemBenhAn extends JFrame implements KeyListener{
	Vector list3;
	Vector vD = new Vector();
	Vector vT = new Vector();
	JScrollPane jsc;
	DefaultTableModel model;
	JTable tb;
	Container cn;
	public XemBenhAn(Vector list3) {
		super("Danh Sach Bệnh Án");
		this.list3=list3;
		cn = this.getContentPane();
		try {
			vT.clear();
			vD.clear();
			vT.add("Tiền");
			vT.add("Bác Sĩ Phụ Trách");
			vT.add("Ngày Vào");
			vT.add("Ngày Ra");
			Enumeration vNum = list3.elements();
			while (vNum.hasMoreElements()) {
				Vector vo = new Vector();
				Thong_Tin2 tt = (Thong_Tin2) vNum.nextElement();
				vo.add(tt.getTien());
				vo.add(tt.getBacsi());
				vo.add(tt.getNgayvao());
				vo.add(tt.getNgayra());
				vD.add(vo);
			}
		}catch (Exception e) {
		}
		try {
			model = new DefaultTableModel(vD, vT);
			tb = new JTable(model);
			tb.addKeyListener(this);
			jsc = new JScrollPane(tb);
			cn.add(jsc,"South");
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
