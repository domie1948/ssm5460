package com.entity.vo;

import com.entity.JinjiqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 紧急情况
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-07 10:44:16
 */
public class JinjiqingkuangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 上报人
	 */
	
	private String shangbaoren;
		
	/**
	 * 标题
	 */
	
	private String biaoti;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 详细
	 */
	
	private String xiangxi;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：上报人
	 */
	 
	public void setShangbaoren(String shangbaoren) {
		this.shangbaoren = shangbaoren;
	}
	
	/**
	 * 获取：上报人
	 */
	public String getShangbaoren() {
		return shangbaoren;
	}
				
	
	/**
	 * 设置：标题
	 */
	 
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：详细
	 */
	 
	public void setXiangxi(String xiangxi) {
		this.xiangxi = xiangxi;
	}
	
	/**
	 * 获取：详细
	 */
	public String getXiangxi() {
		return xiangxi;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
