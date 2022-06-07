package com.ljh.middleware.db.router.strategy.impl;

import com.ljh.middleware.db.router.strategy.IDBRouterStrategy;

/**
 * Created with IntelliJ IDEA.
 * Description: 哈希路由
 *
 * @Author: ljh
 * DateTime: 2022-06-07 20:38
 */
public class DBRouterStrategyHashCode implements IDBRouterStrategy {

    @Override
    public void doRouter(String dbKeyAttr) {

    }

    @Override
    public void setDBKey(int dbIdx) {

    }

    @Override
    public void setTBKey(int tbKey) {

    }

    @Override
    public int dbCount() {
        return 0;
    }

    @Override
    public int tbCount() {
        return 0;
    }

    @Override
    public void clear() {

    }
}
