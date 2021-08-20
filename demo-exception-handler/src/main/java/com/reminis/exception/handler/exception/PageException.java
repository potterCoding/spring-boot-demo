package com.reminis.exception.handler.exception;

import com.reminis.exception.handler.constant.Status;

/**
 * <p>
 * 页面异常
 * </p>
 *
 * @author sql
 * @version 1.0.0
 * @date 2021/8/20 15:14
 */
public class PageException extends BaseException {

    public PageException(Status status) {
        super(status);
    }

    public PageException(Integer code, String message) {
        super(code, message);
    }
}
