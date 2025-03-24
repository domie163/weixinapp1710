package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JingfangDao;
import com.entity.JingfangEntity;
import com.service.JingfangService;
import com.entity.vo.JingfangVO;
import com.entity.view.JingfangView;

@Service("jingfangService")
public class JingfangServiceImpl extends ServiceImpl<JingfangDao, JingfangEntity> implements JingfangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingfangEntity> page = this.selectPage(
                new Query<JingfangEntity>(params).getPage(),
                new EntityWrapper<JingfangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingfangEntity> wrapper) {
		  Page<JingfangView> page =new Query<JingfangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingfangVO> selectListVO(Wrapper<JingfangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingfangVO selectVO(Wrapper<JingfangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingfangView> selectListView(Wrapper<JingfangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingfangView selectView(Wrapper<JingfangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
