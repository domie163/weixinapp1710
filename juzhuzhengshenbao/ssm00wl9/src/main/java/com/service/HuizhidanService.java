package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuizhidanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuizhidanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuizhidanView;


/**
 * 回执单
 *
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
public interface HuizhidanService extends IService<HuizhidanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuizhidanVO> selectListVO(Wrapper<HuizhidanEntity> wrapper);
   	
   	HuizhidanVO selectVO(@Param("ew") Wrapper<HuizhidanEntity> wrapper);
   	
   	List<HuizhidanView> selectListView(Wrapper<HuizhidanEntity> wrapper);
   	
   	HuizhidanView selectView(@Param("ew") Wrapper<HuizhidanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuizhidanEntity> wrapper);
   	
}

