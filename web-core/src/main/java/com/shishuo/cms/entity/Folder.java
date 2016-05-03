package com.shishuo.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CMS_FOLDER database table.
 * 
 */
@Entity
@Table(name="CMS_FOLDER")
@NamedQuery(name="Folder.findAll", query="SELECT f FROM Folder f")
public class Folder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_FOLDER_FOLDERID_GENERATOR", sequenceName="CMS_FOLDER_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_FOLDER_FOLDERID_GENERATOR")
	@Column(name="FOLDER_ID", unique=true, nullable=false)
	private long folderId;

	@Column(length=2000)
	private String content;

	@Column(nullable=false)
	private BigDecimal count;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(nullable=false, length=45)
	private String ename;

	@Column(name="FATHER_ID", nullable=false)
	private long fatherId;

	@Column(nullable=false)
	private BigDecimal height;

	@Column(name="IS_CHECK", nullable=false)
	private BigDecimal isCheck;

	@Column(name="LEVEL_ID", nullable=false)
	private BigDecimal levelId;

	@Column(nullable=false, length=200)
	private String name;

	@Column(nullable=false, length=200)
	private String path;

	@Column(nullable=false)
	private BigDecimal sort;

	@Column(nullable=false)
	private BigDecimal status;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIME")
	private Date updateTime;

	@Column(nullable=false)
	private BigDecimal width;

	//bi-directional many-to-many association to Admin
	@ManyToMany(mappedBy="Folders")
	private List<Admin> Admins;

	//bi-directional many-to-one association to Article
	@OneToMany(mappedBy="Folder")
	private List<Article> Articles;

	public Folder() {
	}

	public long getFolderId() {
		return this.folderId;
	}

	public void setFolderId(long folderId) {
		this.folderId = folderId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public BigDecimal getCount() {
		return this.count;
	}

	public void setCount(BigDecimal count) {
		this.count = count;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public long getFatherId() {
		return this.fatherId;
	}

	public void setFatherId(long fatherId) {
		this.fatherId = fatherId;
	}

	public BigDecimal getHeight() {
		return this.height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public BigDecimal getIsCheck() {
		return this.isCheck;
	}

	public void setIsCheck(BigDecimal isCheck) {
		this.isCheck = isCheck;
	}

	public BigDecimal getLevelId() {
		return this.levelId;
	}

	public void setLevelId(BigDecimal levelId) {
		this.levelId = levelId;
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

	public BigDecimal getSort() {
		return this.sort;
	}

	public void setSort(BigDecimal sort) {
		this.sort = sort;
	}

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public BigDecimal getWidth() {
		return this.width;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}

	public List<Admin> getAdmins() {
		return this.Admins;
	}

	public void setAdmins(List<Admin> Admins) {
		this.Admins = Admins;
	}

	public List<Article> getArticles() {
		return this.Articles;
	}

	public void setArticles(List<Article> Articles) {
		this.Articles = Articles;
	}

	public Article addArticle(Article Article) {
		getArticles().add(Article);
		Article.setFolder(this);

		return Article;
	}

	public Article removeArticle(Article Article) {
		getArticles().remove(Article);
		Article.setFolder(null);

		return Article;
	}

}