package com.orc.sandbox.common.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseDao<T, P> extends JpaRepository<T, P>, JpaSpecificationExecutor<T> {
}
