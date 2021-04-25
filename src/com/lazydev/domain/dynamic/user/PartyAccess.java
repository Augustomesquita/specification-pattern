package com.lazydev.domain.dynamic.user;

import java.util.Arrays;

import com.lazydev.domain.dynamic.Specification;
import com.lazydev.model.User;

public class PartyAccess implements Specification<User> {

    private Integer minimumAge;
    private User user;

    public PartyAccess(Integer minimumAge) {
        this.minimumAge = minimumAge;
    }

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
        if (user.getAge() >= this.minimumAge) {
            System.out.println("It is a valid age.");
            return true;
        }
        System.out.println("It is NOT a valid age.");
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
