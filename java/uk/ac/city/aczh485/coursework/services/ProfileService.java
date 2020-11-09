package uk.ac.city.aczh485.coursework.services;

import uk.ac.city.aczh485.coursework.entites.CollatedUser;

/**
 * Profile service interface that specifies a method to return a CollatedUser.
 */
public interface ProfileService {

    CollatedUser getProfile(String email);
}
