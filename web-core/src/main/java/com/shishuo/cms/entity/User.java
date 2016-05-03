package com.shishuo.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CMS_USER database table.
 * 
 */
@Entity
@Table(name="CMS_USER")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_USER_USERID_GENERATOR", sequenceName="CMS_USER_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_USER_USERID_GENERATOR")
	@Column(name="USER_ID", unique=true, nullable=false)
	private long userId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(length=200)
	private String name;

	@Column(name="OPEN_ID")
	private BigDecimal openId;

	private BigDecimal type;

	//bi-directional many-to-one association to Comment
	@OneToMany(mappedBy="User")
	private List<Comment> Comments;

	public User() {
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getOpenId() {
		return this.openId;
	}

	public void setOpenId(BigDecimal openId) {
		this.openId = openId;
	}

	public BigDecimal getType() {
		return this.type;
	}

	public void setType(BigDecimal type) {
		this.type = type;
	}

	public List<Comment> getComments() {
		return this.Comments;
	}

	public void setComments(List<Comment> Comments) {
		this.Comments = Comments;
	}

	public Comment addComment(Comment Comment) {
		getComments().add(Comment);
		Comment.setUser(this);

		return Comment;
	}

	public Comment removeComment(Comment Comment) {
		getComments().remove(Comment);
		Comment.setUser(null);

		return Comment;
	}

}