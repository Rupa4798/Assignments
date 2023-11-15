package com.cg;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="debit")
public class Debit extends Account {
	@Column(name="interest")
	float interest;

	public Debit(float interest) {
		super();
		this.interest = interest;
	}

	public Debit() {
		super();
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}
	
	

}
