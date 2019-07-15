package com.qiaoyuan.common.utils;
/**
 * 
 * @ClassName: CMSRunTimeExption 
 * @Description:自定义运行时异常类
 * @author:qy
 * @date: 2019年7月15日 上午8:42:02
 */
public class CMSRunTimeExption extends RuntimeException{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * @Title:CMSRunTimeExption
	 * @Description:无参构造
	 */
	public CMSRunTimeExption() {
		super();
	}
	/**
	 * 
	 * @Title:CMSRunTimeExption
	 * @Description:有参构造 
	 * @param massage
	 */
	public CMSRunTimeExption(String massage) {
		super(massage);
	}
}
