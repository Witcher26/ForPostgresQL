package ru.devmark.postgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.devmark.Profile;
import ru.devmark.ProfileService;

@Primary
@Service
public class ProfileServiceImpl implements ProfileService {

    private final ProfileDao profileDao;

    @Autowired
    public ProfileServiceImpl(ProfileDao profileDao) {
        this.profileDao = profileDao;
    }

    @Override
    public Profile getProfile(int personId) {
        return profileDao.getProfileById(personId)
                .orElseThrow(() -> new ProfileNotFoundException(personId));
    }
}
