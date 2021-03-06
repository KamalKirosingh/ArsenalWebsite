package uk.ac.city.aczh485.coursework.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.city.aczh485.coursework.entites.Booking;

/**
 * Class to access the database table backing the Booking entity.
 */
@Repository
public interface BookingRepository extends JpaRepository<Booking, String> {
}
