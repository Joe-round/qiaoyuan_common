package com.qiaoyuan.common.utils;

import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 
 * @ClassName: AssertUtilTest
 * @Description: 测试类
 * @author:qy
 * @date: 2019年7月15日 上午9:06:20
 */
public class AssertUtilTest {
	/**
	 * 
	 * @Title: testIsTrue
	 * @Description: ：断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息。
	 * @return: void
	 */
	@Test
	public void testIsTrue() {
		AssertUtil.isTrue(2 < 1, "断言为假");
	}

	/**
	 * 
	 * @Title: testIsFalse
	 * @Description: 断言为假，如果为真，则抛出自定义异常，异常消息为第2个参数默认消息。
	 * @return: void
	 */
	@Test
	public void testIsFalse() {
		AssertUtil.isFalse(1 < 1, "断言为真");
	}

	/**
	 * 
	 * @Title: testNotNull
	 * @Description: 断言对象不为空，如果为空，则抛出自定义异常，异常消息为第2个参数默认消息
	 * @return: void
	 */
	@Test
	public void testNotNull() {
		AssertUtil.notNull(new String("1"), "对象为空");
	}

	/**
	 * 
	 * @Title: testIsNull
	 * @Description: ：断言对象必须空，如果不为空，则抛出自定义异常，异常消息为第2个参数默认消息。
	 * @return: void
	 */
	@Test
	public void testIsNull() {
		AssertUtil.isNull(new String("1"), "对象不为空");
	}

	/**
	 * 
	 * @Title: testNotEmptyCollectionOfQString
	 * @Description: 断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。
	 * @return: void
	 */
	@Test
	public void testNotEmptyCollectionOfQString() {
		ArrayList<Object> arr = new ArrayList();
//		arr.add("1");
		AssertUtil.notEmpty(arr, "集合为空");
	}

	/**
	 * 
	 * @Title: testNotEmptyMapOfQQString
	 * @Description:断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息
	 * @return: void
	 */
	@Test
	public void testNotEmptyMapOfQQString() {
		Map<Object,Object> map = new HashMap<>();
//		map.put("1",1);
		AssertUtil.notEmpty(map, "Map集合为空");
	}
	/**
	 * 
	 * @Title: testHasText 
	 * @Description: 断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常，异常消息为第2个参数默认消息
	 * @return: void
	 */
	@Test
	public void testHasText() {
		String str = " 1 ";
		AssertUtil.hasText(str, "字符串为空");
	}
	/**
	 * 
	 * @Title: testGreaterThanZero 
	 * @Description: 断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息
	 * @return: void
	 */
	@Test
	public void testGreaterThanZero() {
		BigDecimal ba = new BigDecimal("0");
		AssertUtil.greaterThanZero(ba, "值小于等于0");
	}

}
