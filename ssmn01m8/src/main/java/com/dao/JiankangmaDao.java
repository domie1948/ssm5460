package com.dao;

import com.entity.JiankangmaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangmaVO;
import com.entity.view.JiankangmaView;


/**
 * 健康码
 * 
 * @author 
 * @email 
 * @date 2021-01-07 10:44:16
 */
public interface JiankangmaDao extends BaseMapper<JiankangmaEntity> {
	
	List<JiankangmaVO> selectListVO(@Param("ew") Wrapper<JiankangmaEntity> wrapper);
	
	JiankangmaVO selectVO(@Param("ew") Wrapper<JiankangmaEntity> wrapper);
	
	List<JiankangmaView> selectListView(@Param("ew") Wrapper<JiankangmaEntity> wrapper);

	List<JiankangmaView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangmaEntity> wrapper);
	
	JiankangmaView selectView(@Param("ew") Wrapper<JiankangmaEntity> wrapper);
	
}
