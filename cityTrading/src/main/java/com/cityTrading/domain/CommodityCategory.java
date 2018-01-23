package com.cityTrading.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 商品分类表
 * @author Administrator
 *
 */
@Entity
public class CommodityCategory {

	@Id
	@GeneratedValue
	private Long id;
	
	private Long parentId;
	
	/**
	 * 标题
	 */
	private String title;
	
	/**
	 * 简短描述
	 */
	private String memo;
	
	/**
	 * 图标
	 */
	private String icon;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
}
