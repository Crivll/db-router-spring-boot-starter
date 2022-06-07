package com.ljh.middleware.db.router;

/**
 * Created with IntelliJ IDEA.
 * Description: 数据源基础配置
 *
 * @Author: ljh
 * DateTime: 2022-06-07 18:23
 */
public class DBRouterBase {

    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }
}
