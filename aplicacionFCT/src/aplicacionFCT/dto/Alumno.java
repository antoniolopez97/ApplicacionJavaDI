/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacionFCT.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author AntonioLópezMielgo
 */
public class Alumno 
{
    
    
    private SimpleDateFormat sdfa= new SimpleDateFormat("dd-MM-yyyy");
    private String nombre;
    private String dni;
    private String telefono;
    private String email;
    private String ciclo;
    private String etapa;
    private String fechaInicio;
    
    private String fechaFinal;
    private String empresa;
    private String nombreprofesor;
    private String dniprofesor;
    private String telefonoprofesor;
    private String emailprofesor;
   
   
    public Alumno(String nombre, String dni, String telefono, String email, String ciclo,String etapa ,String fechaInicio, 
            String fechaFinal, String empresa, String nombreprofesor, String dniprofesor, String telefonoprofesor, String emailprofesor) {
       
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.ciclo = ciclo;
        this.etapa=etapa;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.empresa = empresa;
        this.nombreprofesor = nombreprofesor;
        this.dniprofesor = dniprofesor;
        this.telefonoprofesor = telefonoprofesor;
        this.emailprofesor = emailprofesor;
    }


    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNombreprofesor() {
        return nombreprofesor;
    }

    public void setNombreprofesor(String nombreprofesor) {
        this.nombreprofesor = nombreprofesor;
    }

    public String getDniprofesor() {
        return dniprofesor;
    }

    public void setDniprofesor(String dniprofesor) {
        this.dniprofesor = dniprofesor;
    }

    public String getTelefonoprofesor() {
        return telefonoprofesor;
    }

    public void setTelefonoprofesor(String telefonoprofesor) {
        this.telefonoprofesor = telefonoprofesor;
    }

    public String getEmailprofesor() {
        return emailprofesor;
    }

    public void setEmailprofesor(String emailprofesor) {
        this.emailprofesor = emailprofesor;
    }
    /*
    public String[] toArrayString(){
    String[]a=new String[13];
    a[0]=nombre;
    a[1]= dni;
    a[2]=telefono.toString();
    a[3]=email;
    a[4]=ciclo;
    a[5]=etapa;
    a[6]=sdfa.format(fechaInicio);
    a[7]=sdfa.format(fechaFinal);
    a[8]=empresa;
    a[9]=nombreprofesor;
    a[10]=dniprofesor;
    a[11]=telefonoprofesor.toString();
    a[12]=emailprofesor;
    
    
    
    
    return a;
    }
    */
    
    public String prueba(){
    String datos= nombre+ dni+telefono+email+ciclo+etapa+sdfa.format(fechaInicio)+sdfa.format(fechaFinal)+empresa+nombreprofesor+dniprofesor+telefonoprofesor+emailprofesor;
    return datos;
    }
}
