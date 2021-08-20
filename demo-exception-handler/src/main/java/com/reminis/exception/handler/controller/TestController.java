package com.reminis.exception.handler.controller;

import com.reminis.exception.handler.constant.Status;
import com.reminis.exception.handler.exception.JsonException;
import com.reminis.exception.handler.exception.PageException;
import com.reminis.exception.handler.model.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 * 测试Controller
 * </p>
 *
 * @author sql
 * @version 1.0.0
 * @date 2021/8/20 15:21
 */
@Controller
public class TestController {

    @GetMapping("/json")
    @ResponseBody
    public ApiResponse jsonException() {
        throw new JsonException(Status.UNKNOWN_ERROR);
    }

    @GetMapping("/page")
    public ModelAndView pageException() {
        throw new PageException(Status.UNKNOWN_ERROR);
    }
}
