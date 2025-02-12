package model;

import java.util.Date;

public class NhanVien122 extends ThanhVien122 {
	private String vitri;

	public NhanVien122() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien122(int id, String ten, String username, String password, String diachi, Date ngaysinh, String email,
			String sodienthoai) {
		super(id, ten, username, password, diachi, ngaysinh, email, sodienthoai);
		// TODO Auto-generated constructor stub
	}

	public NhanVien122(String vitri) {
		super();
		this.vitri = vitri;
	}

	public String getVitri() {
		return vitri;
	}

	public void setVitri(String vitri) {
		this.vitri = vitri;
	}
	
}
