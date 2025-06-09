package com.entity.model;

import com.entity.XingdongguijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 行动轨迹
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-07 10:44:16
 */
public class XingdongguijiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 轨迹图
	 */
	
	private String guijitu;
		
	/**
	 * 详细路线
	 */
	
	private String xiangxiluxian;
		
	/**
	 * 时间段
	 */
	
	private String shijianduan;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：轨迹图
	 */
	 
	public void setGuijitu(String guijitu) {
		this.guijitu = guijitu;
	}
	
	/**
	 * 获取：轨迹图
	 */
	public String getGuijitu() {
		return guijitu;
	}
				
	
	/**
	 * 设置：详细路线
	 */
	 
	public void setXiangxiluxian(String xiangxiluxian) {
		this.xiangxiluxian = xiangxiluxian;
	}
	
	/**
	 * 获取：详细路线
	 */
	public String getXiangxiluxian() {
		return xiangxiluxian;
	}
				
	
	/**
	 * 设置：时间段
	 */
	 
	public void setShijianduan(String shijianduan) {
		this.shijianduan = shijianduan;
	}
	
	/**
	 * 获取：时间段
	 */
	public String getShijianduan() {
		return shijianduan;
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
