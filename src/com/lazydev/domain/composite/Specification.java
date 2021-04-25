package com.lazydev.domain.composite;

public interface Specification<T> {

    boolean isSatisfiedBy(T t);

    Specification<T> and(Specification<T> other);

    Specification<T> or(Specification<T> other);

    Specification<T> not();
}
