package nn.oksam90.GestionProduit.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produits")
public class Produit implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ref")
	private Long reference;
	
	@Column(name="des")
	private String desigantion;
	
	@Column(name="prix")
	private double prix;
	
	@Column(name="qte")
	private int quantite;
	
	
	//Getters et Setters

	public Long getReference() {
		return reference;
	}

	public void setReference(Long reference) {
		this.reference = reference;
	}

	public String getDesigantion() {
		return desigantion;
	}

	public void setDesigantion(String desigantion) {
		this.desigantion = desigantion;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	//Constructeur par défaut

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
