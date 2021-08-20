package com.reminis.orm.jpa.repository;

import com.reminis.orm.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author sql
 * @version 1.0.0
 * @date 2021/8/20 16:13
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
