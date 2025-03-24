package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingfangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingfangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingfangView;


/**
 * 警方
 *
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
public interface JingfangService extends IService<JingfangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingfangVO> selectListVO(Wrapper<JingfangEntity> wrapper);
   	
   	JingfangVO selectVO(@Param("ew") Wrapper<JingfangEntity> wrapper);
   	
   	List<JingfangView> selectListView(Wrapper<JingfangEntity> wrapper);
   	
   	JingfangView selectView(@Param("ew") Wrapper<JingfangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingfangEntity> wrapper);
   	
}

