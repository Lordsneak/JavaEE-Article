package com.articlepack;

import java.io.Serializable;

public class Article implements Serializable{
	
	private int id;
	private String nom;
	private String text;
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Article(String nom, String text) {
		super();
		this.nom = nom;
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", nom=" + nom + ", text=" + text + "]";
	}
	
	
	
	
}
