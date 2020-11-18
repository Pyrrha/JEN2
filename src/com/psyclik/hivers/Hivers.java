package com.psyclik.hivers;

import java.util.Optional;

public class Hivers {

    public Hivers() {}

    public <T> void addProvider(T classToBind) {}

    public <T> Optional<T> instanceOf(T classToInstantiate) {
        return Optional.of(classToInstantiate);
    }

    public <T> T instanceOfOrThrow(T classToInstantiate) {
        return instanceOf(classToInstantiate).orElseThrow();
    }
}
