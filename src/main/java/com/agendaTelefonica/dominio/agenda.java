package com.agendaTelefonica.dominio;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class agenda{
    private List<Contacto> contactos;

    public agenda() {
        this.contactos = new ArrayList<>();
    }
    public void agregar(String nombre, String apellido, long telef){
        Contacto contactoPAgregrar = new Contacto(nombre, apellido, telef);
        this.contactos.add(contactoPAgregrar);


    }
    public void eliminar(long telef){
    Contacto contactoPaEliminar = buscarPorCelular(telef);
    if (contactoPaEliminar!=null){
        this.contactos.remove(contactoPaEliminar);
        System.out.println("se eliminó el contacto" + contactoPaEliminar.getNombre() +contactoPaEliminar.getApellido() );
    }
    else
        System.out.printf("el contacto que desea eliminar no se encuentra");
    }


    public void buscarPornombre(String nombre){
        Contacto contactoPaBuscarN = this.contactos.stream().filter(contacto -> contacto.getNombre()==nombre).findFirst().orElse(null);
    }
    public Contacto buscarPorCelular(long telef) {
        Contacto contactoPaBuscar = this.contactos.stream().filter(contacto -> contacto.getTelef() == telef).findFirst().orElse(null);
        return contactoPaBuscar;
    }
    public void buscarPorApellido(String apellido){
        Contacto contactoPaBuscarA = this.contactos.stream().filter(contacto -> contacto.getApellido()==apellido).findFirst().orElse(null);
    }

    public void editar(long CeluViejo, long CeluNuevo){
        Contacto contactoAEditar = buscarPorCelular(CeluViejo);

        if (contactoAEditar != null){
            int posicionAReemplazar = this.contactos.indexOf(contactoAEditar);
            contactoAEditar.setTelef(CeluNuevo);
            this.contactos.set(posicionAReemplazar, contactoAEditar);
        } else {
            System.out.println("El contacto a editar no existe.");
        }



    }
    public void ordenar(){
        this.contactos.sort(Comparator.comparing(Contacto::getNombre).thenComparing(Contacto::getApellido));

    }
}
