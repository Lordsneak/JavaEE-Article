package com.dao;

import java.util.List;

import com.articlepack.Article;

public class TestDao {

	public static void main(String[] args) {
		ArticleDaoImp dao = new ArticleDaoImp();
		
		System.out.println("List Article");
		
		List<Article> listArticle = dao.articleMc("%H%");
		for(Article a :listArticle) {
			System.out.println(a.toString());
		}
		
	}

}
