package fr.formation.groupeeleves.entite;

import java.util.Date;

public class Eleve extends Personne implements Comparable<Personne> {
	private Parent referent;

	public Eleve() {

	}

	public Eleve(String nom, String prenom, String adresse, Date ddn) {
		super(nom, prenom, adresse, ddn);
	}

	public Parent getReferent() {
		return referent;

	}

	public void setReferent(Parent referent) {
		this.referent = referent;
	}

	@Override
	public String toString() {
		return "Eleve [referent=" + referent + "]";
	}

	public int compareTo(Personne p) {
		
		return this.getPrenom().compareTo(p.getPrenom());
	}

}
