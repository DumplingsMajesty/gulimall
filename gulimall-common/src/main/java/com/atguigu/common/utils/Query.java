/**
 * Copyright (c) 2016-2019 浜轰汉寮�婧� All rights reserved.
 *
 * https://www.renren.io
 *
 * 鐗堟潈鎵�鏈夛紝渚垫潈蹇呯┒锛�
 */

package com.atguigu.common.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.atguigu.common.utils.Constant;
import com.atguigu.common.xss.SQLFilter;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

/**
 * 鏌ヨ鍙傛暟
 *
 * @author Mark sunlightcs@gmail.com
 */
public class Query<T> {

    public IPage<T> getPage(Map<String, Object> params) {
        return this.getPage(params, null, false);
    }

    public IPage<T> getPage(Map<String, Object> params, String defaultOrderField, boolean isAsc) {
        //鍒嗛〉鍙傛暟
        long curPage = 1;
        long limit = 10;

        if(params.get(Constant.PAGE) != null){
            curPage = Long.parseLong((String)params.get(Constant.PAGE));
        }
        if(params.get(Constant.LIMIT) != null){
            limit = Long.parseLong((String)params.get(Constant.LIMIT));
        }

        //鍒嗛〉瀵硅薄
        Page<T> page = new Page<>(curPage, limit);

        //鍒嗛〉鍙傛暟
        params.put(Constant.PAGE, page);

        //鎺掑簭瀛楁
        //闃叉SQL娉ㄥ叆锛堝洜涓簊idx銆乷rder鏄�氳繃鎷兼帴SQL瀹炵幇鎺掑簭鐨勶紝浼氭湁SQL娉ㄥ叆椋庨櫓锛�
        String orderField = SQLFilter.sqlInject((String)params.get(Constant.ORDER_FIELD));
        String order = (String)params.get(Constant.ORDER);


        //鍓嶇瀛楁鎺掑簭
        if(StringUtils.isNotEmpty(orderField) && StringUtils.isNotEmpty(order)){
            if(Constant.ASC.equalsIgnoreCase(order)) {
                return  page.addOrder(OrderItem.asc(orderField));
            }else {
                return page.addOrder(OrderItem.desc(orderField));
            }
        }

        //娌℃湁鎺掑簭瀛楁锛屽垯涓嶆帓搴�
        if(StringUtils.isBlank(defaultOrderField)){
            return page;
        }

        //榛樿鎺掑簭
        if(isAsc) {
            page.addOrder(OrderItem.asc(defaultOrderField));
        }else {
            page.addOrder(OrderItem.desc(defaultOrderField));
        }

        return page;
    }
}
