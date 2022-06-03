package BaiTapCuoiKy;
class Tai_Khoan {
	private String username;
	private String matkhau;
	private String hoten;
	private String email;
	private String ngaysinh;
	private String thangsinh;
	private String namsinh;
	public Tai_Khoan() {
		username ="";
		matkhau="";
		hoten= "";
		email="";
		ngaysinh="";
		thangsinh="";
		namsinh="";
	}
	public Tai_Khoan(String a,String b,String c,String d,String e) {
		username =a;
		matkhau=b;
		hoten= c;
		email=d;
		ngaysinh=e;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String a) {
		this.username = a;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String b) {
		this.matkhau = b;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String c) {
		this.hoten = c;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String c) {
		this.email = c;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String e) {
		this.ngaysinh = e;
	}
	public String getThangsinh() {
		return thangsinh;
	}
	public void setThangsinh(String f) {
		this.thangsinh = f;
	}
	public String getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(String t) {
		this.namsinh = t;
	}
}
