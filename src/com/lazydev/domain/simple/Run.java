package com.lazydev.domain.simple;

import com.lazydev.commom.Utils;
import com.lazydev.domain.simple.user.PartyAccess;
import com.lazydev.model.User;

public class Run {

    public static void main(String[] args) {
        new Run().start();
    }

    private void start() {
        Utils.getUsers().forEach(user -> {
            if (hasPartyAccess(user)) {
                System.out.println(String.format("The user '%s' has access to the party.", user.getName()));
            } else {
                System.out.println(String.format("The user '%s' does NOT has access to the party.", user.getName()));
            }
            System.out.println();
        });
    }

    private boolean hasPartyAccess(User user) {
        System.out.println(String.format("Analyzing %s user...", user.getName()));
        return new PartyAccess().isSatisfiedBy(user);
    }

}