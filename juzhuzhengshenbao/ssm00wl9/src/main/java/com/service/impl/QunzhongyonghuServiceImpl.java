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


import com.dao.QunzhongyonghuDao;
import com.entity.QunzhongyonghuEntity;
import com.service.QunzhongyonghuService;
import com.entity.vo.QunzhongyonghuVO;
import com.entity.view.QunzhongyonghuView;

@Service("qunzhongyonghuService")
public class QunzhongyonghuServiceImpl extends ServiceImpl<QunzhongyonghuDao, QunzhongyonghuEntity> implements QunzhongyonghuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QunzhongyonghuEntity> page = this.selectPage(
                new Query<QunzhongyonghuEntity>(params).getPage(),
                new EntityWrapper<QunzhongyonghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QunzhongyonghuEntity> wrapper) {
		  Page<QunzhongyonghuView> page =new Query<QunzhongyonghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QunzhongyonghuVO> selectListVO(Wrapper<QunzhongyonghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QunzhongyonghuVO selectVO(Wrapper<QunzhongyonghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QunzhongyonghuView> selectListView(Wrapper<QunzhongyonghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QunzhongyonghuView selectView(Wrapper<QunzhongyonghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
