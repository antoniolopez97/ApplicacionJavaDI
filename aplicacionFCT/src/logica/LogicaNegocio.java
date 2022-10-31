/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import aplicacionFCT.dto.Alumno;
import java.util.ArrayList;
import java.util.List;
import aplicacionFCT.dto.Empresas;
import java.util.Date;
/**
 *
 * @author AntonioLópezMielgo
 */
public class LogicaNegocio {
     private static List<Alumno> listaAlumno=new ArrayList<>();
   
    
     private static List<Empresas> listaEmpresa=new ArrayList<>();

   
     
      public static void Mostrar(Alumno alumno ){
        
      listaAlumno.add(new Alumno("Juan Carlos Martinez Navas", "59226662W", "656624415", "jcmartinez@gmail.com", "DAM", "Junio",alumno.getFechaInicio(),alumno.getFechaFinal(),"Santander", "Angel Vallano Moreno", "56127242P", "653482218", "anvallano@gmail.com"));
      listaAlumno.add(new Alumno("Andres Gurasa Hurtado", "59235773T", "6678355526", "anguarasa@gmail.com", "Comercio", "Junio",alumno.getFechaInicio(),alumno.getFechaFinal(),"Mercadona", "Luis Parro Garcia", "573456834X", "653488932", "luispa@gmail.com"));
      listaAlumno.add(new Alumno("Raquel Martinez Torre", "47962584Q", "68995423", "ramartinez@gmail.com", "Administracion y Fianzas", "Junio",alumno.getFechaInicio(),alumno.getFechaFinal(),"Santander", "AinoaTorrado Ocaña", "56684423P", "65355442", "aitorrado@gmail.com"));

    }
     
    public static void aniadir(Alumno alumno ){
       
      listaAlumno.add(alumno);
       System.out.println("se añadido un añumno "+alumno.prueba());
    }
     public static void aniadirEmpresa(Empresas empresa ){
    listaEmpresa.add(empresa);
    }

    public static List<Alumno> getListaAlumnos() {
        return listaAlumno;
    }
    public static List<Empresas> getListaEmpresa() {
        return listaEmpresa;
    }
}
