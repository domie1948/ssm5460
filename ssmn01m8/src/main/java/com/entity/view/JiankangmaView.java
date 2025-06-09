package com.entity.view;

import com.entity.JiankangmaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康码
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-07 10:44:16
 */
@TableName("jiankangma")
public class JiankangmaView  extends JiankangmaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangmaView(){
	}
 
 	public JiankangmaView(JiankangmaEntity jiankangmaEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangmaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
