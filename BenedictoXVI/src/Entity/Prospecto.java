
package Entity;

import java.lang.reflect.Array;


public class Prospecto {
    public String [] crearProspecto(String nombre,String ape_pat,String ape_mat,String correo,String dni,String telefono,String fec_contac){
        String [] prospecto;
        prospecto = new String [7];
        
        prospecto[0]=nombre;
        prospecto[1]=ape_pat;
        prospecto[2]=ape_mat;
        prospecto[3]=correo;
        prospecto[4]=dni;
        prospecto[5]=telefono;
        prospecto[6]=fec_contac;
        
        return prospecto;
    }
    
    public String [] borrarDatos(String DNI){
        String [] prospecto = new String[7];
        
        prospecto[0]="Jorge";
        prospecto[1]="Vilchez";
        prospecto[2]="Perez";
        prospecto[3]="jvilchez@upc.edu.pe";
        prospecto[4]="11223344";
        prospecto[5]="1233212";
        prospecto[6]="30112012";
        
        if (prospecto[4] == DNI){
            for (int x=0; x<7; x++){
                prospecto[x] = "";
            }
        }
        
        return prospecto;
    }
}