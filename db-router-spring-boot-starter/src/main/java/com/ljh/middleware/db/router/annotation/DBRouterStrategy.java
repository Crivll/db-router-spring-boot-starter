package com.ljh.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * Description: 路由策略，分表标记
 *
 * @Author: ljh
 * DateTime: 2022-06-07 17:14
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouterStrategy {

    /**
     * 是否需要进行分表
     * @return
     */
    boolean splitTable() default false;
}
