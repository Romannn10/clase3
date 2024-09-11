/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;

import modelo.cliente.Cliente;
import modelo.vendedor.Vendedor;
import repositorio.RepositorioDeDatos;

/**
 *
 * @author Alumno
 */
public class VentaBici {

    public static void main(String[] args) {
        Cliente c1=new Cliente("20-33521457-0","JUAN", "PEREZ", 33521457, "3541521451","jperez@gmail.com");
        RepositorioDeDatos.personas[0]=c1;
        Cliente c2=new Cliente("20-35521787-0","MARCOS", "GUTIERRE", 35521787, "3515236874","mgutierre@gmail.com");
        RepositorioDeDatos.personas[1]=c2;
        Vendedor v1= new Vendedor( "CENTRO","VERONICA", "LOPEZ", 298785475, "3515326541", "vlopez@gmail.com");
        RepositorioDeDatos.personas[2]=v1;
        Cliente c3=new Cliente("20-35521785-0","LORENA", "RAMOS",35521785, "3515836874","lramos@gmail.com");
        RepositorioDeDatos.personas[3]=c3;
        Vendedor v2= new Vendedor( "OESTE","JULIAN", "SOSA", 398785475, "3515316541", "jsosa@gmail.com");
        RepositorioDeDatos.personas[4]=v2;
      
        
        System.out.println("Listar Clientes");
        int indice=0;
        while(indice<RepositorioDeDatos.personas.length-1){
            if(RepositorioDeDatos.personas[indice]!=null && RepositorioDeDatos.personas[indice] instanceof Cliente)
                System.out.println(((Cliente)RepositorioDeDatos.personas[indice]).toStringCliente());
            indice++;
        }
       
        System.out.println("Listar VEndedores");
        
        
    }
}
