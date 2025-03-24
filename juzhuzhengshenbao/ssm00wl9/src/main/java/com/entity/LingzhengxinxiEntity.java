package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 领证信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
@TableName("lingzhengxinxi")
public class LingzhengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LingzhengxinxiEntity() {
		
	}
	
	public LingzhengxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 真实姓名
	 */
					
	private String zhenshixingming;
	
	/**
	 * 申报时间
	 */
					
	private String shenbaoshijian;
	
	/**
	 * 领证时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date lingzhengshijian;
	
	/**
	 * 领证地点
	 */
					
	private String lingzhengdidian;
	
	/**
	 * 说明
	 */
					
	private String shuoming;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 警察姓名
	 */
					
	private String jingchaxingming;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：真实姓名
	 */
	public void setZhenshixingming(String zhenshixingming) {
		this.zhenshixingming = zhenshixingming;
	}
	/**
	 * 获取：真实姓名
	 */
	public String getZhenshixingming() {
		return zhenshixingming;
	}
	/**
	 * 设置：申报时间
	 */
	public void setShenbaoshijian(String shenbaoshijian) {
		this.shenbaoshijian = shenbaoshijian;
	}
	/**
	 * 获取：申报时间
	 */
	public String getShenbaoshijian() {
		return shenbaoshijian;
	}
	/**
	 * 设置：领证时间
	 */
	public void setLingzhengshijian(Date lingzhengshijian) {
		this.lingzhengshijian = lingzhengshijian;
	}
	/**
	 * 获取：领证时间
	 */
	public Date getLingzhengshijian() {
		return lingzhengshijian;
	}
	/**
	 * 设置：领证地点
	 */
	public void setLingzhengdidian(String lingzhengdidian) {
		this.lingzhengdidian = lingzhengdidian;
	}
	/**
	 * 获取：领证地点
	 */
	public String getLingzhengdidian() {
		return lingzhengdidian;
	}
	/**
	 * 设置：说明
	 */
	public void setShuoming(String shuoming) {
		this.shuoming = shuoming;
	}
	/**
	 * 获取：说明
	 */
	public String getShuoming() {
		return shuoming;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：警察姓名
	 */
	public void setJingchaxingming(String jingchaxingming) {
		this.jingchaxingming = jingchaxingming;
	}
	/**
	 * 获取：警察姓名
	 */
	public String getJingchaxingming() {
		return jingchaxingming;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
