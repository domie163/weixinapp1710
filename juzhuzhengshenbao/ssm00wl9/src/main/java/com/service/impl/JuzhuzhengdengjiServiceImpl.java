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


import com.dao.JuzhuzhengdengjiDao;
import com.entity.JuzhuzhengdengjiEntity;
import com.service.JuzhuzhengdengjiService;
import com.entity.vo.JuzhuzhengdengjiVO;
import com.entity.view.JuzhuzhengdengjiView;

@Service("juzhuzhengdengjiService")
public class JuzhuzhengdengjiServiceImpl extends ServiceImpl<JuzhuzhengdengjiDao, JuzhuzhengdengjiEntity> implements JuzhuzhengdengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JuzhuzhengdengjiEntity> page = this.selectPage(
                new Query<JuzhuzhengdengjiEntity>(params).getPage(),
                new EntityWrapper<JuzhuzhengdengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JuzhuzhengdengjiEntity> wrapper) {
		  Page<JuzhuzhengdengjiView> page =new Query<JuzhuzhengdengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JuzhuzhengdengjiVO> selectListVO(Wrapper<JuzhuzhengdengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JuzhuzhengdengjiVO selectVO(Wrapper<JuzhuzhengdengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JuzhuzhengdengjiView> selectListView(Wrapper<JuzhuzhengdengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JuzhuzhengdengjiView selectView(Wrapper<JuzhuzhengdengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
