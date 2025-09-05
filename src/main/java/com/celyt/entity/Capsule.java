package com.celyt.entity;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Capsule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String sender;
	private String reciever;
	private LocalDate creationDate;
	private LocalDate sendDate;

	private String content;

	public Long getId(){
		return this.id;
	}
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
	public void setId(Long id){
		this.id = id;
	}
	public void setSender(String sender){
		this.sender = sender;
	}
	public void setReciever(String reciever){
		this.reciever = reciever;
	}
	public void setCreationDate(LocalDate creationDate){
		this.creationDate = creationDate;
	}
	public void setSendDate(LocalDate sendDate){
		this.sendDate = sendDate;
	}
	public void setContent(String content){
		this.content = content;
	}
}
