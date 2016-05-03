package com.shishuo.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CMS_COMMENT database table.
 * 
 */
@Entity
@Table(name="CMS_COMMENT")
@NamedQuery(name="Comment.findAll", query="SELECT c FROM Comment c")
public class Comment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_COMMENT_COMMENTID_GENERATOR", sequenceName="CMS_COMMENT_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_COMMENT_COMMENTID_GENERATOR")
	@Column(name="COMMENT_ID", unique=true, nullable=false)
	private long commentId;

	@Column(length=2000)
	private String content;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(length=45)
	private String email;

	@Column(name="FATHER_ID")
	private long fatherId;

	@Column(length=45)
	private String ip;

	@Column(length=45)
	private String name;

	@Column(precision=20)
	private BigDecimal phone;

	@Column(length=20)
	private String status;

	@Column(length=200)
	private String url;

	//bi-directional many-to-one association to Article
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ARTICLE_ID")
	private Article Article;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	private User User;

	public Comment() {
	}

	public long getCommentId() {
		return this.commentId;
	}

	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getFatherId() {
		return this.fatherId;
	}

	public void setFatherId(long fatherId) {
		this.fatherId = fatherId;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPhone() {
		return this.phone;
	}

	public void setPhone(BigDecimal phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Article getArticle() {
		return this.Article;
	}

	public void setArticle(Article Article) {
		this.Article = Article;
	}

	public User getUser() {
		return this.User;
	}

	public void setUser(User User) {
		this.User = User;
	}

}