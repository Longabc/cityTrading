package com.cityTrading.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.Length;

@Entity
@DynamicInsert
@DynamicUpdate
public class Merchant extends BaseDomain{

	@Id
	@GeneratedValue
	private Long id;
	
	@Length(min = 3 ,max = 12,message = "用户名长度需在3到12位之间")
	private String username;
	
	@Length(min = 3 ,max = 12,message = "密码长度需在3到12位之间")
	private String password;
	
	private String nikename;
	
	/**
	 * 真实姓名
	 */
	private String fullname;
	
	/**
	 * 性别 0 男 1 女
	 */
	private Integer gender;
	
	@Pattern(regexp = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$" ,message = "请输入正确的手机号")
	private String phone;
	
	private String email;
	
	private String address;
	
	/**
	 * 头像
	 */
	private String profilePicture;
	
	/**
	 * 成交量
	 */
	private Integer volume;
	
	/**
	 * 累计评价量
	 */
	private Integer evaluate;
	
	private Date createTime;
	
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNikename() {
		return nikename;
	}

	public void setNikename(String nikename) {
		this.nikename = nikename;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public Integer getEvaluate() {
		return evaluate;
	}

	public void setEvaluate(Integer evaluate) {
		this.evaluate = evaluate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "Merchant [id=" + id + ", username=" + username + ", password="
				+ password + ", nikename=" + nikename + ", fullname="
				+ fullname + ", gender=" + gender + ", phone=" + phone
				+ ", email=" + email + ", address=" + address
				+ ", profilePicture=" + profilePicture + ", volume=" + volume
				+ ", evaluate=" + evaluate + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}
	
}
