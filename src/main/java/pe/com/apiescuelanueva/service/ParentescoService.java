
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.Parentesco;

public interface ParentescoService {
    //Función que te permita mostrar todos los datos 
    List<Parentesco> findAll();
    //Función que permita mostrar todos los datos habilitados
    List<Parentesco> findAllCustom();
    //Función para buscar por código 
    Optional<Parentesco> findById(Long id);
    //----------------------------------------
    //Función para Registrar datos 
    Parentesco add(Parentesco p);
    //Función para Actualizar datos 
    Parentesco update(Parentesco p);
    //Función para Eliminar datos 
    Parentesco delete(Parentesco p);
    
}
