package com.lazydev.domain.simple.user;

import java.util.Arrays;

import com.lazydev.domain.simple.Specification;
import com.lazydev.model.User;

public class PartyAccess implements Specification<User> {

    private User user;

    @Override public boolean isSatisfiedBy(User user) {
        this.user = user;
        return validateCompany() && validateAge() || validateVip();
    }

    private boolean validateCompany() {
        if (Arrays.asList("guarasoftware", "lazydev").contains(user.getCompany().toLowerCase())) {
            System.out.println("It is a company member.");
            return true;
        }
        System.out.println("It is NOT a company member.");
        return false;
    }

    private boolean validateAge() {
        if (user.getAge() >= 18) {
            System.out.println("It is NOT under age.");
            return true;
        }
        System.out.println("It is under age.");
        return false;
    }

    private boolean validateVip() {
        if (Arrays.asList("augusto", "alexandre", "roberta").contains(user.getName().toLowerCase())) {
            System.out.println("It is a VIP.");
            return true;
        }
        System.out.println("It is NOT a VIP.");
        return false;
    }



}
