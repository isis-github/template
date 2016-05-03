package com.shishuo.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CMS_ARTICLE database table.
 * 
 */
@Entity
@Table(name="CMS_ARTICLE")
@NamedQuery(name="Article.findAll", query="SELECT a FROM Article a")
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_ARTICLE_ARTICLEID_GENERATOR", sequenceName="CMS_ARTICLE_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_ARTICLE_ARTICLEID_GENERATOR")
	@Column(name="ARTICLE_ID", unique=true, nullable=false)
	private long articleId;

	@Column(name="COMMENT_COUNT", nullable=false)
	private BigDecimal commentCount;

	@Lob
	private String content;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(name="IS_CHECK", nullable=false)
	private BigDecimal isCheck;

	@Column(length=200)
	private String path;

	@Column(length=60)
	private String piture;

	@Column(nullable=false)
	private BigDecimal status;

	@Column(length=2000)
	private String summary;

	@Column(nullable=false, length=200)
	private String title;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIME")
	private Date updateTime;

	@Column(name="VIEW_COUNT", nullable=false)
	private BigDecimal viewCount;

	//bi-directional many-to-one association to Comment
	@OneToMany(mappedBy="Article")
	private List<Comment> Comments;

	//bi-directional many-to-one association to Media
	@OneToMany(mappedBy="Article")
	private List<Media> Medias;

	//uni-directional many-to-one association to Admin
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ADMIN_ID", nullable=false)
	private Admin Admin;

	//bi-directional many-to-one association to Folder
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FOLDER_ID")
	private Folder Folder;

	public Article() {
	}

	public long getArticleId() {
		return this.articleId;
	}

	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}

	public BigDecimal getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(BigDecimal commentCount) {
		this.commentCount = commentCount;
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

	public BigDecimal getIsCheck() {
		return this.isCheck;
	}

	public void setIsCheck(BigDecimal isCheck) {
		this.isCheck = isCheck;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPiture() {
		return this.piture;
	}

	public void setPiture(String piture) {
		this.piture = piture;
	}

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public BigDecimal getViewCount() {
		return this.viewCount;
	}

	public void setViewCount(BigDecimal viewCount) {
		this.viewCount = viewCount;
	}

	public List<Comment> getComments() {
		return this.Comments;
	}

	public void setComments(List<Comment> Comments) {
		this.Comments = Comments;
	}

	public Comment addComment(Comment Comment) {
		getComments().add(Comment);
		Comment.setArticle(this);

		return Comment;
	}

	public Comment removeComment(Comment Comment) {
		getComments().remove(Comment);
		Comment.setArticle(null);

		return Comment;
	}

	public List<Media> getMedias() {
		return this.Medias;
	}

	public void setMedias(List<Media> Medias) {
		this.Medias = Medias;
	}

	public Media addMedia(Media Media) {
		getMedias().add(Media);
		Media.setArticle(this);

		return Media;
	}

	public Media removeMedia(Media Media) {
		getMedias().remove(Media);
		Media.setArticle(null);

		return Media;
	}

	public Admin getAdmin() {
		return this.Admin;
	}

	public void setAdmin(Admin Admin) {
		this.Admin = Admin;
	}

	public Folder getFolder() {
		return this.Folder;
	}

	public void setFolder(Folder Folder) {
		this.Folder = Folder;
	}

}