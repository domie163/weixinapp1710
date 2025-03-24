package com.dao;

import com.entity.JuzhuzhengdengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JuzhuzhengdengjiVO;
import com.entity.view.JuzhuzhengdengjiView;


/**
 * 居住证登记
 * 
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
public interface JuzhuzhengdengjiDao extends BaseMapper<JuzhuzhengdengjiEntity> {
	
	List<JuzhuzhengdengjiVO> selectListVO(@Param("ew") Wrapper<JuzhuzhengdengjiEntity> wrapper);
	
	JuzhuzhengdengjiVO selectVO(@Param("ew") Wrapper<JuzhuzhengdengjiEntity> wrapper);
	
	List<JuzhuzhengdengjiView> selectListView(@Param("ew") Wrapper<JuzhuzhengdengjiEntity> wrapper);

	List<JuzhuzhengdengjiView> selectListView(Pagination page,@Param("ew") Wrapper<JuzhuzhengdengjiEntity> wrapper);
	
	JuzhuzhengdengjiView selectView(@Param("ew") Wrapper<JuzhuzhengdengjiEntity> wrapper);
	
}
