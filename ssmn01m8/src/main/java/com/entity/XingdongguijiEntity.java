package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 行动轨迹
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-07 10:44:16
 */
@TableName("xingdongguiji")
public class XingdongguijiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XingdongguijiEntity() {
		
	}
	
	public XingdongguijiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 角色
	 */
					
	private String jiaose;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：角色
	 */
	public void setJiaose(String jiaose) {
		this.jiaose = jiaose;
	}
	/**
	 * 获取：角色
	 */
	public String getJiaose() {
		return jiaose;
	}
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
