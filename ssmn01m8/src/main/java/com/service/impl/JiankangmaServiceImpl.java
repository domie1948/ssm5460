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


import com.dao.JiankangmaDao;
import com.entity.JiankangmaEntity;
import com.service.JiankangmaService;
import com.entity.vo.JiankangmaVO;
import com.entity.view.JiankangmaView;

@Service("jiankangmaService")
public class JiankangmaServiceImpl extends ServiceImpl<JiankangmaDao, JiankangmaEntity> implements JiankangmaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangmaEntity> page = this.selectPage(
                new Query<JiankangmaEntity>(params).getPage(),
                new EntityWrapper<JiankangmaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangmaEntity> wrapper) {
		  Page<JiankangmaView> page =new Query<JiankangmaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangmaVO> selectListVO(Wrapper<JiankangmaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangmaVO selectVO(Wrapper<JiankangmaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangmaView> selectListView(Wrapper<JiankangmaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangmaView selectView(Wrapper<JiankangmaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
