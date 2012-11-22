package Admin;

import Entity.Cliente;
import java.util.ArrayList;

/**
 *
 * @author feral
 */
public class AdminCliente {
    
    public ArrayList<Cliente> datos = new ArrayList<Cliente>();
    
   public ArrayList<Cliente> tablaDeClientes() {
        this.datos.add(new Cliente("Hernan", "Gonzales", "Pardo", "hgonzales@gmail.com", "75687692", "3852312", "23/02/2012", "no"));
        this.datos.add(new Cliente("Daniel", "Pastor", "Paredes", "dpastor@gmail.com", "74378343", "2643768", "19/04/2012", "yes"));
        this.datos.add(new Cliente("Luis", "Angulo", "Mesa", "langulo@gmail.com", "59038572", "2258849", "12/06/2012", "no"));
        return datos;
    }
    
    private String cadena;
  
    private String resultBusqueda = "";
 
    ArrayList<Cliente> db_Temp = new ArrayList<Cliente>();
    ArrayList<Cliente> db_Temp2 = new ArrayList<Cliente>();
    
    public String buscarClientePorNombre(String name){
    
        tablaDeClientes();
        
        if(name.equals("")){
            
            name = "No busque nada";
            
            resultBusqueda = "Debe ingresar datos a buscar";
        
            cadena = name.substring(0,1).toUpperCase() + name.substring(1, name.length());   
           
         int longitud = datos.size();
                
            for(int i = 0; i<longitud;i++){
               
                String NombreBuscado = datos.get(i).getName();
             
                if (NombreBuscado.equals(cadena)){
                    
                }
                    db_Temp.add(datos.get(i));
                    
                resultBusqueda = datos.get(i).getName();
                
                      }
            }
        
        if (db_Temp.size()>0){
                    for (int j=0; j<db_Temp.size();j++){
                        System.out.println("SU BÚSQUEDA POR NOMBRE MUESTRA LOS SIGUIENTES RESULTADOS\t" + "\n");
        
        mostrar(j);
                        
          }
                }else{
                resultBusqueda = "No se encontraron registros para los filtros ingresados";
                }
        return resultBusqueda;    
                                            
}
    
        public String buscarClientePorDNI(String DNI){
        
        //##########################CARGA_BASE DE DATOS#############
        tablaDeClientes();
        //##########################INGRESO_VACIO###################
        if(DNI.equals("")){
            DNI = "No busque nada";
            return resultBusqueda = "Debe ingresar datos a buscar";
        }
        
        int longitud = datos.size();
            for(int i = 0; i<longitud;i++){
            
                String DNIBuscado = datos.get(i).getDNI();
           
                if (DNIBuscado.equals(DNI)){
                
                    db_Temp.add(datos.get(i));
                    
                resultBusqueda = datos.get(i).getDNI();
                
                }
            }
                if (db_Temp.size()>0){
                    for (int j=0; j<db_Temp.size();j++){
                        System.out.println("SU BÚSQUEDA POR DNI MUESTRA LOS SIGUIENTES RESULTADOS\t" + "\n");
                        mostrar(j);
                    }
                }else{
                resultBusqueda = "No se encontraron registros para los filtros ingresados";
                }
        return resultBusqueda;    
    }
    public void mostrar(int indice){
        tablaDeClientes();
        
        System.out.println("DNI: \t" + "\t" + "\t" + db_Temp.get(indice).getDNI());
        System.out.println("Nombre: \t" + "\t" + db_Temp.get(indice).getName());
        System.out.println("Apellido Paterno: \t" + db_Temp.get(indice).getSurname1());
        System.out.println("Apellido Materno: \t" + db_Temp.get(indice).getSurname2());
        System.out.println("Email: \t" + "\t" + "\t" + db_Temp.get(indice).getMail());
        System.out.println("Fecha de contacto: \t" + db_Temp.get(indice).getContact_date());
        System.out.println("Telefono: \t" + "\t" + db_Temp.get(indice).getTelefono());
        System.out.println("Transacción: \t" + "\t" + db_Temp.get(indice).getTransaccion());
        System.out.println("\n" + "---------------------------------");
    }
}
            

