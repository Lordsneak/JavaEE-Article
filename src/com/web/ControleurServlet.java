package com.web;



import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

import com.articlepack.Article;
import com.dao.ArticleDao;
import com.dao.ArticleDaoImp;


//@WebServlet (name="cs",urlPatterns= {"/","*.do"})
public class ControleurServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArticleDao metier;
	
	@Override
		public void init() throws ServletException {
		
		metier = new ArticleDaoImp();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path=req.getServletPath();
		if(path.equals("/index.do")) {
			req.getRequestDispatcher("articles.jsp").forward(req, resp);
		}
		else if(path.equals("/chercher.do")){
			String motCle=req.getParameter("motCle");
			ArticleModel model=new ArticleModel();
			model.setMotCle(motCle);
			List<Article> articles=metier.articleMc("%"+motCle+"%");
			model.setArticles(articles);
			req.setAttribute("model", model);
			req.getRequestDispatcher("articles.jsp").forward(req, resp);
		}
		//super.doGet(req, resp);

	}

	}
