package com.sunnsoft.yunpi.util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.math.BigDecimal;
import java.util.*;

/**
 * @description:ArrayList、JSONArray 根据key 排序;
 * @author rk
 */
public abstract class CollectionUtils
{
	/**
	 * ArrayList<HashMap<String, Object>> 格式 排序
	 * @author rk
	 * @param listMap 数据列表 ArrayList<HashMap<String, Object>>
	 * @param propName 排序的keyname
	 * @param dir asc 正序 desc 倒序
	 */
	public static void listMapSort(ArrayList<HashMap<String, Object>> listMap,final String propName,final String dir) {
		if(propName != null && listMap.size() > 0) {
			HashMap<String, Object> checkPropName = listMap.get(0);
			if(checkPropName.get(propName) != null) {
				Collections.sort(listMap,new Comparator<HashMap<String, Object>>() {
					@Override
					public int compare(HashMap<String, Object> o1, HashMap<String, Object> o2) {
						try {
							BigDecimal value1 = new BigDecimal(o1.get(propName).toString());
							BigDecimal value2 = new BigDecimal(o2.get(propName).toString());
							
							if("DESC".equals(dir) || "desc".equals(dir)) {
								return value2.compareTo(value1);
							}else if("asc".equals(dir) || "ASC".equals(dir)) {
								return value1.compareTo(value2);
							}
							return 0;
							
						} catch (Exception e) {
							//不能转BigDecimal的就用字符串比较吧
							Object aa = o1.get(propName);
							Object bb = o2.get(propName);
							if(aa == null ) {
								aa = "";
							}
							if(bb == null ) {
								bb = "";
							}
							String value1 = aa.toString();
							String value2 = bb.toString();
							if("DESC".equals(dir) || "desc".equals(dir)) {
								return value2.compareTo(value1);
							}else if("asc".equals(dir) || "ASC".equals(dir)) {
								return value1.compareTo(value2);
							}
							return 0;
						}
					}
				});
			}
		}
	}
	
	/**
	 * JSONArray 排序
	 * @param jsonStockObj [{a:bb},{a:dd}]
	 * @param propName 排序的keyname
	 * @param dir asc 正序 desc 倒序
	 * @author rk
	 * @date:2018-03-13
	 */
	@SuppressWarnings("unchecked")
	public static void jsonArraySort(JSONArray jsonStockObj,final String propName,final String dir) {
		if(propName !=null && jsonStockObj.size() > 0) {
			JSONObject checkPropName = (JSONObject) jsonStockObj.get(0);
			if(checkPropName.get(propName) != null) {
				
				Collections.sort(jsonStockObj, new Comparator<JSONObject>() {
					@Override
					public int compare(JSONObject o1, JSONObject o2) {
						try {
							BigDecimal value1 = new BigDecimal(o1.get(propName).toString());
							BigDecimal value2 = new BigDecimal(o2.get(propName).toString());
							
							if("DESC".equals(dir) || "desc".equals(dir)) {
								return value2.compareTo(value1);
							}else if("asc".equals(dir) || "ASC".equals(dir)) {
								return value1.compareTo(value2);
							}
							return 0;
							
						} catch (Exception e) {
							//不能转BigDecimal的就用字符串比较吧
							String value1 = (String)o1.get(propName);
							String value2 =  (String) o2.get(propName);
							if("DESC".equals(dir) || "desc".equals(dir)) {
								return value2.compareTo(value1);
							}else if("asc".equals(dir) || "ASC".equals(dir)) {
								return value1.compareTo(value2);
							}
							return 0;
						}
					}
			    });
			};
		}
	}
}
