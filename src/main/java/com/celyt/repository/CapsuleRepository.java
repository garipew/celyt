package com.celyt.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.celyt.entity.Capsule;

public interface CapsuleRepository extends JpaRepository<Capsule, Long> {
	Capsule findBySender(String sender);
}
