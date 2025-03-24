package com.dao;

import com.entity.HuizhidanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuizhidanVO;
import com.entity.view.HuizhidanView;


/**
 * 回执单
 * 
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
public interface HuizhidanDao extends BaseMapper<HuizhidanEntity> {
	
	List<HuizhidanVO> selectListVO(@Param("ew") Wrapper<HuizhidanEntity> wrapper);
	
	HuizhidanVO selectVO(@Param("ew") Wrapper<HuizhidanEntity> wrapper);
	
	List<HuizhidanView> selectListView(@Param("ew") Wrapper<HuizhidanEntity> wrapper);

	List<HuizhidanView> selectListView(Pagination page,@Param("ew") Wrapper<HuizhidanEntity> wrapper);
	
	HuizhidanView selectView(@Param("ew") Wrapper<HuizhidanEntity> wrapper);
	
}
