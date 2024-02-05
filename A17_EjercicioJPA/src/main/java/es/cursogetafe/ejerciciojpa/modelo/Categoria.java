package es.cursogetafe.ejerciciojpa.modelo;
import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable{


	private int idCategoria;
	private String categoria;
	private double salarioConvenio;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getSalarioConvenio() {
		return salarioConvenio;
	}
	public void setSalarioConvenio(double salarioConvenio) {
		this.salarioConvenio = salarioConvenio;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idCategoria);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return idCategoria == other.idCategoria;
	}
	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", categoria=" + categoria + ", salarioConvenio="
				+ salarioConvenio + "]";
	}
	
}
