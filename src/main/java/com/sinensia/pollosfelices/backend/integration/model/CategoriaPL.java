package com.sinensia.pollosfelices.backend.integration.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CATEGORIAS")
public class CategoriaPL implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID")
	private Long codigo;
	
	private String nombre;
	
	public CategoriaPL() {
		
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaPL other = (CategoriaPL) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "CategoriaPL [codigo=" + codigo + ", nombre=" + nombre + "]";
	}

}