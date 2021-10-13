package com.wu.user.bean;

import com.wu.common.data.CommonEntity;

import lombok.Data;

@Data
public class User extends CommonEntity{
	private String name;
	private int age;
	private String icon;
}
