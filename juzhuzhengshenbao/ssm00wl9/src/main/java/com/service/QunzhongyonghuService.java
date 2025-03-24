package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QunzhongyonghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QunzhongyonghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QunzhongyonghuView;


/**
 * 群众用户
 *
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
public interface QunzhongyonghuService extends IService<QunzhongyonghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QunzhongyonghuVO> selectListVO(Wrapper<QunzhongyonghuEntity> wrapper);
   	
   	QunzhongyonghuVO selectVO(@Param("ew") Wrapper<QunzhongyonghuEntity> wrapper);
   	
   	List<QunzhongyonghuView> selectListView(Wrapper<QunzhongyonghuEntity> wrapper);
   	
   	QunzhongyonghuView selectView(@Param("ew") Wrapper<QunzhongyonghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QunzhongyonghuEntity> wrapper);
   	
}

