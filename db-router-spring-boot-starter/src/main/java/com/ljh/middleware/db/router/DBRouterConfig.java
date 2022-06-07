package com.ljh.middleware.db.router;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Description: 数据路由配置
 *
 * @Author: ljh
 * DateTime: 2022-06-07 17:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DBRouterConfig {

    /**
     * 分库数量
     */
    private int dbCount;

    /**
     * 分表数量
     */
    private int tbCount;

    /**
     * 路由字段
     */
    private String routerKey;
}
