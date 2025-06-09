package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangmaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangmaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangmaView;


/**
 * 健康码
 *
 * @author 
 * @email 
 * @date 2021-01-07 10:44:16
 */
public interface JiankangmaService extends IService<JiankangmaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangmaVO> selectListVO(Wrapper<JiankangmaEntity> wrapper);
   	
   	JiankangmaVO selectVO(@Param("ew") Wrapper<JiankangmaEntity> wrapper);
   	
   	List<JiankangmaView> selectListView(Wrapper<JiankangmaEntity> wrapper);
   	
   	JiankangmaView selectView(@Param("ew") Wrapper<JiankangmaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangmaEntity> wrapper);
   	
}

