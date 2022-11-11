
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.Distrito;

public interface DistritoService {
    //Función que te permita mostrar todos los datos 
    List<Distrito> findAll();
    //Función que permita mostrar todos los datos habilitados
    List<Distrito> findAllCustom();
    //Función para buscar por código 
    Optional<Distrito> findById(Long id);
    //----------------------------------------
    //Función para Registrar datos 
    Distrito add(Distrito d);
    //Función para Actualizar datos 
    Distrito update(Distrito d);
    //Función para Eliminar datos 
    Distrito delete(Distrito d);
}
