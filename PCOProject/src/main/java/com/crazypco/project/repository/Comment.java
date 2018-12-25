package com.crazypco.project.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.crazypco.project.entity.Article;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Comment {

	@Id	@GeneratedValue
	private int id;

	private String nickname;

	@JsonIgnore // ?��꾨�踰덊?���뒗 cdlient�뿉 �쟾�떖�씠 �븞�릺�룄濡� �븳�떎.(jackson annotation)
	private String password;

	private String content;
	
	private Date addDate = new Date();

	@ManyToOne
	@JoinColumn(name = "ARTICLE_ID")
	private Article article;

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
}
