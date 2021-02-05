package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.articlepack.Article;
import com.database.SingletonConnection;

public class ArticleDaoImp implements ArticleDao {

	@Override
	public Article save(Article a) {
		Connection connection = SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps = connection.prepareStatement
					("INSERT INTO articles(nom,text) VALUES (?,?)");
			ps.setString(1, a.getNom());
			ps.setString(2, a.getText());
			ps.executeUpdate();
			PreparedStatement ps2 = connection.prepareStatement
			("SELECT MAX(id) AS MAX_id FROM articles");
			ResultSet rs=ps2.executeQuery();
			while(rs.next()) {
				a.setId(rs.getInt("MAX_id"));
			}
			
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public List<Article> articleMc(String mc) {
		List <Article> articles = new ArrayList<Article>();
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement
					("SELECT * FROM Articles WHERE nom LIKE ?");
			ps.setString(1, mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Article a = new Article();
				a.setId(rs.getInt("id"));
				a.setNom(rs.getString("nom"));
				a.setText(rs.getString("text"));
				articles.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return articles;
	}

	@Override
	public Article getArticle(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article update(Article a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteArticle(int id) {
		// TODO Auto-generated method stub
		
	}

}
