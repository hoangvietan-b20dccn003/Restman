package model;

import java.util.Date;

public class HoaDonNhap122 {
	private int id;
	private int thanhtien;
	private Date ngaythangnhap;
	private NguyenLieuNhap122 [] nlnhap;
	private NhanVienKho122 nvnhap;
	public HoaDonNhap122() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoaDonNhap122(int id, Date ngaythangnhap, NguyenLieuNhap122[] nlnhap,
			NhanVienKho122 nvnhap) {
		super();
		this.id = id;
		this.ngaythangnhap = ngaythangnhap;
		this.nlnhap = nlnhap;
		int thanhtien = 0;
		for(NguyenLieuNhap122 x : nlnhap) {
			thanhtien = x.getDongia()*x.getSoluong();
		}
		this.thanhtien = thanhtien;
		this.nvnhap = nvnhap;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public int getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(int thanhtien) {
		this.thanhtien = thanhtien;
	}
	public Date getNgaythangnhap() {
		return ngaythangnhap;
	}
	public void setNgaythangnhap(Date ngaythangnhap) {
		this.ngaythangnhap = ngaythangnhap;
	}
	public NguyenLieuNhap122[] getNlnhap() {
		return nlnhap;
	}
	public void setNlnhap(NguyenLieuNhap122[] nlnhap) {
		this.nlnhap = nlnhap;
	}
	public NhanVienKho122 getNvnhap() {
		return nvnhap;
	}
	public void setNvnhap(NhanVienKho122 nvnhap) {
		this.nvnhap = nvnhap;
	}
	
}
