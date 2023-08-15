package com.dytech.m3d2.entidades;


import org.hibernate.annotations.Type;
import org.springframework.data.repository.query.Parameters;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="administradores")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="nome", nullable = false)
	private String nome;
	@Column(name="email",nullable = false)
	private String email;
	@Column(name="Senha",nullable = false)
	private String senha;
	@Column(name="obs")
	private String obs;
	

}
