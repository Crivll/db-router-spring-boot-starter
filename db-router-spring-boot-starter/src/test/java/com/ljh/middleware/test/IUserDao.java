package com.ljh.middleware.test;

import com.ljh.middleware.db.router.annotation.DBRouter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: ljh
 * DateTime: 2022-06-08 15:12
 */
public interface IUserDao {

    @DBRouter(key = "userId")
    void insertUser(String req);
}
