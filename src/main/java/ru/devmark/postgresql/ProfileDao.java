package ru.devmark.postgresql;

import ru.devmark.*;

import java.util.Optional;

public interface ProfileDao {

    Optional<Profile> getProfileById(int id);
}

