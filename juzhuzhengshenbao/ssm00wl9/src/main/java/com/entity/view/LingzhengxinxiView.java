package com.entity.view;

import com.entity.LingzhengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 领证信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
@TableName("lingzhengxinxi")
public class LingzhengxinxiView  extends LingzhengxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LingzhengxinxiView(){
	}
 
 	public LingzhengxinxiView(LingzhengxinxiEntity lingzhengxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, lingzhengxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
