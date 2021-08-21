package com.reminis.ehcahe.service;

import com.reminis.ehcahe.entity.User;

/**
 * @author sql
 * @version 1.0.0
 * @date 2021/8/21 11:12
 */
public interface UserService {
    /**
     * 保存或修改用户
     *
     * @param user 用户对象
     * @return 操作结果
     */
    User saveOrUpdate(User user);

    /**
     * 获取用户
     *
     * @param id key值
     * @return 返回结果
     */
    User get(Long id);

    /**
     * 删除
     *
     * @param id key值
     */
    void delete(Long id);
}
