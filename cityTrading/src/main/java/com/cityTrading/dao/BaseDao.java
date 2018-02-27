package com.cityTrading.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * 基础dao类
 * @author Administrator
 *
 */
@NoRepositoryBean
public interface BaseDao<T,ID extends Serializable> extends JpaRepository<T, Serializable>{

}
