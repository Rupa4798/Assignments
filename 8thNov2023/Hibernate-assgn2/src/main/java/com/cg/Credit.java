package com.cg;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="credit")
public class Credit extends Account {
	@Column(name="overduelimit")
	float overduelimit;

	public float getOverduelimit() {
		return overduelimit;
	}

	public void setOverduelimit(float overduelimit) {
		this.overduelimit = overduelimit;
	}

	public Credit() {
		super();
	}

	@Override
	public String toString() {
		return "Credit [overduelimit=" + overduelimit + "]";
	}

	public Credit(float overduelimit) {
		super();
		this.overduelimit = overduelimit;
	}

}
