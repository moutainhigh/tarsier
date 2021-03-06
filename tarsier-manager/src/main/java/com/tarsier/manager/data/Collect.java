package com.tarsier.manager.data;

import java.util.Date;

import com.alibaba.fastjson.JSON;

public class Collect {
	private int id;
	private String group;
	private CollectType type;
	private String name;
	private String ip;
	private String config;
	private boolean disabled;
	private Date createTime;
	private Date updateTime;
	private String userName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getIp() {
		return ip==null ? null : ip.trim();
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getConfig() {
		return config;
	}
	public void setConfig(String config) {
		this.config = config;
	}
	public boolean isDisabled() {
		return disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
	public Date getCreateTime() {
		return createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CollectType getType() {
		return type;
	}
	public void setType(CollectType type) {
		this.type = type;
	}
}
