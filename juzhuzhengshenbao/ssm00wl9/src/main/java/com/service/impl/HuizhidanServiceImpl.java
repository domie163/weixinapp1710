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


import com.dao.HuizhidanDao;
import com.entity.HuizhidanEntity;
import com.service.HuizhidanService;
import com.entity.vo.HuizhidanVO;
import com.entity.view.HuizhidanView;

@Service("huizhidanService")
public class HuizhidanServiceImpl extends ServiceImpl<HuizhidanDao, HuizhidanEntity> implements HuizhidanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuizhidanEntity> page = this.selectPage(
                new Query<HuizhidanEntity>(params).getPage(),
                new EntityWrapper<HuizhidanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuizhidanEntity> wrapper) {
		  Page<HuizhidanView> page =new Query<HuizhidanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuizhidanVO> selectListVO(Wrapper<HuizhidanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuizhidanVO selectVO(Wrapper<HuizhidanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuizhidanView> selectListView(Wrapper<HuizhidanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuizhidanView selectView(Wrapper<HuizhidanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
