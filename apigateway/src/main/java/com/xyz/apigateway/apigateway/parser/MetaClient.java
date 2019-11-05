package com.xyz.apigateway.apigateway.parser;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MetaClient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	private String nombre;
    private String identificacion;
    
    public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipo_id() {
		return tipo_id;
	}
	public void setTipo_id(String tipo_id) {
		this.tipo_id = tipo_id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getLugar_nacimiento() {
		return lugar_nacimiento;
	}
	public void setLugar_nacimiento(String lugar_nacimiento) {
		this.lugar_nacimiento = lugar_nacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	public String getDireccion_residencia() {
		return direccion_residencia;
	}
	public void setDireccion_residencia(String direccion_residencia) {
		this.direccion_residencia = direccion_residencia;
	}
	public String getLugar_residencia() {
		return lugar_residencia;
	}
	public void setLugar_residencia(String lugar_residencia) {
		this.lugar_residencia = lugar_residencia;
	}
	public String getDireccion_trabajo() {
		return direccion_trabajo;
	}
	public void setDireccion_trabajo(String direccion_trabajo) {
		this.direccion_trabajo = direccion_trabajo;
	}
	public String getTelefono_personal() {
		return telefono_personal;
	}
	public void setTelefono_personal(String telefono_personal) {
		this.telefono_personal = telefono_personal;
	}
	public String getTelefono_trabajo() {
		return telefono_trabajo;
	}
	public void setTelefono_trabajo(String telefono_trabajo) {
		this.telefono_trabajo = telefono_trabajo;
	}
	public String getTipo_persona() {
		return tipo_persona;
	}
	public void setTipo_persona(String tipo_persona) {
		this.tipo_persona = tipo_persona;
		
	}
	public String toString()
	{
		return "";
	}
	
	 
    private String tipo_id;
    private int edad;
    private String fecha_nacimiento;
    private String lugar_nacimiento;
    private String nacionalidad;
    private String genero;
    private String estado_civil;
    private String direccion_residencia;
    private String lugar_residencia;
    private String direccion_trabajo;
    private String telefono_personal;
    private String telefono_trabajo;
    private String tipo_persona;
    

} 
