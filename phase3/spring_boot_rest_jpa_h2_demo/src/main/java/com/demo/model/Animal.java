package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Animal {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	private String category;
	
	@Lob
	@Column(columnDefinition = "CLOB")
	private String avatar;
}
