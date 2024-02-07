package es.cursogetafe.ejerciciojpa.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente extends Rol implements Serializable{

	private int nroCliente;
	private String categoria;
	private List<Producto> productos;
	
	public Cliente(){
		setRol("CLIENTE");
	}

	public int getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@ManyToMany
	@JoinTable(name = "clientes_productos", 
				joinColumns = @JoinColumn (name = "idrol"),
				inverseJoinColumns = @JoinColumn(name = "idProducto"))
	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Cliente [nroCliente=" + nroCliente + ", categoria=" + categoria + ", productos=" + productos + ", idRol="+ getIdRol() + "]";
	}
	
}
