package com.seata.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author sql
 * @version 1.0.0
 * @date 2021/8/24 16:39
 */
@FeignClient("seata-order")
public interface OrderFeign {

    @GetMapping("/createOrder")
    Integer createOrder (@RequestParam("orderNo") String orderNo) ;
}
