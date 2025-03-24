package com.dao;

import com.entity.QunzhongyonghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QunzhongyonghuVO;
import com.entity.view.QunzhongyonghuView;


/**
 * 群众用户
 * 
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
public interface QunzhongyonghuDao extends BaseMapper<QunzhongyonghuEntity> {
	
	List<QunzhongyonghuVO> selectListVO(@Param("ew") Wrapper<QunzhongyonghuEntity> wrapper);
	
	QunzhongyonghuVO selectVO(@Param("ew") Wrapper<QunzhongyonghuEntity> wrapper);
	
	List<QunzhongyonghuView> selectListView(@Param("ew") Wrapper<QunzhongyonghuEntity> wrapper);

	List<QunzhongyonghuView> selectListView(Pagination page,@Param("ew") Wrapper<QunzhongyonghuEntity> wrapper);
	
	QunzhongyonghuView selectView(@Param("ew") Wrapper<QunzhongyonghuEntity> wrapper);
	
}
