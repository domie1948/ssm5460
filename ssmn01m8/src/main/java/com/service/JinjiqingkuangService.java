package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinjiqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinjiqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinjiqingkuangView;


/**
 * 紧急情况
 *
 * @author 
 * @email 
 * @date 2021-01-07 10:44:16
 */
public interface JinjiqingkuangService extends IService<JinjiqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinjiqingkuangVO> selectListVO(Wrapper<JinjiqingkuangEntity> wrapper);
   	
   	JinjiqingkuangVO selectVO(@Param("ew") Wrapper<JinjiqingkuangEntity> wrapper);
   	
   	List<JinjiqingkuangView> selectListView(Wrapper<JinjiqingkuangEntity> wrapper);
   	
   	JinjiqingkuangView selectView(@Param("ew") Wrapper<JinjiqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinjiqingkuangEntity> wrapper);
   	
}

