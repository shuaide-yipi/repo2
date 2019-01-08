package com.itheima.demo.repository;

import com.itheima.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface UserRepository extends JpaSpecificationExecutor<User> ,JpaRepository<User,Long>{
    public List<User> findAll();
}
