package com.rocket.queue.service;

import org.apache.rocketmq.client.producer.SendResult;

/**
 * @author sql
 * @version 1.0.0
 * @date 2021/8/25 10:15
 */
public interface RocketMqService {
    SendResult openAccountMsg (String msgInfo) ;
}
