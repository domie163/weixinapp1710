package com.entity.view;

import com.entity.JuzhuzhengdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 居住证登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
@TableName("juzhuzhengdengji")
public class JuzhuzhengdengjiView  extends JuzhuzhengdengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JuzhuzhengdengjiView(){
	}
 
 	public JuzhuzhengdengjiView(JuzhuzhengdengjiEntity juzhuzhengdengjiEntity){
 	try {
			BeanUtils.copyProperties(this, juzhuzhengdengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
