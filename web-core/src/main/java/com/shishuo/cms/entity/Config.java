package com.shishuo.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CMS_CONFIG database table.
 * 
 */
@Entity
@Table(name="CMS_CONFIG")
@NamedQuery(name="Config.findAll", query="SELECT c FROM Config c")
public class Config implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_CONFIG_CONFIDID_GENERATOR", sequenceName="CMS_CONFIG_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_CONFIG_CONFIDID_GENERATOR")
	@Column(name="CONFID_ID", unique=true, nullable=false)
	private long confidId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(length=2000)
	private String description;

	@Column(name="\"KEY\"", nullable=false, length=45)
	private String key;

	@Column(length=200)
	private String value;

	public Config() {
	}

	public long getConfidId() {
		return this.confidId;
	}

	public void setConfidId(long confidId) {
		this.confidId = confidId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}