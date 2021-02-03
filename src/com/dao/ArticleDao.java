package com.dao;

import com.articlepack.Article;
import java.util.List;

public interface ArticleDao {

	public Article save(Article a);
	public List<Article> articleMc(String mc);
	public Article getArticle(int id);
	public Article update(Article a);
	public void deleteArticle(int id);
	
	
}
