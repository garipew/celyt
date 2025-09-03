package com.celyt.controller;
import com.celyt.dto.CreateCapsuleRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.time.LocalDate;

@RestController
public class CapsulesController {
	@PostMapping("/capsules/new")
	public ResponseEntity<CreateCapsuleRequest> sendCapsule(@RequestBody CreateCapsuleRequest capsule){
		capsule.setCreationDate(LocalDate.now());
		return ResponseEntity.status(HttpStatus.CREATED).body(capsule);
	}
}
