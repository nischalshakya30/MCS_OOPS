package edu.iims.mcs.oops.week8.daopatternwithgenerics.dao;

import edu.iims.mcs.oops.week8.daopatternwithgenerics.model.BaseModel;

import java.util.List;

public interface GenericDao<T extends BaseModel> {

    void save(T t);

    void update(T t, Long id);

    void delete(Long id);

    List<T> findAll();

    T findOne(Long id);

}
