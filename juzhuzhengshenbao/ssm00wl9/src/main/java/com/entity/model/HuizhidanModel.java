package com.entity.model;

import com.entity.HuizhidanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 回执单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
public class HuizhidanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 真实姓名
	 */
	
	private String zhenshixingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 回执内容
	 */
	
	private String huizhineirong;
		
	/**
	 * 回执时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huizhishijian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
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
	 * 设置：回执内容
	 */
	 
	public void setHuizhineirong(String huizhineirong) {
		this.huizhineirong = huizhineirong;
	}
	
	/**
	 * 获取：回执内容
	 */
	public String getHuizhineirong() {
		return huizhineirong;
	}
				
	
	/**
	 * 设置：回执时间
	 */
	 
	public void setHuizhishijian(Date huizhishijian) {
		this.huizhishijian = huizhishijian;
	}
	
	/**
	 * 获取：回执时间
	 */
	public Date getHuizhishijian() {
		return huizhishijian;
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
