package edu.iims.mcs.oops.week8.generic.genericclass;

public class MyGeneric<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    T get() {
        return t;
    }

}
