package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JuzhuzhengdengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JuzhuzhengdengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JuzhuzhengdengjiView;


/**
 * 居住证登记
 *
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
public interface JuzhuzhengdengjiService extends IService<JuzhuzhengdengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JuzhuzhengdengjiVO> selectListVO(Wrapper<JuzhuzhengdengjiEntity> wrapper);
   	
   	JuzhuzhengdengjiVO selectVO(@Param("ew") Wrapper<JuzhuzhengdengjiEntity> wrapper);
   	
   	List<JuzhuzhengdengjiView> selectListView(Wrapper<JuzhuzhengdengjiEntity> wrapper);
   	
   	JuzhuzhengdengjiView selectView(@Param("ew") Wrapper<JuzhuzhengdengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JuzhuzhengdengjiEntity> wrapper);
   	
}

