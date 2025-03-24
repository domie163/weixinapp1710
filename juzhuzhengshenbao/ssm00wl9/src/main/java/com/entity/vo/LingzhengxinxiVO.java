package com.entity.vo;

import com.entity.LingzhengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 领证信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
public class LingzhengxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
