package com.zoser.dao;

import com.zoser.pojo.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestDao extends JpaRepository<Test, Integer>, JpaSpecificationExecutor<Test> {
}
