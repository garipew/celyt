package com.celyt.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.celyt.entity.Capsule;

import java.time.LocalDate;
import java.util.List;

public interface CapsuleRepository extends JpaRepository<Capsule, Long> {
	List<Capsule> findBySender(String sender);
    List<Capsule> findBySendDate(LocalDate sendDate);
}
