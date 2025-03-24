package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HuizhidanEntity;
import com.entity.view.HuizhidanView;

import com.service.HuizhidanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 回执单
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
@RestController
@RequestMapping("/huizhidan")
public class HuizhidanController {
    @Autowired
    private HuizhidanService huizhidanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuizhidanEntity huizhidan, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("qunzhongyonghu")) {
			huizhidan.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jingfang")) {
			huizhidan.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuizhidanEntity> ew = new EntityWrapper<HuizhidanEntity>();
		PageUtils page = huizhidanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huizhidan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuizhidanEntity huizhidan, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("qunzhongyonghu")) {
			huizhidan.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jingfang")) {
			huizhidan.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuizhidanEntity> ew = new EntityWrapper<HuizhidanEntity>();
		PageUtils page = huizhidanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huizhidan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuizhidanEntity huizhidan){
       	EntityWrapper<HuizhidanEntity> ew = new EntityWrapper<HuizhidanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huizhidan, "huizhidan")); 
        return R.ok().put("data", huizhidanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuizhidanEntity huizhidan){
        EntityWrapper< HuizhidanEntity> ew = new EntityWrapper< HuizhidanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huizhidan, "huizhidan")); 
		HuizhidanView huizhidanView =  huizhidanService.selectView(ew);
		return R.ok("查询回执单成功").put("data", huizhidanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuizhidanEntity huizhidan = huizhidanService.selectById(id);
        return R.ok().put("data", huizhidan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuizhidanEntity huizhidan = huizhidanService.selectById(id);
        return R.ok().put("data", huizhidan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuizhidanEntity huizhidan, HttpServletRequest request){
    	huizhidan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huizhidan);

        huizhidanService.insert(huizhidan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuizhidanEntity huizhidan, HttpServletRequest request){
    	huizhidan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huizhidan);
    	huizhidan.setUserid((Long)request.getSession().getAttribute("userId"));

        huizhidanService.insert(huizhidan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HuizhidanEntity huizhidan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huizhidan);
        huizhidanService.updateById(huizhidan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huizhidanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<HuizhidanEntity> wrapper = new EntityWrapper<HuizhidanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("qunzhongyonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jingfang")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = huizhidanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
