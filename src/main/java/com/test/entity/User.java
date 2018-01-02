package com.test.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "user")
public class User implements Serializable{
	private String id;
	private String name;
	private String headline;
	private Integer gender;
	private String avatar_Url_Template;
	private String type;
	private String url;
	private Integer answer_Count;
	private Integer articles_Count;
	private Integer follower_Count;
	private String url_Token;
	private String avatar_Url;
	private Date create_time;
	
	@Id
	@Column(name = "id")  
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "name", nullable = true) 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "headline")
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	
	@Column(name = "gender")
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	
	@Column(name = "avatar_Url_Template")
	public String getAvatar_Url_Template() {
		return avatar_Url_Template;
	}
	public void setAvatar_Url_Template(String avatar_Url_Template) {
		this.avatar_Url_Template = avatar_Url_Template;
	}
	
	@Column(name = "type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Column(name = "url")
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Column(name = "answer_Count")
	public Integer getAnswer_Count() {
		return answer_Count;
	}
	public void setAnswer_Count(Integer answer_Count) {
		this.answer_Count = answer_Count;
	}
	
	@Column(name = "articles_Count")
	public Integer getArticles_Count() {
		return articles_Count;
	}
	public void setArticles_Count(Integer articles_Count) {
		this.articles_Count = articles_Count;
	}
	
	@Column(name = "follower_Count")
	public Integer getFollower_Count() {
		return follower_Count;
	}
	public void setFollower_Count(Integer follower_Count) {
		this.follower_Count = follower_Count;
	}
	
	@Column(name = "url_Token")
	public String getUrl_Token() {
		return url_Token;
	}
	public void setUrl_Token(String url_Token) {
		this.url_Token = url_Token;
	}
	
	@Column(name = "avatar_Url")
	public String getAvatar_Url() {
		return avatar_Url;
	}
	public void setAvatar_Url(String avatar_Url) {
		this.avatar_Url = avatar_Url;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time")
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
	public User(){};
	public User(String id, String name, String headline, Integer gender, String avatar_Url_Template, String type,
			String url, Integer answer_Count, Integer articles_Count, Integer follower_Count, String url_Token,
			String avatar_Url, Date create_time) {
		super();
		this.id = id;
		this.name = name;
		this.headline = headline;
		this.gender = gender;
		this.avatar_Url_Template = avatar_Url_Template;
		this.type = type;
		this.url = url;
		this.answer_Count = answer_Count;
		this.articles_Count = articles_Count;
		this.follower_Count = follower_Count;
		this.url_Token = url_Token;
		this.avatar_Url = avatar_Url;
		this.create_time = create_time;
	}
	
}
