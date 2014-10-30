package com.softeem.train.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.softeem.train.dao1.NewsDAO;
import com.softeem.train.db.util.DBManager;
import com.softeem.train.dto.NewsDTO;

public class NewsDAOimpl implements NewsDAO {

	public List<NewsDTO> allNews(int currentpage){
		//System.out.println("*********");
		List<NewsDTO> list=new ArrayList<NewsDTO>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConn();
			String sql = "select top 5 * from NEWS where newsID not in(select top "+(currentpage*5)+" newsID from NEWS order by writerDate desc ) order by writerDate desc";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				NewsDTO nd = new NewsDTO();
				// 将数据风封装到emp对象中
				nd.setNewsID(rs.getInt("newsID"));
				nd.setTitle(rs.getString("title"));
				nd.setContent(rs.getString("content"));
				nd.setWriterDate(rs.getString("writerDate"));
				// list在存放数据的时候，存放的是引用地址
				list.add(nd);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int countpage(){

		int countpage = 0;
		// 相关操作
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConn();
			String sql = "select count(*) from NEWS";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				countpage = rs.getInt(1);
			}
			//
			if (countpage % 5 != 0) {
				countpage = countpage / 5 + 1;
			} else {
				countpage = countpage / 5;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return countpage;
	
		
		
	}
	
	public List<NewsDTO> allNews1(int currentpage){
		//System.out.println("*********");
		List<NewsDTO> list=new ArrayList<NewsDTO>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConn();
			String sql = "select top 5 * from NEWS where newsID in(select top "+(currentpage*5)+" newsID from NEWS order by writerDate desc ) order by writerDate desc";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				NewsDTO nd = new NewsDTO();
				// 将数据风封装到emp对象中
				nd.setNewsID(rs.getInt("newsID"));
				nd.setTitle(rs.getString("title"));
				nd.setContent(rs.getString("content"));
				nd.setWriterDate(rs.getString("writerDate"));
				// list在存放数据的时候，存放的是引用地址
				list.add(nd);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	
		
	}

	public NewsDTO newsByID(int newsID) {
		NewsDTO nt=new NewsDTO();
		Connection conn = null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		
		try {
		conn = DBManager.getConn();
		String sql="select * from NEWS where newsID=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, newsID);
			rs=ps.executeQuery();
			while(rs.next()){
				nt.setNewsID(newsID);
				nt.setTitle(rs.getString("title"));
				nt.setContent(rs.getString("content"));
				nt.setWriterDate("writerDate");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		
		return nt;
	}

	public boolean addNews(NewsDTO nt) {
		boolean flag=false;
		Connection conn = null;
		PreparedStatement ps= null;
		
		try {
		conn=DBManager.getConn();
		String sql="insert into NEWS(title,content,writerDate) values(?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1,nt.getTitle());
			ps.setString(2,nt.getContent());
			ps.setString(3, nt.getWriterDate());
			flag=!ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return flag;
	}

	public boolean deleteByID(int newsID) {
		boolean flag=false;
		Connection conn = null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		
		try {
		conn=DBManager.getConn();
		String sql="delete from NEWS where newsID=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, newsID);
			flag=!ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
