/**
 * 
 */
package de;

import origine.Origine;

/**
 * @author Lallement
 * La classe Face d�crit les faces du d� utilis� lors du jeu Pandocreon Divinae
 */
public class Face {
	/* ---------- Attributs ---------- */
	/**
	 * Origine de la face
	 */
	private Origine origineFace = null;
	
	/* ---------- Constructeurs ---------- */
	/**
	 * Constructeur avec argument.
	 * Lorsque l'on cr�e une face, on lui attribut automatiquement une origine.
	 * @param {Origine} origine : origine � attribuer � la face
	 */
	public Face(Origine origine) {
		this.origineFace = origine;
	}
	
	/* ---------- Getters & Setters ---------- */
	/**
	 * Accesseur permettant d'acc�der � l'origine d'une face
	 * @return
	 */
	public Origine getOrigineFace() {
		return this.origineFace;
	}
	
	/**
	 * Modificateur permettant la modification de l'origine d'une face
	 * @param {Origine} origineFace : origine � attribuer � la face
	 */
	public void setOrigineFace(Origine origineFace) {
		this.origineFace = origineFace;
	}
	
	/* ---------- M�thodes ---------- */
	/**
	 * Surcharge de la m�thode toString.
	 * @return {String} : retourne une cha�ne de caract�res indiquant l'origine de la face.
	 */
	@Override 
	public String toString() {
		return "Face obtenue: " + this.origineFace.toString();
	}
	
	/**
	 * M�thode de tests
	 * @param {String[]} args
	 */
	public static void main(String[] args) {

	}
}
