package com.ljh.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * Description: 路由注解
 *
 * @Author: ljh
 * DateTime: 2022-06-07 17:11
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface DBRouter {

    /**
     * 分库分表字段
     * @return
     */
    String key() default "";
}
