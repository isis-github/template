package com.shishuo.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CMS_HEADLINE database table.
 * 
 */
@Entity
@Table(name="CMS_HEADLINE")
@NamedQuery(name="Headline.findAll", query="SELECT h FROM Headline h")
public class Headline implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CMS_HEADLINE_HEADLINEID_GENERATOR", sequenceName="CMS_HEADLINE_S")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CMS_HEADLINE_HEADLINEID_GENERATOR")
	@Column(name="HEADLINE_ID", unique=true, nullable=false)
	private long headlineId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(length=200)
	private String name;

	@Column(length=200)
	private String piture;

	private BigDecimal sort;

	@Column(length=200)
	private String url;

	public Headline() {
	}

	public long getHeadlineId() {
		return this.headlineId;
	}

	public void setHeadlineId(long headlineId) {
		this.headlineId = headlineId;
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

	public String getPiture() {
		return this.piture;
	}

	public void setPiture(String piture) {
		this.piture = piture;
	}

	public BigDecimal getSort() {
		return this.sort;
	}

	public void setSort(BigDecimal sort) {
		this.sort = sort;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}