package com.entity.view;

import com.entity.JinjiqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 紧急情况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-07 10:44:16
 */
@TableName("jinjiqingkuang")
public class JinjiqingkuangView  extends JinjiqingkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JinjiqingkuangView(){
	}
 
 	public JinjiqingkuangView(JinjiqingkuangEntity jinjiqingkuangEntity){
 	try {
			BeanUtils.copyProperties(this, jinjiqingkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
