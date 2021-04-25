package com.lazydev.domain.dynamic;

public interface Specification<T> {

    boolean isSatisfiedBy(T t);
}
