package com.dytech.m3d2.entidades;



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

@AllArgsConstructor
@NoArgsConstructor
public class Admin {

	@Id
	@Getter
	@Setter
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha.substring(0,3 )+ "****";
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	
	

}
