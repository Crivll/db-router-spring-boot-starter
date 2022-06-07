package com.ljh.middleware.db.router.dynamic;

import com.ljh.middleware.db.router.DBContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created with IntelliJ IDEA.
 * Description: 动态数据源获取
 *
 * @Author: ljh
 * DateTime: 2022-06-07 20:35
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return "db" + DBContextHolder.getDBKey();
    }
}
