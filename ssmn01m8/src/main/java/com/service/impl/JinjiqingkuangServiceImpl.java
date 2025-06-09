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


import com.dao.JinjiqingkuangDao;
import com.entity.JinjiqingkuangEntity;
import com.service.JinjiqingkuangService;
import com.entity.vo.JinjiqingkuangVO;
import com.entity.view.JinjiqingkuangView;

@Service("jinjiqingkuangService")
public class JinjiqingkuangServiceImpl extends ServiceImpl<JinjiqingkuangDao, JinjiqingkuangEntity> implements JinjiqingkuangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JinjiqingkuangEntity> page = this.selectPage(
                new Query<JinjiqingkuangEntity>(params).getPage(),
                new EntityWrapper<JinjiqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JinjiqingkuangEntity> wrapper) {
		  Page<JinjiqingkuangView> page =new Query<JinjiqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JinjiqingkuangVO> selectListVO(Wrapper<JinjiqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JinjiqingkuangVO selectVO(Wrapper<JinjiqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JinjiqingkuangView> selectListView(Wrapper<JinjiqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JinjiqingkuangView selectView(Wrapper<JinjiqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
