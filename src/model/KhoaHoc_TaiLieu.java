package model;

public class KhoaHoc_TaiLieu {

	private String makhoahoc;
	private String matailieu;
	private String tieude;
	public KhoaHoc_TaiLieu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhoaHoc_TaiLieu(String makhoahoc, String matailieu, String tieude) {
		super();
		this.makhoahoc = makhoahoc;
		this.matailieu = matailieu;
		this.tieude = tieude;
	}
	public String getMakhoahoc() {
		return makhoahoc;
	}
	public void setMakhoahoc(String makhoahoc) {
		this.makhoahoc = makhoahoc;
	}
	public String getMatailieu() {
		return matailieu;
	}
	public void setMatailieu(String matailieu) {
		this.matailieu = matailieu;
	}
	public String getTieude() {
		return tieude;
	}
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}
	
	
}
