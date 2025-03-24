package com.entity.view;

import com.entity.JingfangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 警方
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
@TableName("jingfang")
public class JingfangView  extends JingfangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingfangView(){
	}
 
 	public JingfangView(JingfangEntity jingfangEntity){
 	try {
			BeanUtils.copyProperties(this, jingfangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
