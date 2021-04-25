package com.lazydev.domain.composite.user;

import java.util.Arrays;

import com.lazydev.domain.composite.CompositeSpecification;
import com.lazydev.model.User;

public class VipValidation extends CompositeSpecification<User> {

    @Override public boolean isSatisfiedBy(User user) {
        if (Arrays.asList("augusto", "alexandre", "roberta").contains(user.getName().toLowerCase())) {
            System.out.println("It is a VIP.");
            return true;
        }
        System.out.println("It is NOT a VIP.");
        return false;
    }

}
