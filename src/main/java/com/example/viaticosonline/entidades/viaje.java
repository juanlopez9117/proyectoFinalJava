package com.example.viaticosonline.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name="viajes")
public class viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name = "destino")
    private String destino;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fechaInicio")
    private String fechaInicio;

    @Column(name = "fechaFin")
    private String fechaFin;

    @Column(name = "gastosPasaje")
    private double gastosPasaje;

    @Column(name = "gastosTransporte")
    private double gastosTransporte;

    @Column(name = "gastosAlimentacion")
    private double gastosAlimentacion;


    public viaje() {
    }
    
    @OneToMany(mappedBy = "empleado")
    private list<viaje> viajes = new ArrayList<viaje>()





    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getGastosPasaje() {
        return gastosPasaje;
    }

    public void setGastosPasaje(double gastosPasaje) {
        this.gastosPasaje = gastosPasaje;
    }

    public double getGastosTransporte() {
        return gastosTransporte;
    }

    public void setGastosTransporte(double gastosTransporte) {
        this.gastosTransporte = gastosTransporte;
    }

    public double getGastosAlimentacion() {
        return gastosAlimentacion;
    }

    public void setGastosAlimentacion(double gastosAlimentacion) {
        this.gastosAlimentacion = gastosAlimentacion;
    }

}
