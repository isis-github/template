package com.shishuo.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CMS_MEDIA database table.
 * 
 */
@Entity
@Table(name="CMS_MEDIA")
@NamedQuery(name="Media.findAll", query="SELECT m FROM Media m")
public class Media implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_MEDIA_MEDIAID_GENERATOR", sequenceName="CMS_MEDIA_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_MEDIA_MEDIAID_GENERATOR")
	@Column(name="MEDIA_ID", unique=true, nullable=false)
	private long mediaId;

	@Column(name="ARTICLE_TITLE", length=200)
	private String articleTitle;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	private BigDecimal length;

	@Column(length=200)
	private String name;

	@Column(length=200)
	private String path;

	@Column(length=50)
	private String type;

	//bi-directional many-to-one association to Article
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ARTICLE_ID", nullable=false)
	private Article Article;

	public Media() {
	}

	public long getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(long mediaId) {
		this.mediaId = mediaId;
	}

	public String getArticleTitle() {
		return this.articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigDecimal getLength() {
		return this.length;
	}

	public void setLength(BigDecimal length) {
		this.length = length;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Article getArticle() {
		return this.Article;
	}

	public void setArticle(Article Article) {
		this.Article = Article;
	}

}