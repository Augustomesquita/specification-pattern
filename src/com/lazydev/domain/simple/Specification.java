package com.lazydev.domain.simple;

public interface Specification<T> {

    boolean isSatisfiedBy(T t);
}
