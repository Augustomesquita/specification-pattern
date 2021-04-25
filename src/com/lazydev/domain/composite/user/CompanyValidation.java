package com.lazydev.domain.composite.user;

import java.util.Arrays;

import com.lazydev.domain.composite.CompositeSpecification;
import com.lazydev.model.User;


public class CompanyValidation extends CompositeSpecification<User> {

    @Override public boolean isSatisfiedBy(User user) {
        if (Arrays.asList("guarasoftware", "lazydev").contains(user.getCompany().toLowerCase())){
            System.out.println("It is a company member.");
            return true;
        }
        System.out.println("It is NOT a company member.");
        return false;
    }

}
