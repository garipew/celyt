package com.celyt.controller;
import com.celyt.dto.CreateCapsuleRequest;
import com.celyt.repository.CapsuleRepository;
import com.celyt.entity.Capsule;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.time.LocalDate;

@RestController
public class CapsuleController {
	private final CapsuleRepository repo;

	public CapsuleController(CapsuleRepository repo){
		this.repo = repo;
	}

	@PostMapping("/capsules/new")
	public ResponseEntity<CreateCapsuleRequest> sendCapsule(@RequestBody CreateCapsuleRequest capsule){
		capsule.setCreationDate(LocalDate.now());
	
		Capsule newCapsule = new Capsule();
		newCapsule.setSender(capsule.getSender());
		newCapsule.setReciever(capsule.getReciever());
		newCapsule.setCreationDate(capsule.getCreationDate());
		newCapsule.setSendDate(capsule.getSendDate());
		newCapsule.setContent(capsule.getContent());
		repo.save(newCapsule);
		return ResponseEntity.status(HttpStatus.CREATED).body(capsule);
	}
}
