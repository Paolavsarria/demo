package com.example.demo;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
            
		SpringApplication.run(DemoApplication.class, args);
                
        
        String url= "jdbc:postgresql://ec2-54-204-40-248.compute-1.amazonaws.com/d8bnr659h0vgvr";
        String usuario = "ucwkndgkicpewr";
        String contrasenia = "fc5aafa538823e44f8281dd5d9933591f810a3cfc078df665200dfd6d37fe72b";
        
                
   try{
            
        Class.forName("org.postgresql.Driver");
        Connection conexion = DriverManager.getConnection(url,usuario,contrasenia);
        java.sql.Statement sentencia = conexion.createStatement();
        String sql =  "SELECT * FROM dispositivo";
        ResultSet resultado = sentencia.executeQuery(sql);
        
        while(resultado.next()){
            
            float id_dispositivo = resultado.getFloat("id_dispositivo");
            Date fecha = resultado.getDate("fecha");
            float hora = resultado.getFloat("hora");
            float hora_de_uso = resultado.getFloat("hora_de_uso");
            int cant_disparos = resultado.getInt("cant_disparos");
            float nivel_bateria = resultado.getFloat("nivel_bateria");
            int codigo_error = resultado.getInt("codigo_error");
            
            System.out.println( "fecha: "+ fecha +" \t"+  "hora: "  + hora + "\t" +   
                    "id_dispositivo: " + id_dispositivo + "\t" +  "hora_de_uso: " + 
                     hora_de_uso + "\t " +  "cant_disparos: " + cant_disparos +
                    "\t" +  "nivel_bateria: "+ nivel_bateria + "\t" +  "codigo_error: " +
                    codigo_error);
            
            
        }
        
        resultado.close();
        sentencia.close();
        conexion.close();
    }catch(Exception e){
            System.out.println("Error de conexion:" + e.getMessage());
    }
    
 }
                
                }


                

