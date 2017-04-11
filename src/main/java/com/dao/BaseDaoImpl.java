package com.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
public class BaseDaoImpl implements BaseDao {
    @Override
    public void save(Object entity) {

    }

    @Override
    public void update(Object entity) {

    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public Object findById(Serializable id) {
        return null;
    }

    @Override
    public List findByHQL(String hql, String... params) {
        return null;
    }
}
