package com.dao;

import com.entity.JinjiqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinjiqingkuangVO;
import com.entity.view.JinjiqingkuangView;


/**
 * 紧急情况
 * 
 * @author 
 * @email 
 * @date 2021-01-07 10:44:16
 */
public interface JinjiqingkuangDao extends BaseMapper<JinjiqingkuangEntity> {
	
	List<JinjiqingkuangVO> selectListVO(@Param("ew") Wrapper<JinjiqingkuangEntity> wrapper);
	
	JinjiqingkuangVO selectVO(@Param("ew") Wrapper<JinjiqingkuangEntity> wrapper);
	
	List<JinjiqingkuangView> selectListView(@Param("ew") Wrapper<JinjiqingkuangEntity> wrapper);

	List<JinjiqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<JinjiqingkuangEntity> wrapper);
	
	JinjiqingkuangView selectView(@Param("ew") Wrapper<JinjiqingkuangEntity> wrapper);
	
}
