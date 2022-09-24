package ar.org.centro8.curso.java.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import ar.org.centro8.curso.java.enums.EstadoCivil;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;
    private String nombre;
    private String apellido;
    @Enumerated(value = EnumType.STRING)
    private EstadoCivil estadoCivil;
    private String cuit;
    private String direccion;
    private String telefono;
    private String email;
    private String comentarios;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, EstadoCivil estadoCivil, String cuit, String direccion,
            String telefono, String email, String comentarios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.cuit = cuit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.comentarios = comentarios;
    }

    public Cliente(Integer id, String nombre, String apellido, EstadoCivil estadoCivil, String cuit, String direccion,
            String telefono, String email, String comentarios) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.cuit = cuit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Cliente [apellido=" + apellido + ", comentarios=" + comentarios + ", cuit=" + cuit + ", direccion="
                + direccion + ", email=" + email + ", estadoCivil=" + estadoCivil + ", id=" + id + ", nombre=" + nombre
                + ", telefono=" + telefono + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
  
}
