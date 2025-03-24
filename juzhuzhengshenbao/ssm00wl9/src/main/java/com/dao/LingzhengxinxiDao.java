package com.dao;

import com.entity.LingzhengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingzhengxinxiVO;
import com.entity.view.LingzhengxinxiView;


/**
 * 领证信息
 * 
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
public interface LingzhengxinxiDao extends BaseMapper<LingzhengxinxiEntity> {
	
	List<LingzhengxinxiVO> selectListVO(@Param("ew") Wrapper<LingzhengxinxiEntity> wrapper);
	
	LingzhengxinxiVO selectVO(@Param("ew") Wrapper<LingzhengxinxiEntity> wrapper);
	
	List<LingzhengxinxiView> selectListView(@Param("ew") Wrapper<LingzhengxinxiEntity> wrapper);

	List<LingzhengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LingzhengxinxiEntity> wrapper);
	
	LingzhengxinxiView selectView(@Param("ew") Wrapper<LingzhengxinxiEntity> wrapper);
	
}
