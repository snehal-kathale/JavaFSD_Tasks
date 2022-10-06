package com.starhealth.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.starhealth.ems.bean.Sports;

public class SportsDaoImp implements ISportsDAO {

	Connection conn = DBUtil.getDBConnection();
	
	@Override
	public int addSports(Sports sp) {
		
		int count = 0;

		try {
			String insertQuery = "insert into sports(sid,sname,svalue,type) values(?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, sp.getsid());
			pstmt.setString(2, sp.getsname());
			pstmt.setDouble(3, sp.getsvalue());
			pstmt.setString(4, sp.gettype());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
		
		
	}

	@Override
	public int updateSports(Sports sp) {
		
		
		int count = 0;

		try {
			String updateQuery = "update sports set sname =? , svalue = ? where sid = ?";
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setString(1, sp.getsname());
			pstmt.setDouble(2, sp.getsvalue());
			pstmt.setInt(3, sp.getsid());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
		
	}

	@Override
	public int deleteSportsById(int sid) {
		String deleteQuery = "delete from sports where sid = ?";

		PreparedStatement pstmt;
		int deleteCount = 0;
		try {
			pstmt = conn.prepareStatement(deleteQuery);

			pstmt.setInt(1, sid);

			deleteCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return deleteCount;
	}

	@Override
	public Sports selectSportsById(int sid) {
		String selectQuery = "select * from sports where sid = ?";

		PreparedStatement pstmt;

		Sports sp = new Sports();

		try {
			pstmt = conn.prepareStatement(selectQuery);

			pstmt.setInt(1, sid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				sp.setsid(rs.getInt("sid"));
				sp.setsname(rs.getString("sname"));
				sp.setsvalue(rs.getDouble("svalue"));
				sp.settype(rs.getString("type"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sp;

	}

	@Override
	public List<Sports> selectAllSports() {
		String selectQuery = "select * from sports";

		PreparedStatement pstmt;

		List<Sports> list = new ArrayList<Sports>();
		
		try {
			pstmt = conn.prepareStatement(selectQuery);

			ResultSet rs = pstmt.executeQuery();

			

			while (rs.next()) {

				Sports sp = new Sports();
				sp.setsid(rs.getInt("sid"));
				sp.setsname(rs.getString("sname"));
				sp.setsvalue(rs.getDouble("svalue"));
				sp.settype(rs.getString("type"));

				list.add(sp);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return list;
	}

}
