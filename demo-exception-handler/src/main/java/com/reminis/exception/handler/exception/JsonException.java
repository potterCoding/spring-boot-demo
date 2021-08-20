package com.reminis.exception.handler.exception;

import com.reminis.exception.handler.constant.Status;
import lombok.Getter;

/**
 * <p>
 * JSON异常
 * </p>
 *
 * @author sql
 * @version 1.0.0
 * @date 2021/8/20 15:13
 */
@Getter
public class JsonException extends BaseException {

    public JsonException(Status status) {
        super(status);
    }

    public JsonException(Integer code, String message) {
        super(code, message);
    }
}
