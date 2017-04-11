package com.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
    public interface BaseDao<T> {
        public void save(T entity);

        public void update(T entity);

        public void delete(Serializable id);

        public T findById(Serializable id);

        public List<T> findByHQL(String hql, String... params);
    }

