/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacionFCT.gui.tablemodels;

import aplicacionFCT.dto.Alumno;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AntonioLópezMielgo
 */
public class AlumnosTableModel extends AbstractTableModel{

        private List<Alumno>listAlumno;
       //Array con el nombre de las Columnas
        private  String[] columnas={"Nombre","DNI","Telefono","E-mail","Etapa","Fecha Comienzo","Fecha Final","Ciclo","Empresa","Profesor","DNI","Telefono","E-mail"};
        
        public AlumnosTableModel(List<Alumno> listAlumno){
        this.listAlumno=listAlumno;
        }
    
    @Override
    //Devolvemos las filas
    public int getRowCount() {
        return listAlumno.size();
    }

    @Override
    //Devolvemos las Columnas
    public int getColumnCount() {
        return columnas.length;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listAlumno.get(rowIndex).getNombre();
            case 1:
                return listAlumno.get(rowIndex).getDni();
            case 2:
                return listAlumno.get(rowIndex).getTelefono();
            case 3:
                return listAlumno.get(rowIndex).getEmail();
            case 4:
              return listAlumno.get(rowIndex).getEtapa();
            case 5:               
                return listAlumno.get(rowIndex).getFechaInicio();
            case 6:
                 return listAlumno.get(rowIndex).getFechaFinal();
            case 7:
                  return listAlumno.get(rowIndex).getCiclo();
            case 8:
                return listAlumno.get(rowIndex).getEmpresa();
            case 9:
                return listAlumno.get(rowIndex).getNombreprofesor();
            case 10:
                return listAlumno.get(rowIndex).getDniprofesor();
            case 11:
                return listAlumno.get(rowIndex).getTelefonoprofesor();
            case 12:
                return listAlumno.get(rowIndex).getEmailprofesor();
           
        }
        return null;
        
    }
    //
    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
    
    
}
