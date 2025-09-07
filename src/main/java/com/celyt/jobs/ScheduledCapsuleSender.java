package com.celyt.jobs;
import com.celyt.entity.Capsule;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

import com.celyt.repository.CapsuleRepository;

@Component
public class ScheduledCapsuleSender {
    private final CapsuleRepository repo;

    public ScheduledCapsuleSender(CapsuleRepository repo) {
        this.repo = repo;
    }

    @Scheduled(cron = "0 0 8 * * *")
    public void scheduledSendTask(){
	    List<Capsule> toSend = repo.findBySendDate(LocalDate.now());
	    for(Capsule cap : toSend){
		    System.out.println("Sending capsule from '" + cap.getSender() + "' to '" + cap.getReciever() + "'.");
	    } 
    }
}
