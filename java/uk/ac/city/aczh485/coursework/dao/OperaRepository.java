package uk.ac.city.aczh485.coursework.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.city.aczh485.coursework.entites.OperaUser;

/**
 * Class to access the database table backing the OperaUser entity.
 */
@Repository
public interface OperaRepository extends JpaRepository<OperaUser, String> {

}
