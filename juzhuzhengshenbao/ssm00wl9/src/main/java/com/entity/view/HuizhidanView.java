package com.entity.view;

import com.entity.HuizhidanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 回执单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
@TableName("huizhidan")
public class HuizhidanView  extends HuizhidanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuizhidanView(){
	}
 
 	public HuizhidanView(HuizhidanEntity huizhidanEntity){
 	try {
			BeanUtils.copyProperties(this, huizhidanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
