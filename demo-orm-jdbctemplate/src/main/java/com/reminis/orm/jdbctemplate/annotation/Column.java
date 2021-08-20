package com.reminis.orm.jdbctemplate.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * 列注解
 * </p>
 *
 * @author sql
 * @date Created in 2021-08-20 15:34
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Column {
    /**
     * 列名
     *
     * @return 列名
     */
    String name();
}
