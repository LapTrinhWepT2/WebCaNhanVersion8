package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;
import model.BaiTap;

import connect.DBConnect;
import model.KhoaHoc;

public class BaiTapDAO {
	
	public ArrayList<BaiTap> getListBaiTap() throws SQLException{
		Connection connection = DBConnect.getConnection();
		String sql= "select * from baitap";
		PreparedStatement ps;
		ps = (PreparedStatement) connection.prepareStatement(sql);
		ResultSet rs= ps.executeQuery();
		ArrayList<BaiTap> list = new ArrayList<>();
		while (rs.next()){
			BaiTap baitap=new BaiTap();
			baitap.setMabaitap(rs.getString("MaBaiTap"));
			baitap.setTenbaitap(rs.getString("TenBaiTap"));
			baitap.setNoidungbaitap(rs.getString("NoiDungBaiTap"));
			baitap.setLinkbaitap(rs.getString("LinkBaiTap"));
			baitap.setHanchot(rs.getDate("HanChot"));
			list.add(baitap);
		}
		return list;
	}
	
	public static void main(String[] args) throws SQLException{
		BaiTapDAO baitap=new BaiTapDAO();
		for(BaiTap ds:baitap.getListBaiTap())
			System.out.println(ds.getTenbaitap()+'-'+ds.getNoidungbaitap());
		//System.out.println(dethi.getListDeThi());
		//System.out.println(dao.getCauHoi("CH1").getNoidungcauhoi());
		/*for(CauHoi ds:dao.getListCauHoitheomacauhoi("CH01")){
			System.out.println(ds.getNoidungcauhoi()+"-"+ds.getLuachon1());
		}*/
	}

}
