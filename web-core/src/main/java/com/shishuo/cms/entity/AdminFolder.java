package com.shishuo.cms.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the CMS_ADMIN_FOLDER database table.
 * 
 */
@Entity
@Table(name="CMS_ADMIN_FOLDER")
@NamedQuery(name="AdminFolder.findAll", query="SELECT a FROM AdminFolder a")
public class AdminFolder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ADMIN_ID")
	private Long adminId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(name="FOLDER_ID")
	private Long folderId;

	public AdminFolder() {
	}

	public Long getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getFolderId() {
		return this.folderId;
	}

	public void setFolderId(Long folderId) {
		this.folderId = folderId;
	}

}