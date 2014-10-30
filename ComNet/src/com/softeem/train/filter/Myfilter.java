package com.softeem.train.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.softeem.train.dto.AdminDTO;

public class Myfilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		// 将我们的request对象强转HttpServletRequest
		HttpServletRequest hsr = (HttpServletRequest) request;
		String uri = hsr.getRequestURI();
		int a = uri.lastIndexOf("/");
		String new_uri = uri.substring(a);
//		System.out.println("我是过滤器");
		if("AddManager.java".equals(new_uri)
		 ||"ValiLogin.java".equals(new_uri)
		 ||"AddNews.java".equals(new_uri)
		 ||"login.jsp".equals(new_uri)
		){
			request.getRequestDispatcher("error.jsp").forward(request, response);
		} else {
			chain.doFilter(request, response);
		}

		// 获取客户端的地址
		// String readdr=request.getRemoteAddr();
		// System.out.println(readdr);
		// chain.doFilter(request, response);
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
