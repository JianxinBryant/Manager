package com.cqjtu.dao;

import java.util.UUID;

/**
 * 主键生成策略
 * @author zxy
 *
 */
public class Test {

	public static void main(String[] args) {
		String s = "12.1321";
	UUID uid = 	UUID.randomUUID();
	System.out.println(uid.toString());
	String id = uid.toString();
	System.out.println(id.replaceAll("-", ""));
	}
}
