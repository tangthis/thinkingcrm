package com.fsj.spring.model.sys;
// default package

import java.util.Date;

/**
 * SysOperLog generated by MyEclipse Persistence Tools
 */

public class SysOperLog implements java.io.Serializable {

	// Fields

	private Long id;

	private Long solMenuId;

	private String solOperType;

	private Long solOperUser;

	private Date solOperTime;

	private String solOperDetail;

	// Constructors

	/** default constructor */
	public SysOperLog() {
	}

	/** minimal constructor */
	public SysOperLog(Long id) {
		this.id = id;
	}

	/** full constructor */
	public SysOperLog(Long id, Long solMenuId, String solOperType, Long solOperUser, Date solOperTime, String solOperDetail) {
		this.id = id;
		this.solMenuId = solMenuId;
		this.solOperType = solOperType;
		this.solOperUser = solOperUser;
		this.solOperTime = solOperTime;
		this.solOperDetail = solOperDetail;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSolMenuId() {
		return this.solMenuId;
	}

	public void setSolMenuId(Long solMenuId) {
		this.solMenuId = solMenuId;
	}

	public String getSolOperType() {
		return this.solOperType;
	}

	public void setSolOperType(String solOperType) {
		this.solOperType = solOperType;
	}

	public Long getSolOperUser() {
		return this.solOperUser;
	}

	public void setSolOperUser(Long solOperUser) {
		this.solOperUser = solOperUser;
	}

	public Date getSolOperTime() {
		return this.solOperTime;
	}

	public void setSolOperTime(Date solOperTime) {
		this.solOperTime = solOperTime;
	}

	public String getSolOperDetail() {
		return this.solOperDetail;
	}

	public void setSolOperDetail(String solOperDetail) {
		this.solOperDetail = solOperDetail;
	}

}