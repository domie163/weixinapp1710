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

import com.entity.LingzhengxinxiEntity;
import com.entity.view.LingzhengxinxiView;

import com.service.LingzhengxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 领证信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-10 09:33:24
 */
@RestController
@RequestMapping("/lingzhengxinxi")
public class LingzhengxinxiController {
    @Autowired
    private LingzhengxinxiService lingzhengxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LingzhengxinxiEntity lingzhengxinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("qunzhongyonghu")) {
			lingzhengxinxi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jingfang")) {
			lingzhengxinxi.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LingzhengxinxiEntity> ew = new EntityWrapper<LingzhengxinxiEntity>();
		PageUtils page = lingzhengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lingzhengxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LingzhengxinxiEntity lingzhengxinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("qunzhongyonghu")) {
			lingzhengxinxi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jingfang")) {
			lingzhengxinxi.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LingzhengxinxiEntity> ew = new EntityWrapper<LingzhengxinxiEntity>();
		PageUtils page = lingzhengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lingzhengxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LingzhengxinxiEntity lingzhengxinxi){
       	EntityWrapper<LingzhengxinxiEntity> ew = new EntityWrapper<LingzhengxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lingzhengxinxi, "lingzhengxinxi")); 
        return R.ok().put("data", lingzhengxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LingzhengxinxiEntity lingzhengxinxi){
        EntityWrapper< LingzhengxinxiEntity> ew = new EntityWrapper< LingzhengxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lingzhengxinxi, "lingzhengxinxi")); 
		LingzhengxinxiView lingzhengxinxiView =  lingzhengxinxiService.selectView(ew);
		return R.ok("查询领证信息成功").put("data", lingzhengxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LingzhengxinxiEntity lingzhengxinxi = lingzhengxinxiService.selectById(id);
        return R.ok().put("data", lingzhengxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LingzhengxinxiEntity lingzhengxinxi = lingzhengxinxiService.selectById(id);
        return R.ok().put("data", lingzhengxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LingzhengxinxiEntity lingzhengxinxi, HttpServletRequest request){
    	lingzhengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lingzhengxinxi);

        lingzhengxinxiService.insert(lingzhengxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LingzhengxinxiEntity lingzhengxinxi, HttpServletRequest request){
    	lingzhengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lingzhengxinxi);
    	lingzhengxinxi.setUserid((Long)request.getSession().getAttribute("userId"));

        lingzhengxinxiService.insert(lingzhengxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody LingzhengxinxiEntity lingzhengxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lingzhengxinxi);
        lingzhengxinxiService.updateById(lingzhengxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lingzhengxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<LingzhengxinxiEntity> wrapper = new EntityWrapper<LingzhengxinxiEntity>();
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

		int count = lingzhengxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
