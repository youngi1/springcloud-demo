package com.young.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@NoArgsConstructor//无惨构造器
@Data//get、set方法
@AllArgsConstructor//全参构造器
@Accessors(chain=true)//链式风格访问，Dept dept = new Dept();dept.setDeptNo(1).setDeptName("研发部").setDbSource("db_source1");
//通过链式方式给dept对象填充数据。
public class Dept implements Serializable{//微服务实体对象必须实现序列化
	
	private Integer deptno;//部门编号，主键
	private String deptname;//部门名称
	private String db_source;//数据源：每个微服务可能都有一个单独的数据库，该字段用来标识数据来源于哪个数据库
	
	
//	public static void main(String[] args) {
//		Dept dept = new Dept();
//		//以下即为链式风格访问
//		//结果输出Dept(deptno=1, deptname=研发, db_source=db_source1)
//		dept.setDeptno(1).setDeptname("研发").setDb_source("db_source1");
//		System.out.println(dept);
//	}
}
