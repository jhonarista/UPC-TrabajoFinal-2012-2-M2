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
        this.datos.add(new Cliente("Jhon", "Arista", "Apolinario", "jhonarista@gmail.com", "75687692", "3852312", "23/02/2012", "no"));
        this.datos.add(new Cliente("Victor", "Villa", "Vila", "vvilla@gmail.com", "74378343", "2643768", "19/04/2012", "yes"));
        this.datos.add(new Cliente("Juan", "Perez", "Mesa", "jperez@gmail.com", "59038572", "2258849", "12/06/2012", "no"));
        return datos;
    }
    
    private String cadena;
  
    private String resultBusqueda = "";
 
    ArrayList<Cliente> db_Temp = new ArrayList<Cliente>();
    ArrayList<Cliente> db_Temp2 = new ArrayList<Cliente>();
    
    
    public String buscarClientePorNombre(String nombre){
    
    
        tablaDeClientes();   
        
        if(nombre.equals("")){
            nombre = "No busque nada";
            resultBusqueda = "Debe ingresar datos a buscar";
        }
     
        cadena = nombre.substring(0,1).toUpperCase() + nombre.substring(1, nombre.length());
        
        int longitud = datos.size();
        
            for(int i = 0; i<longitud;i++){
               
                String NombreBuscado = datos.get(i).getNombre();
               
                if (NombreBuscado.equals(cadena)){
                  
                    db_Temp.add(datos.get(i));
            
                resultBusqueda = datos.get(i).getNombre();
                
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
    
    public String buscarClientePorApellidoPaterno(String apellidoPaterno){
        
       
        tablaDeClientes();
        
       
        if(apellidoPaterno.equals("")){
            apellidoPaterno = "No busque nada";
            resultBusqueda = "Debe ingresar datos a buscar";
        }
  
        cadena = apellidoPaterno.substring(0,1).toUpperCase() + apellidoPaterno.substring(1, apellidoPaterno.length());
        int longitud = datos.size();
            for(int i = 0; i<longitud;i++){
            
                String PaternoBuscado = datos.get(i).getApellidoPaterno();
           
                if (PaternoBuscado.equals(cadena)){
                
                    db_Temp.add(datos.get(i));
                    
                resultBusqueda = datos.get(i).getApellidoPaterno();
                
                }
            }
                if (db_Temp.size()>0){
                    for (int j=0; j<db_Temp.size();j++){
                        System.out.println("SU BÚSQUEDA POR APELLIDO PATERNO MUESTRA LOS SIGUIENTES RESULTADOS\t" + "\n");
                        mostrar(j);
                    }
                }else{
                resultBusqueda = "No se encontraron registros para los filtros ingresados";
                }
        return resultBusqueda;    
    }
      
    public String buscarClientePorApellidoMaterno(String apellidoMaterno){
        
       
        tablaDeClientes();
        
     
        if(apellidoMaterno.equals("")){
            apellidoMaterno = "No busque nada";
            resultBusqueda = "Debe ingresar datos a buscar";
        }
        
        cadena = apellidoMaterno.substring(0,1).toUpperCase() + apellidoMaterno.substring(1, apellidoMaterno.length());
        int longitud = datos.size();
            for(int i = 0; i<longitud;i++){
            
                String MaternoBuscado = datos.get(i).getApellidoMaterno();
           
                if (MaternoBuscado.equals(cadena)){
                
                    db_Temp.add(datos.get(i));
                    
                resultBusqueda = datos.get(i).getApellidoMaterno();
                
                }
            }
                if (db_Temp.size()>0){
                    for (int j=0; j<db_Temp.size();j++){
                        System.out.println("SU BÚSQUEDA POR APELLIDO MATERNO MUESTRA LOS SIGUIENTES RESULTADOS\t" + "\n");
                        mostrar(j);
                    }
                }else{
                resultBusqueda = "No se encontraron registros para los filtros ingresados";
                }
        return resultBusqueda;    
    }
    
     public String buscarClientePorDNI(String DNI){
        
   
        tablaDeClientes();
 
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
        System.out.println("Nombre: \t" + "\t" + db_Temp.get(indice).getNombre());
        System.out.println("Apellido Paterno: \t" + db_Temp.get(indice).getApellidoPaterno());
        System.out.println("Apellido Materno: \t" + db_Temp.get(indice).getApellidoMaterno());
        System.out.println("Email: \t" + "\t" + "\t" + db_Temp.get(indice).getMail());
        System.out.println("Fecha de contacto: \t" + db_Temp.get(indice).getContact_date());
        System.out.println("Telefono: \t" + "\t" + db_Temp.get(indice).getTelefono());
        System.out.println("Transacción: \t" + "\t" + db_Temp.get(indice).getTransaccion());
        System.out.println("\n" + "---------------------------------");
    }
}
            

