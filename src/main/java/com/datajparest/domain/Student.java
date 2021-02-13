package com.datajparest.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student extends Person {
	@Enumerated(EnumType.STRING)
	private Result result;
}
