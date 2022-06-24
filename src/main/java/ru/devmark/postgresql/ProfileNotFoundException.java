package ru.devmark.postgresql;

import java.rmi.UnexpectedException;

public class ProfileNotFoundException extends RuntimeException {
    public ProfileNotFoundException(int personId) {
        super("UnexpectedException" + " у" + personId);
    }
}
