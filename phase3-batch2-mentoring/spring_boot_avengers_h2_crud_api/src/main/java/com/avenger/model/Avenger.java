package com.avenger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@NoArgsConstructor
@Setter
@Getter
//@ToString
//@EqualsAndHashCode
public class Avenger {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String speciality;
	private int age;
	
	@Lob
	@Column(columnDefinition = "CLOB")
	private String avatar;
}
