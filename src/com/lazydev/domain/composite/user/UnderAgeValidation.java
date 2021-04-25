package com.lazydev.domain.composite.user;

import com.lazydev.domain.composite.CompositeSpecification;
import com.lazydev.model.User;

public class UnderAgeValidation extends CompositeSpecification<User> {

    @Override public boolean isSatisfiedBy(User user) {
        if (user.getAge() < 18) {
            System.out.println("It is under age.");
            return true;
        }
        System.out.println("It is NOT under age.");
        return false;
    }

}
