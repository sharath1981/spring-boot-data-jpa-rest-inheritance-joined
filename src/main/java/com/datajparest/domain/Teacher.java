package com.datajparest.domain;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Teacher extends Person {
	private Long salary;
}
