package fr.formation.groupeeleves.entite;

import java.util.ArrayList;
import java.util.List;

import fr.formation.groupeeleves.exception.ClasseException;

public class Classe {

	private String nom;
	private Instituteur Instituteur;

	private List<Eleve> lstEleves;

	public Classe() throws ClasseException {

	}

	public Classe(String nom) throws ClasseException {
		lstEleves = new ArrayList<Eleve>();
		this.nom = nom;
	}

	public void addEleve(Eleve e) {
		lstEleves.add(e);

	}

	public void removeEleve(Eleve e) {
		lstEleves.remove(e);

	}

	public Eleve getEleve(Integer i) {

		return lstEleves.get(i);

	}

	public void sortListEleve() {

	}

	public List<Eleve> getLstEleves() {
		return lstEleves;
	}

	public void setLstEleves(List<Eleve> lstEleves) {
		this.lstEleves = lstEleves;
	}

	public List<Parent> getListParent() {

		List<Parent> lstParent = new ArrayList<Parent>();
		for (Eleve eleve : lstEleves) {
			lstParent.add(eleve.getReferent());
		}
		return lstParent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Instituteur getInstituteur() {
		return Instituteur;
	}

	public void setInstituteur(Instituteur instituteur) {
		Instituteur = instituteur;
	}

	@Override
	public String toString() {
		return "Classe [nom=" + nom + ", Instituteur=" + Instituteur + ", lstEleves=" + lstEleves + "]";
	}

}
