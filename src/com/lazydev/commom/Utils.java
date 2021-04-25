package com.lazydev.commom;

import java.util.Arrays;
import java.util.List;

import com.lazydev.model.User;

public class Utils {

    public static List<User> getUsers() {
        return Arrays.asList(
                new User("Augusto", 16, "LazyDev"),
                new User("Gisele", 16, "LazyDev"),
                new User("Alessandra", 18, "GuaraSoftware"),
                new User("Alexandre", 18, "GuaraSoftware"),
                new User("Roberto", 21, "IntrusoSoftware"),
                new User("Roberta", 21, "IntrusoSoftware")
        );
    }

}
