package ru.devmark;

public class ProfileNotFoundException extends RuntimeException {
    public ProfileNotFoundException(int personId) {
        super("пользователь с id: " + personId + " не найден");
    }
}
