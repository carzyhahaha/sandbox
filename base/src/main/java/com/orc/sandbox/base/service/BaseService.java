package com.orc.sandbox.base.service;


import com.orc.sandbox.common.dao.BaseDao;

import javax.annotation.Resource;
import java.util.Optional;

public class BaseService<T, P, D extends BaseDao<T, P>>   {

    @Resource
    D dao;

    public T getOne(P id) {
        return  dao.getOne(id);
    }

    public <S extends T> S save(S s) {
        return dao.save(s);
    }

    public <S extends T> Iterable<S> saveAll(Iterable<S> iterable) {
        return dao.saveAll(iterable);
    }

    public Optional<T> findById(P p) {
        return dao.findById(p);
    }

    public boolean existsById(P p) {
        return dao.existsById(p);
    }
    
    public Iterable<T> findAll() {
        return dao.findAll();
    }
    
    public Iterable<T> findAllById(Iterable<P> iterable) {
        return dao.findAllById(iterable);
    }
    
    public long count() {
        return dao.count();
    }
    
    public void deleteById(P p) {
        dao.deleteById(p);
    }
    
    public void delete(T t) {
        dao.delete(t);
    }
    
    public void deleteAll(Iterable<? extends T> iterable) {
        dao.deleteAll(iterable);
    }
    
    public void deleteAll() {
        dao.deleteAllInBatch();
    }
}
