package com.dao;

import java.util.List;

import com.articlepack.Article;

public class TestDao {

	public static void main(String[] args) {
		ArticleDaoImp dao = new ArticleDaoImp();
		Article p1 = dao.save(new Article("The Book2","TEST SSSS"));
		
		System.out.println("List Article");
		System.out.println(p1.toString());
		
		List<Article> listArticle = dao.articleMc("%H%");
		for(Article a :listArticle) {
			System.out.println(a.toString());
		}
		
	}

}
