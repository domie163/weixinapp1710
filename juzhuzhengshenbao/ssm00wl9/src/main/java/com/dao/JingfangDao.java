package com.dao;

import com.entity.JingfangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingfangVO;
import com.entity.view.JingfangView;


/**
 * 警方
 * 
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
public interface JingfangDao extends BaseMapper<JingfangEntity> {
	
	List<JingfangVO> selectListVO(@Param("ew") Wrapper<JingfangEntity> wrapper);
	
	JingfangVO selectVO(@Param("ew") Wrapper<JingfangEntity> wrapper);
	
	List<JingfangView> selectListView(@Param("ew") Wrapper<JingfangEntity> wrapper);

	List<JingfangView> selectListView(Pagination page,@Param("ew") Wrapper<JingfangEntity> wrapper);
	
	JingfangView selectView(@Param("ew") Wrapper<JingfangEntity> wrapper);
	
}
