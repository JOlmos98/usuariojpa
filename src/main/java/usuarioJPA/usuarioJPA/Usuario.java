package usuarioJPA.usuarioJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	
	//Variables:
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	private String email;
	private String password;	
	
	//Contructor:
	
	public Usuario() {}
	
	public Usuario(String nombre, String email, String password) {
		this.nombre=nombre;
		this.email=email;
		this.password=password;
	}
	
	//Métodos:
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}

	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}

	@Override
	public String toString() {return "Usuario: " + id + "\nNombre: " + nombre + "\nEmail: " + email + "\nPassword: " + password;}
	
	
	
	
}