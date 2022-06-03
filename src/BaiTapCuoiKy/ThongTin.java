package BaiTapCuoiKy;
class ThongTin {
		private String tenbn;
		private String cmnd;
		private String diachi;
		private String sdt;
		private String benh;
		public ThongTin() {
			tenbn="";
			cmnd="";
			diachi="";
			sdt="";
			benh="";
		}
		public ThongTin(String q,String r,String y,String l,String m) {
			tenbn=q;
			cmnd=r;
			diachi=y;
			sdt=l;
			benh=m;
			
		}
		public String getTenbn() {
			return tenbn;
		}
		public void setTenbn(String q) {
			this.tenbn = q;
		}
		public String getCmnd() {
			return cmnd;
		}
		public void setCmnd(String r) {
			this.cmnd = r;
		}
		public String getDiachi() {
			return diachi;
		}
		public void setDiachi(String y) {
			this.diachi = y;
		}
		public String getSdt() {
			return sdt;
		}
		public void setSdt(String l) {
			this.sdt = l;
		}
		public String getBenh() {
			return benh;
		}
		public void setBenh(String m) {
			this.benh = m;
		}
		
}
