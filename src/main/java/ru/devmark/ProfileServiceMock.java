package ru.devmark;

import org.springframework.stereotype.Service;
import ru.devmark.postgresql.ProfileNotFoundException;

@Service
public class ProfileServiceMock implements ProfileService {

    @Override
    public Profile getProfile(int personId) {
        // имитируем обращение к БД
        if (personId == 123) {
            Profile profile = new Profile();
            profile.setId(personId);
            profile.setFirstName("Иван");
            profile.setLastName("Иванов");
            return profile;
        } else {
            throw new ProfileNotFoundException(personId);
        }
    }
}
