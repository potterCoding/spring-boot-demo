package com.reminis.orm.jdbctemplate.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * 主键注解
 * </p>
 *
 * @author sql
 * @date Created in 2021-08-20 15:34
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Pk {
    /**
     * 自增
     *
     * @return 自增主键
     */
    boolean auto() default true;
}
