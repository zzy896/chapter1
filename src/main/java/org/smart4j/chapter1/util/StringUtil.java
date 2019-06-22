package org.smart4j.chapter1.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zzy
 * @desc StringUtil.class
 * @date 2019/6/2 20:21
 * 字符串工具类
 */
public final class StringUtil {
    /**
     * 判断字符串是否为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     *
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
