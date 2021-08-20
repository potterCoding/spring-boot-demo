package com.reminis.orm.jpa.repository;

import com.reminis.orm.jpa.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * User Dao
 * </p>
 *
 * @author sql
 * @version 1.0.0
 * @date 2021/8/20 16:12
 */
@Repository
public interface DepartmentDao extends JpaRepository<Department, Long> {
    /**
     * 根据层级查询部门
     *
     * @param level 层级
     * @return 部门列表
     */
    List<Department> findDepartmentsByLevels(Integer level);
}
