package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import connect.DBConnect;
import model.KhoaHoc_TaiLieu;

public class TaiLieuDAO {
	
	public ArrayList<KhoaHoc_TaiLieu> getListTaiLieuwithKhoaHoc(String makhoahoc) throws SQLException{
		Connection connection = DBConnect.getConnection();
		String sql= "select * from khoahoc,tailieu,tailieukhoahoc where khoahoc.MaKhoaHoc=tailieukhoahoc.MaKhoaHoc and tailieukhoahoc.MaTaiLieu=tailieu.MaTaiLieu and khoahoc.MaKhoaHoc='"+makhoahoc+"'";
		PreparedStatement ps;
		ps = (PreparedStatement) connection.prepareStatement(sql);
		ResultSet rs= ps.executeQuery();
		ArrayList<KhoaHoc_TaiLieu> list = new ArrayList<>();
		while (rs.next()){
			KhoaHoc_TaiLieu khoahoc_tailieu=new KhoaHoc_TaiLieu();
			 khoahoc_tailieu.setMatailieu(rs.getString("MaTaiLieu"));
			 khoahoc_tailieu.setTieude(rs.getString("TieuDe"));
			list.add( khoahoc_tailieu);
		}
		return list;
	}
	
	public static void main(String[] args) throws SQLException{
		TaiLieuDAO tailieu=new TaiLieuDAO();
		/*for(DeThi ds:dethi.getListDeThi())
			System.out.println(ds.getMadethi()+'-'+ds.getTendethi());
		System.out.println(dethi.getListDeThi());*/
		
		//System.out.println(dao.getCauHoi("CH1").getNoidungcauhoi());
		for(KhoaHoc_TaiLieu ds:tailieu.getListTaiLieuwithKhoaHoc("KH01")){
			System.out.println(ds.getMatailieu()+"-"+ds.getTieude());
		}
	}

}
