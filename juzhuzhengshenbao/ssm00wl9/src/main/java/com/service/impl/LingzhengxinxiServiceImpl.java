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


import com.dao.LingzhengxinxiDao;
import com.entity.LingzhengxinxiEntity;
import com.service.LingzhengxinxiService;
import com.entity.vo.LingzhengxinxiVO;
import com.entity.view.LingzhengxinxiView;

@Service("lingzhengxinxiService")
public class LingzhengxinxiServiceImpl extends ServiceImpl<LingzhengxinxiDao, LingzhengxinxiEntity> implements LingzhengxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingzhengxinxiEntity> page = this.selectPage(
                new Query<LingzhengxinxiEntity>(params).getPage(),
                new EntityWrapper<LingzhengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingzhengxinxiEntity> wrapper) {
		  Page<LingzhengxinxiView> page =new Query<LingzhengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingzhengxinxiVO> selectListVO(Wrapper<LingzhengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingzhengxinxiVO selectVO(Wrapper<LingzhengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingzhengxinxiView> selectListView(Wrapper<LingzhengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingzhengxinxiView selectView(Wrapper<LingzhengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
