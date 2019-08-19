package org.tutorial.jpa.tuto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="TUTORIAL.USER")
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="ID_USER")
	private Long id;
	@Column(name="USER_NAME")
	private String name;
	@Column(name="USER_AGE")
	private Long age;
		
}