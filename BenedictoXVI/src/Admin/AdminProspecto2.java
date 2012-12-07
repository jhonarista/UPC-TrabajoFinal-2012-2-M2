package Admin;

import Entity.Cliente;
import Entity.Prospecto2;
import java.util.ArrayList;

public class AdminProspecto2 {
    private ArrayList<Prospecto2> misDatos = new ArrayList<Prospecto2>();
    private String miCadena1;
    //private String miCadena2;
    private String miResultadoBusqueda = "";
    //private int miIndice;
    AdminCliente clientes = new AdminCliente();
    ArrayList<Cliente> db_Cliente = new ArrayList<Cliente>();
    ArrayList<Prospecto2> miTemporal = new ArrayList<Prospecto2>();
    
    public ArrayList<Prospecto2> tablaDeProspectos(){
        this.misDatos.add(new Prospecto2("Victor", "Villa", "Vila", "vvilla@hotmail.com", "1", "998526288", "20/10/2012"));
        this.misDatos.add(new Prospecto2("Victor", "Picapiedra", "Picapiedra", "ppicapiedra@hotmail.com", "2", "999999999", "01/01/2012"));
        this.misDatos.add(new Prospecto2("Armando", "Yto", "Nakamoto", "ayto@hotmail.com", "3", "888888888", "10/10/2012"));
        this.misDatos.add(new Prospecto2("Hector", "Chafloque", "Salinas", "hchafloque@hotmail.com", "4", "777777777", "05/05/2012"));
        return misDatos;
    }
    
 /*   public String buscarProspectoPorNombre(String elNombre){
        tablaDeProspectos();
        
        if (elNombre.equals("")){
            //elNombre = "NO SE REALIZARON BUSQUEDAS"; PARA que es esto?
            miResultadoBusqueda = "DEBE INGRESAR DATOS A BUSCAR!!!";
        }
        
        miCadena1 = elNombre.substring(0, 1).toUpperCase() + elNombre.substring(1, elNombre.length());
        
        int tamannoArreglo = misDatos.size();
        for(int x = 0; x < tamannoArreglo; x++){
            String nombreEnArreglo = misDatos.get(x).getNombres();
            if(nombreEnArreglo.equals(miCadena1)){
                miTemporal.add(misDatos.get(x));
                miResultadoBusqueda = misDatos.get(x).getNombres();//aca para que se usa el nombre???
            }
        }
            if(miTemporal.size() > 0){
                for(int z=0; z<miTemporal.size(); z++){
                    System.out.println("RESULTADOS DE BUSQUEDA POR NOMBRE" + "\n");
                    mostrar(z);
                }
            }else{
                miResultadoBusqueda = "NO SE ENNCONTRO REGISTROS QUE COINCIDIERAN";
            }
        
        return miResultadoBusqueda;
    } */
    
  /* public String buscarProspectoPorApellidoPaterno(String elApellido){
        tablaDeProspectos();
        
        if (elApellido.equals("")){
            //elNombre = "NO SE REALIZARON BUSQUEDAS"; PARA que es esto?
            miResultadoBusqueda = "DEBE INGRESAR DATOS A BUSCAR!!!";
        }
        
        miCadena1 = elApellido.substring(0, 1).toUpperCase() + elApellido.substring(1, elApellido.length());
        
        int tamannoArreglo = misDatos.size();
        for(int x = 0; x < tamannoArreglo; x++){
            String paternoEnArreglo = misDatos.get(x).getApellidoPaterno();
            if(paternoEnArreglo.equals(miCadena1)){
                miTemporal.add(misDatos.get(x));
                miResultadoBusqueda = misDatos.get(x).getApellidoPaterno();//aca para que se usa el nombre???
            }
        }
            if(miTemporal.size() > 0){
                for(int z=0; z<miTemporal.size(); z++){
                    System.out.println("RESULTADOS DE BUSQUEDA POR APELLIDO PATERNO" + "\n");
                    mostrar(z);
                }
            }else{
                miResultadoBusqueda = "NO SE ENNCONTRO REGISTROS QUE COINCIDIERAN";
            }
        
        return miResultadoBusqueda;
    }*/
    
   /*  public String buscarProspectoPorApellidoMaterno(String elMaterno){
        tablaDeProspectos();
        
        if (elMaterno.equals("")){
            //elNombre = "NO SE REALIZARON BUSQUEDAS"; PARA que es esto?
            miResultadoBusqueda = "DEBE INGRESAR DATOS A BUSCAR!!!";
        }
        
        miCadena1 = elMaterno.substring(0, 1).toUpperCase() + elMaterno.substring(1, elMaterno.length());
        
        int tamannoArreglo = misDatos.size();
        for(int x = 0; x < tamannoArreglo; x++){
            String maternoEnArreglo = misDatos.get(x).getApellidoMaterno();
            if(maternoEnArreglo.equals(miCadena1)){
                miTemporal.add(misDatos.get(x));
                miResultadoBusqueda = misDatos.get(x).getApellidoMaterno();//aca para que se usa el nombre???
            }
        }
            if(miTemporal.size() > 0){
                for(int z=0; z<miTemporal.size(); z++){
                    System.out.println("RESULTADOS DE BUSQUEDA POR APELLIDO MATERNO" + "\n");
                    mostrar(z);
                }
            }else{
                miResultadoBusqueda = "NO SE ENNCONTRO REGISTROS QUE COINCIDIERAN";
            }
        
        return miResultadoBusqueda;
    }*/
    
    /* public String buscarProspectoPorCorreo(String elCorreo){
        tablaDeProspectos();
        
        if (elCorreo.equals("") || !elCorreo.contains("@") ){
            //elNombre = "NO SE REALIZARON BUSQUEDAS"; PARA que es esto?
            return miResultadoBusqueda = "DEBE INGRESAR DATOS A BUSCAR O ESCRIBIR CORRECTAMENTE EL CORREO!!!";
        }
        
        //miCadena1 = elMaterno.substring(0, 1).toUpperCase() + elMaterno.substring(1, elMaterno.length());
        
        int tamannoArreglo = misDatos.size();
        for(int x = 0; x < tamannoArreglo; x++){
            String correoEnArreglo = misDatos.get(x).getCorreo();
            if(correoEnArreglo.equals(elCorreo)){
                miTemporal.add(misDatos.get(x));
                miResultadoBusqueda = misDatos.get(x).getCorreo();//aca para que se usa el nombre???
            }
        }
            if(miTemporal.size() > 0){
                for(int z=0; z<miTemporal.size(); z++){
                    System.out.println("RESULTADOS DE BUSQUEDA POR CORREO" + "\n");
                    mostrar(z);
                }
            }else{
                miResultadoBusqueda = "NO SE ENNCONTRO REGISTROS QUE COINCIDIERAN";
            }
        
        return miResultadoBusqueda;
    }*/
    
     public String buscarProspectoPorDNI(String elDNI){
        tablaDeProspectos();
        
        if (elDNI.equals("")){
            //elDNI = "NO SE REALIZARON BUSQUEDAS"; PARA que es esto?
            return miResultadoBusqueda = "DEBE INGRESAR DATOS A BUSCAR!!!";
        }
        
        //miCadena1 = elMaterno.substring(0, 1).toUpperCase() + elMaterno.substring(1, elMaterno.length());
        
        int tamannoArreglo = misDatos.size();
        for(int x = 0; x < tamannoArreglo; x++){
            String dniEnArreglo = misDatos.get(x).getDni();
            if(dniEnArreglo.equals(elDNI)){
                miTemporal.add(misDatos.get(x));
                miResultadoBusqueda = misDatos.get(x).getDni();//aca para que se usa el nombre???
            }
        }
            if(miTemporal.size() > 0){
                for(int z=0; z<miTemporal.size(); z++){
                    System.out.println("RESULTADOS DE BUSQUEDA POR CORREO" + "\n");
                    mostrar(z);
                }
            }else{
                miResultadoBusqueda = "NO SE ENNCONTRO REGISTROS QUE COINCIDIERAN";
            }
        
        return miResultadoBusqueda;
    }
    
    /* public String buscarProspectoPorTelefono(String elTelefono){
        tablaDeProspectos();
        
        if (elTelefono.equals("")){
            //elDNI = "NO SE REALIZARON BUSQUEDAS"; PARA que es esto?
            return miResultadoBusqueda = "DEBE INGRESAR DATOS A BUSCAR!!!";
        }
        
        //miCadena1 = elMaterno.substring(0, 1).toUpperCase() + elMaterno.substring(1, elMaterno.length());
        
        int tamannoArreglo = misDatos.size();
        for(int x = 0; x < tamannoArreglo; x++){
            String telefonoEnArreglo = misDatos.get(x).getTelefono();
            if(telefonoEnArreglo.equals(elTelefono)){
                miTemporal.add(misDatos.get(x));
                miResultadoBusqueda = misDatos.get(x).getTelefono();//aca para que se usa el nombre???
            }
        }
            if(miTemporal.size() > 0){
                for(int z=0; z<miTemporal.size(); z++){
                    System.out.println("RESULTADOS DE BUSQUEDA POR TELEFONO" + "\n");
                    mostrar(z);
                }
            }else{
                miResultadoBusqueda = "NO SE ENNCONTRO REGISTROS QUE COINCIDIERAN";
            }
        
        return miResultadoBusqueda;
    }*/
    
    /* public String buscarProspectoPorFecha(String laFecha){
        tablaDeProspectos();
        
        if (laFecha.equals("")){
            //laFecha = "NO SE REALIZARON BUSQUEDAS"; PARA que es esto?
            return miResultadoBusqueda = "DEBE INGRESAR DATOS A BUSCAR!!!";
        }
        
        //miCadena1 = elMaterno.substring(0, 1).toUpperCase() + elMaterno.substring(1, elMaterno.length());
        
        int tamannoArreglo = misDatos.size();
        for(int x = 0; x < tamannoArreglo; x++){
            String fechaEnArreglo = misDatos.get(x).getFechaContacto();
            if(fechaEnArreglo.equals(laFecha)){
                miTemporal.add(misDatos.get(x));
                miResultadoBusqueda = misDatos.get(x).getFechaContacto();//aca para que se usa el nombre???
            }
        }
            if(miTemporal.size() > 0){
                for(int z=0; z<miTemporal.size(); z++){
                    System.out.println("RESULTADOS DE BUSQUEDA POR FECHA DE CONTACTO" + "\n");
                    mostrar(z);
                }
            }else{
                miResultadoBusqueda = "NO SE ENNCONTRO REGISTROS QUE COINCIDIERAN";
            }
        
        return miResultadoBusqueda;
    }*/
    
    /*public int agregarProspecto (String nombre, String apellidoPaterno, String apellidoMaterno, String correo, String dni, String telefono, String fechaContacto){
        boolean nombreVacio = validarFormato(nombre);
        boolean apellidoPaternoVacio = validarFormato(apellidoPaterno);
        boolean correoVacio = validarFormato(correo);
        
        int condicion = 0;
        
        tablaDeProspectos();
        db_Cliente = clientes.tablaDeClientes();
        
        for(Prospecto2 prospecto :misDatos){
            if(prospecto.getDni().equals(dni)){
                condicion = 1;
                System.out.println("EL PROSPECTO YA EXISTE!!!");
            }
        }
        
        for(Cliente cliente :db_Cliente){
            if(cliente.getDNI().equals(dni)){
                condicion = 1;
                System.out.println("EL PROSPECTO YA ES UN CLIENTE!!!");
            }
        }
        
        if(nombreVacio == true || apellidoPaternoVacio == true || correo.equals("")){
            System.out.println("NOBRE, APELLIDO PATERNO Y CORREO SON CAMPOS OBLIGATORIOS");
            condicion = 1;
        }
        
        if (condicion == 0){
            Prospecto2 nuevoProspecto = new Prospecto2(nombre, apellidoPaterno, apellidoMaterno, correo, dni, telefono, fechaContacto);
            misDatos.add(nuevoProspecto);
            
            System.out.println("PROSPECTO AGREGADO CORRECTAMENTE");
            System.out.println("DNI: " + dni);
            System.out.println("NOMBRE: " + nombre);
            System.out.println("APELLIDO PATERNO: " + apellidoPaterno);
            System.out.println("APELLIDO MATERNO: " + apellidoMaterno);
            System.out.println("CORREO: " + correo);
            System.out.println("TELEFONO: " + telefono);
            System.out.println("FECHA CONTACTO: " + fechaContacto);
        }else{
            System.out.println("EL PROSPECTO NO FUE AGREGADO");
        }
        
        return condicion;
    }*/
    
   /* public int eliminarProspecto(String dni){
        int condicion = 0;
        tablaDeProspectos();
        
        for(int i=0; i<misDatos.size(); i++){
            String valorEliminar = misDatos.get(i).getDni();
            if (valorEliminar.equals(dni)){
                System.out.println("EL REGISTRO CON DNI " + misDatos.get(i).getDni() + " FUE ELIMINADO!!!");
                condicion = 1;
                
                misDatos.remove(i);
                
            }
        }
        if (condicion==0){
            System.out.println("EL REGISTRO CON DNI " + dni + " NO FUE ELIMINADO!!!");
        }
        return condicion;
    }*/
    
    public int actualizaProspecto(String nombre, String apellidoPaterno, String apellidoMaterno, String correo, String dni, String telefono, String fechaContacto ){
        int validar = 0;//para que?
        Prospecto2 p = new Prospecto2(nombre, apellidoPaterno, apellidoMaterno, correo, dni, telefono, fechaContacto);
        System.out.println(p.getNombres());
        String busqueda = buscarProspectoPorDNI(dni);
        
        int indice = misDatos.indexOf(p);
        System.out.println(indice);
        
        return validar;
    }
    
    public void mostrar(int indice){
        System.out.println("NOMBRE: " + miTemporal.get(indice).getNombres());
        System.out.println("APELLIDO PATERNO: " + miTemporal.get(indice).getApellidoPaterno());
        System.out.println("APELLIDO MATERNO: " + miTemporal.get(indice).getApellidoMaterno());
        System.out.println("CORREO: " + miTemporal.get(indice).getCorreo());
        System.out.println("DNI: " + miTemporal.get(indice).getDni());
        System.out.println("TELEFONO: " + miTemporal.get(indice).getTelefono());
        System.out.println("FECHA CONTACTO: " + miTemporal.get(indice).getFechaContacto());
        System.out.println("----------------------------------------------------------------");
    }
    
    public boolean validarFormato (String valor){
        if(valor.isEmpty()){
            return true;
        }
        
        for (int i = 0; i<valor.length(); i++){
            if(!((valor.charAt(i)>64 && valor.charAt(i)<91) || (valor.charAt(i)>96 && valor.charAt(i)<123))){
                return true;
            }
        }
        return false;
    }
}
