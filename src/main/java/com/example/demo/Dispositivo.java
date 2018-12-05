
package com.example.demo;


public class Dispositivo {
    
    private int id_dispositivo;
    private String fecha;
    private String hora;
    private String hora_de_uso;
    private int cant_disparos;
    private float nievel_bateria;
    private int codigo_error;
    
    public Dispositivo(){
        
    }
    
    public Dispositivo(int id_dispositivo, String fecha, String hora, String hora_de_uso, int cant_disparos, float nivel_batreria, int codigo_erros){
        
        this.id_dispositivo = id_dispositivo;
        this.fecha = fecha;
        this.hora = hora;
        this.hora_de_uso = hora_de_uso;
        this.cant_disparos = cant_disparos;
        this.nievel_bateria = nivel_batreria;
        this.codigo_error = codigo_error;
    }

    public int getId_dispositivo() {
        return id_dispositivo;
    }

    public void setId_dispositivo(int id_dispositivo) {
        this.id_dispositivo = id_dispositivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora_de_uso() {
        return hora_de_uso;
    }

    public void setHora_de_uso(String hora_de_uso) {
        this.hora_de_uso = hora_de_uso;
    }

    public int getCant_disparos() {
        return cant_disparos;
    }

    public void setCant_disparos(int cant_disparos) {
        this.cant_disparos = cant_disparos;
    }

    public float getNievel_bateria() {
        return nievel_bateria;
    }

    public void setNievel_bateria(float nievel_bateria) {
        this.nievel_bateria = nievel_bateria;
    }

    public int getCodigo_error() {
        return codigo_error;
    }

    public void setCodigo_error(int codigo_error) {
        this.codigo_error = codigo_error;
    }
    
    
}
