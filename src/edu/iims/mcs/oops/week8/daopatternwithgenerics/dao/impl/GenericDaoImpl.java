package edu.iims.mcs.oops.week8.daopatternwithgenerics.dao.impl;

import edu.iims.mcs.oops.week8.daopatternwithgenerics.dao.GenericDao;
import edu.iims.mcs.oops.week8.daopatternwithgenerics.model.BaseModel;
import edu.iims.mcs.oops.week8.daopatternwithoutgenerics.exception.NotFoundException;

import java.util.List;

public class GenericDaoImpl<T extends BaseModel> implements GenericDao<T> {

    private final List<T> list;

    public GenericDaoImpl(List<T> list) {
        this.list = list;
    }

    @Override
    public void save(T t) {
        list.add(t);
    }

    @Override
    public void update(T t, Long id) {
        T prevT = findOne(id);
        int prevIndex = list.indexOf(prevT);
        list.set(prevIndex, t);
    }

    @Override
    public void delete(Long id) {
        T t = findOne(id);
        list.remove(t);
    }

    @Override
    public List<T> findAll() {
        return list;
    }

    @Override
    public T findOne(Long id) {
        for (T t : list) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        throw new NotFoundException("The given id not found");
    }

}
