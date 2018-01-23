package com.cityTrading.domain;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * 商品 表
 * @author Administrator
 *
 */
@Entity
public class Commodity {

	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * 商家id
	 */
	private Long mId;//Merchants 
	
	/**
	 * 商品分类id
	 */
	private Long mcId;
	
	private String title;
	
	private BigDecimal originalPrice;
	
	private BigDecimal currentPrice;
	
	/**
	 * 成色：全新，95新，85新
	 */
	private String quality;
	
	/**
	 * 交易方式： 0 面议  1 快递
	 */
	private Integer method;
	
	/**
	 * 邮费
	 */
	private Double postage;
	
	/**
	 * 所在地
	 */
	private String address;
	
	/**
	 * 是否可以讲价  0 不可以 1 可以
	 */
	private Integer bargain;
	
	/**
	 * 被点赞数
	 */
	private Integer upvote;
	
	/**
	 * 浏览量
	 */
	private Integer PV;
	
	/**
	 * 属性： 0 下架  1 上架
	 */
	private Integer status;
	
	/**
	 * 累计留言量
	 */
	private Integer messageNum;
	
	/**
	 * 商品详细内容
	 */
	@Lob
	@Column(columnDefinition = "MEDIUMTEXT" )
	private String content;
	
	private String createTime ;
	
	private String updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getmId() {
		return mId;
	}

	public void setmId(Long mId) {
		this.mId = mId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}

	public BigDecimal getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(BigDecimal currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public Integer getMethod() {
		return method;
	}

	public void setMethod(Integer method) {
		this.method = method;
	}

	public Double getPostage() {
		return postage;
	}

	public void setPostage(Double postage) {
		this.postage = postage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getBargain() {
		return bargain;
	}

	public void setBargain(Integer bargain) {
		this.bargain = bargain;
	}

	public Integer getUpvote() {
		return upvote;
	}

	public void setUpvote(Integer upvote) {
		this.upvote = upvote;
	}

	public Integer getPV() {
		return PV;
	}

	public void setPV(Integer pV) {
		PV = pV;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getMessageNum() {
		return messageNum;
	}

	public void setMessageNum(Integer messageNum) {
		this.messageNum = messageNum;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Long getMcId() {
		return mcId;
	}
	
	public void setMcId(Long mcId) {
		this.mcId = mcId;
	}
	
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", mId=" + mId + ", title=" + title
				+ ", originalPrice=" + originalPrice + ", currentPrice="
				+ currentPrice + ", quality=" + quality + ", method=" + method
				+ ", postage=" + postage + ", address=" + address
				+ ", bargain=" + bargain + ", upvote=" + upvote + ", PV=" + PV
				+ ", status=" + status + ", messageNum=" + messageNum
				+ ", content=" + content + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}
	
}
