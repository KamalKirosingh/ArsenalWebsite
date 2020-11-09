package uk.ac.city.aczh485.coursework.services;

import uk.ac.city.aczh485.coursework.entites.OperaUser;

/**
 * Registration service interface that specifies a method to save user information to the database.
 */
public interface RegistrationService {

    void registerUser(OperaUser operaUser);
}
