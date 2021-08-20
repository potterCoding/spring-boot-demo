package com.reminis.exception.handler.exception;

import com.reminis.exception.handler.constant.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 异常基类
 * </p>
 *
 * @author sql
 * @version 1.0.0
 * @date 2021/8/20 15:12
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseException extends RuntimeException {
    private Integer code;
    private String message;

    public BaseException(Status status) {
        super(status.getMessage());
        this.code = status.getCode();
        this.message = status.getMessage();
    }

    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
