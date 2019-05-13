package com.orc.sandbox.base.service;

import com.orc.sandbox.base.dao.BaseDao;

public class BaseService <T, P, D extends BaseDao<T, P>> {

    D dao;


}
