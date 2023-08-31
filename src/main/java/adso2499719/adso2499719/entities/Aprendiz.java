package adso2499719.adso2499719.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "aprendices")
public class Aprendiz {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre",length = 100,nullable = false)
	private String nombre;
	
	@Column(name = "nombre",length = 100,nullable = false)
	private String apellido;
	
	@ManyToOne
	@JoinColumn (name = "grado_id", nullable = false)
	private String grado;
	
	@Column(name = "created_at", nullable = false )	
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime uptatadAT;
	
	@Column(name = "deleted_at")
	private LocalDateTime deletedAt;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getGrado() {
		return grado;
	}


	public void setGrado(String grado) {
		this.grado = grado;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public LocalDateTime getUptatadAT() {
		return uptatadAT;
	}


	public void setUptatadAT(LocalDateTime uptatadAT) {
		this.uptatadAT = uptatadAT;
	}


	public LocalDateTime getDeletedAt() {
		return deletedAt;
	}


	public void setDeletedAt(LocalDateTime deletedAt) {
		this.deletedAt = deletedAt;
	}
	
}
