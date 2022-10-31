/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacionFCT.dto;

/**
 *
 * @author AntonioLópezMielgo
 */
public class Empresas {
     private String nombreEmpresa;
        private String cifEmpresa;
        private String telefonoEmpresa;
        private String direccionEmpresa;
        private String emailEmpresa;
        private String nombreTutor;
        private String dniTutor;
        private String telefonoTutor;
        private String emailTutor;
        private String nombreRep;
        private String dniRep;
        private String telefonoRep;
        private String emailRep;

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCifEmpresa() {
        return cifEmpresa;
    }

    public void setCifEmpresa(String cifEmpresa) {
        this.cifEmpresa = cifEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public String getDniTutor() {
        return dniTutor;
    }

    public void setDniTutor(String dniTutor) {
        this.dniTutor = dniTutor;
    }

    public String getTelefonoTutor() {
        return telefonoTutor;
    }

    public void setTelefonoTutor(String telefonoTutor) {
        this.telefonoTutor = telefonoTutor;
    }

    public String getEmailTutor() {
        return emailTutor;
    }

    public void setEmailTutor(String emailTutor) {
        this.emailTutor = emailTutor;
    }

    public String getNombreRep() {
        return nombreRep;
    }

    public void setNombreRep(String nombreRep) {
        this.nombreRep = nombreRep;
    }

    public String getDniRep() {
        return dniRep;
    }

    public void setDniRep(String dniRep) {
        this.dniRep = dniRep;
    }

    public String getTelefonoRep() {
        return telefonoRep;
    }

    public void setTelefonoRep(String telefonoRep) {
        this.telefonoRep = telefonoRep;
    }

    public String getEmailRep() {
        return emailRep;
    }

    public void setEmailRep(String emailRep) {
        this.emailRep = emailRep;
    }
      

    public Empresas(String nombreEmpresa, String cifEmpresa, String telefonoEmpresa, String direccionEmpresa, String emailEmpresa, String nombreTutor, String dniTutor, String telefonoTutor, String emailTutor, String nombreRep, String dniRep, String telefonoRep, String emailRep) {
        this.nombreEmpresa = nombreEmpresa;
        this.cifEmpresa = cifEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.emailEmpresa = emailEmpresa;
        this.nombreTutor = nombreTutor;
        this.dniTutor = dniTutor;
        this.telefonoTutor = telefonoTutor;
        this.emailTutor = emailTutor;
        this.nombreRep = nombreRep;
        this.dniRep = dniRep;
        this.telefonoRep = telefonoRep;
        this.emailRep = emailRep;
    }
     
         public String[] toArrayString(){
    String[]e=new String[13];
    e[0]=nombreEmpresa;
    e[1]= cifEmpresa;
    e[2]=telefonoEmpresa;
    e[3]=direccionEmpresa;
    e[4]=emailEmpresa;
    e[5]=nombreTutor;
    e[6]=dniTutor;
    e[7]=telefonoTutor;
    e[8]=emailTutor;
    e[9]=nombreRep;
    e[10]=dniRep;
    e[11]=telefonoRep;
    e[12]=emailRep;

    return e;
    }
        
    
    
    
    
    
    
}
