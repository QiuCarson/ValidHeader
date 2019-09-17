package com.example.demo.annotation;

import java.lang.annotation.*;


/**
 * @Target：
用于描述注解的使用范围。
参数说明：
 @Target(ElementType.TYPE)    //接口、类、枚举、注解
 @Target(ElementType.FIELD)  //字段、枚举的常量
 @Target(ElementType.METHOD)  //方法
 @Target(ElementType.PARAMETER)  //方法参数
 @Target(ElementType.CONSTRUCTOR)  //构造函数
 @Target(ElementType.LOCAL_VARIABLE)  //局部变量
 @Target(ElementType.ANNOTATION_TYPE)  //注解
 @Target(ElementType.PACKAGE)  //包
 */

/**
*@Retention

表示需要在什么级别保存该注释信息，用于描述注解的生命周期。

RetentionPolicy.SOURCE：注解只保留在源文件，当Java文件编译成class文件的时候，注解被遗弃。
RetentionPolicy.CLASS：注解被保留到class文件，但jvm加载class文件时候被遗弃，这是默认的生命周期。
RetentionPolicy.RUNTIME：注解在运行时有效(运行时保留)。*/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidHeader {
}
