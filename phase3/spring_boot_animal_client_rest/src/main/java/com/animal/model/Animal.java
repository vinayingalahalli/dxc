package com.animal.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Entity
//@Table
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Animal {
//	@Id
//	@GeneratedValue
	private int id;
	private String name;
	private int age;
	private String category;
}
