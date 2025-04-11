package edu.uptc.swii.libraryapp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Libro{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "imagen_url")
    private String imagenUrl;
    @ManyToOne
    private Editorial editorial;

    public Integer getId(){return id;}
    public void setId(Integer id){this.id = id;}
    public String getNombre(){return nombre;}
    public void setNombre(String name){this.nombre = name;}
    public String getDescripcion(){return descripcion;}
    public void setDescripcion(String descripcion){this.descripcion = descripcion;}
    public String getImagenUrl(){return imagenUrl;}
    public void setImagenUrl(String imangeUrl){this.imagenUrl = imangeUrl;}
    public Editorial getEditorial(){return editorial;}
    public void setEditorial(Editorial editorial){this.editorial = editorial;}
}