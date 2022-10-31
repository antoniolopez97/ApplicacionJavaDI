/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacionFCT.dto;

/**
 *
 * @author anton
 */
public class Usuario {
    private String nombre ;
     private String  contrasena;
  
     
     
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
      
  
    
      public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
      public String[] toArrayStringU(){
        String[] u = new String[2];
        u[0] = nombre ;
        u[1] = contrasena;        
        return u;
}
}
