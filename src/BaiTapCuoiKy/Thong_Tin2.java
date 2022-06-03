package BaiTapCuoiKy;

class Thong_Tin2 {
	private int tien;
	private String bacsi;
	private String ngayvao;
	private String ngayra;
	public Thong_Tin2() {
		tien=0;
		bacsi="";
		ngayvao="";
		ngayra="";
	}
	public Thong_Tin2(int j,String x,String n,String k) {
		tien=j;
		bacsi=x	;
		ngayvao=n;
		ngayra=k;													
	}
	public int getTien() {
		return tien;
	}
	public void setTien(int j) {
		this.tien = j;
	}
	public String getBacsi() {
		return bacsi;
	}
	public void setBacsi(String x) {
		this.bacsi = x;
	}
	public String getNgayvao() {
		return ngayvao;
	}
	public void setNgayvao(String n) {
		this.ngayvao = n;
	}
	public String getNgayra() {
		return ngayra;
	}
	public void setNgayra(String k) {
		this.ngayra = k;
	
	}
}
