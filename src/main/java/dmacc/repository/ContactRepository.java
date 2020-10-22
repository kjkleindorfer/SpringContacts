package dmacc.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import dmacc.beans.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> { 

}

