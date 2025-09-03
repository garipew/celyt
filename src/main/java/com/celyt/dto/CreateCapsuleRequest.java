package com.celyt.dto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

public class CreateCapsuleRequest {
	@Email
	private String sender;
	@Email
	private String reciever;
	
	private LocalDate creationDate;

	@Future
	private LocalDate sendDate;
	@NotBlank
	private String content;

	public String getSender(){
		return this.sender;
	}
	public String getReciever(){
		return this.reciever;
	}
	public LocalDate getCreationDate(){
		return this.creationDate;
	}
	public LocalDate getSendDate(){
		return this.sendDate;
	}
	public String getContent(){
		return this.content;
	}

	public void setCreationDate(LocalDate date){
		this.creationDate = date;
	}
}
