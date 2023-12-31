package com.pack.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Solde {
	long id;
	private User user;
	private double valeur;

	public Solde() {

	}

	public Solde(User user, double valeur) {
		super();
		this.user = user;
		this.valeur = valeur;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_user", nullable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/*
	 * public Boolean getActive() { return active; }
	 * 
	 * public void setActive(Boolean active) { this.active = active; }
	 */

	public double getValeur() {
		return valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return "Solde [id=" + id + ", user=" + user + ", valeur=" + valeur + "]";
	}

}
