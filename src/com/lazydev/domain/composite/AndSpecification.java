package com.lazydev.domain.composite;

public class AndSpecification<T> extends CompositeSpecification<T> {

    private Specification<T> leftRule;
    private Specification<T> rightRule;

    public AndSpecification(Specification<T> leftRule, Specification<T> rightRule) {
        this.leftRule = leftRule;
        this.rightRule = rightRule;
    }

    @Override public boolean isSatisfiedBy(T t) {
        return leftRule.isSatisfiedBy(t) && rightRule.isSatisfiedBy(t);
    }
}
