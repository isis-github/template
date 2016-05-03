package com.shishuo.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CMS_ADMIN database table.
 * 
 */
@Entity
@Table(name="CMS_ADMIN")
@NamedQuery(name="Admin.findAll", query="SELECT a FROM Admin a")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_ADMIN_ADMINID_GENERATOR", sequenceName="CMS_ADMIN_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_ADMIN_ADMINID_GENERATOR")
	@Column(name="ADMIN_ID", unique=true, nullable=false)
	private long adminId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(length=50)
	private String name;

	@Column(length=50)
	private String password;

	//bi-directional many-to-many association to Folder
	@ManyToMany
	@JoinTable(
		name="CMS_ADMIN_FOLDER"
		, joinColumns={
			@JoinColumn(name="ADMIN_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="FOLDER_ID")
			}
		)
	private List<Folder> Folders;

	public Admin() {
	}

	public long getAdminId() {
		return this.adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Folder> getFolders() {
		return this.Folders;
	}

	public void setFolders(List<Folder> Folders) {
		this.Folders = Folders;
	}

}