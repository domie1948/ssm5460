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
 * 紧急情况
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-07 10:44:16
 */
@TableName("jinjiqingkuang")
public class JinjiqingkuangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JinjiqingkuangEntity() {
		
	}
	
	public JinjiqingkuangEntity(T t) {
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
