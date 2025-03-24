package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingzhengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingzhengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingzhengxinxiView;


/**
 * 领证信息
 *
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
public interface LingzhengxinxiService extends IService<LingzhengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingzhengxinxiVO> selectListVO(Wrapper<LingzhengxinxiEntity> wrapper);
   	
   	LingzhengxinxiVO selectVO(@Param("ew") Wrapper<LingzhengxinxiEntity> wrapper);
   	
   	List<LingzhengxinxiView> selectListView(Wrapper<LingzhengxinxiEntity> wrapper);
   	
   	LingzhengxinxiView selectView(@Param("ew") Wrapper<LingzhengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingzhengxinxiEntity> wrapper);
   	
}

