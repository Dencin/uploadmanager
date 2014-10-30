package com.softeem.train.dao1;

import java.util.List;

import com.softeem.train.dto.NewsDTO;

public interface NewsDAO {
	public List<NewsDTO> allNews(int currentpage);

	public int countpage();

	public List<NewsDTO> allNews1(int currentpage);

	public NewsDTO newsByID(int newsID);

	public boolean addNews(NewsDTO nt);

	public boolean deleteByID(int newsID);

}
