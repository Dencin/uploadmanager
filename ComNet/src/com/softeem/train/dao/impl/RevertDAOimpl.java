package com.softeem.train.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.softeem.train.dao1.RevertDAO;
import com.softeem.train.db.util.DBManager;
import com.softeem.train.dto.MessageDTO;
import com.softeem.train.dto.RevertDTO;

public class RevertDAOimpl implements RevertDAO {

	public boolean revert(RevertDTO rt) {
		boolean flag=false;
		Connection conn = null;
		PreparedStatement ps= null;
		
		try {
		conn=DBManager.getConn();
		String sql="insert into REVERTS(messageID,content,writer,writeDate) values(?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,rt.getMessageID());
			ps.setString(2,rt.getContent());
			ps.setString(3, rt.getWriter());
			ps.setString(4, rt.getWriteDate());
			flag=!ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return flag;
	}

	public RevertDTO findInfoById(int messageID) {
		RevertDTO rt=new RevertDTO();
		Connection conn = null;
		PreparedStatement ps= null;
		ResultSet rs=null;
		try {
		
		conn=DBManager.getConn();
		String sql="select * from REVERTS where messageID=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,messageID);
			rs=ps.executeQuery();
			while(rs.next()){
				rt.setMessageID(messageID);
				rt.setContent(rs.getString("content"));
				rt.setWriter(rs.getString("writer"));
				rt.setWriteDate(rs.getString("writeDate"));
				rt.setRevertID(rs.getInt("revertID"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rt;
	}

}
