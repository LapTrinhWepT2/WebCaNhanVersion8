package model;

import java.sql.Date;
import java.time.DateTimeException;

public class BaiTap {
	private String mabaitap;
	private String tenbaitap;
	private String noidungbaitap;
	private String linkbaitap;
	private Date hanchot;
	
	public BaiTap() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaiTap(String mabaitap, String tenbaitap, String noidungbaitap, String linkbaitap, Date hanchot) {
		super();
		this.mabaitap = mabaitap;
		this.tenbaitap = tenbaitap;
		this.noidungbaitap = noidungbaitap;
		this.linkbaitap = linkbaitap;
		this.hanchot = hanchot;
	}
	public String getMabaitap() {
		return mabaitap;
	}
	public void setMabaitap(String mabaitap) {
		this.mabaitap = mabaitap;
	}
	public String getTenbaitap() {
		return tenbaitap;
	}
	public void setTenbaitap(String tenbaitap) {
		this.tenbaitap = tenbaitap;
	}
	public String getNoidungbaitap() {
		return noidungbaitap;
	}
	public void setNoidungbaitap(String noidungbaitap) {
		this.noidungbaitap = noidungbaitap;
	}
	public String getLinkbaitap() {
		return linkbaitap;
	}
	public void setLinkbaitap(String linkbaitap) {
		this.linkbaitap = linkbaitap;
	}
	public Date getHanchot() {
		return hanchot;
	}
	public void setHanchot(Date hanchot) {
		this.hanchot = hanchot;
	}
	
	
	

}
