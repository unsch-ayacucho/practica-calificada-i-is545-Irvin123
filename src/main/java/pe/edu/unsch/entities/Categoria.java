package pe.edu.unsch.entities;
// Generated 16/07/2019 10:12:52 PM by Hibernate Tools 5.1.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Categoria generated by hbm2java
 */
@Entity
@Table(name = "categoria", catalog = "divisimabd")
public class Categoria implements java.io.Serializable {

	private int idcategoria;
	private String nombre;
	private String estado;
	private String descripcion;

	public Categoria() {
	}

	public Categoria(int idcategoria, String nombre, String estado, String descripcion) {
		this.idcategoria = idcategoria;
		this.nombre = nombre;
		this.estado = estado;
		this.descripcion = descripcion;
	}

	@Id

	@Column(name = "idcategoria", unique = true, nullable = false)
	public int getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "estado", nullable = false, length = 45)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Column(name = "descripcion", nullable = false, length = 45)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
