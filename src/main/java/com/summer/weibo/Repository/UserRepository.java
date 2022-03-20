package com.summer.weibo.Repository;

import com.summer.weibo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Summer
 * @Since 2022/3/20 10:01 PM
 * @Version 1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
