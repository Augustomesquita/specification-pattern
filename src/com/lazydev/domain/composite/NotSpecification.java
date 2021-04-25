package com.lazydev.domain.composite;

public class NotSpecification<T> extends CompositeSpecification<T> {

    private Specification<T> rule;

    public NotSpecification(Specification<T> rule) {
        this.rule = rule;
    }

    @Override public boolean isSatisfiedBy(T t) {
        return !rule.isSatisfiedBy(t);
    }
}
