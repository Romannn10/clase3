/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.abm.cliente;

import modelo.cliente.Cliente;
import modelo.persona.Persona;
import repositorio.RepositorioDeDatos;

/**
 *
 * @author Alumno
 */
public class ABMCliente implements IABMPersona{

    @Override
    public void altaPersona(Persona persona) {
        if(!existe(persona.getDni())){
            RepositorioDeDatos.personas[RepositorioDeDatos.indice]=(Cliente)persona;
            RepositorioDeDatos.indice++;
        }else
            System.out.println("El Cliente ya Existe");
    }

    @Override
    public void bajaPersona(Persona persona) {
       
    }

    @Override
    public void modificarDatosPersona(Persona persona) {
       
    }
    
    private boolean existe(int dni){
        for (Persona persona : RepositorioDeDatos.personas) {
            if(persona.getDni()==dni)
                return true;
        }
        return false;
    }
           
    @Override
    public void listarPersonas(String tipo) {
       int indice=0;
        while(indice<RepositorioDeDatos.personas.length-1){
            if(RepositorioDeDatos.personas[indice]!=null && RepositorioDeDatos.personas[indice] instanceof Cliente)
                System.out.println(((Cliente)RepositorioDeDatos.personas[indice]).toStringCliente());
            indice++;
        }
    }

    @Override
    public void altaPersonas(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void bajaPersonas(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificarDatosPersonas(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listarPersonass(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
