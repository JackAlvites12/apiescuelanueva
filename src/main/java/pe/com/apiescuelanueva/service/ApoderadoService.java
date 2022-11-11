
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.Apoderado;

public interface ApoderadoService {
    //Función que te permita mostrar todos los datos 
    List<Apoderado> findAll();
    //Función que permita mostrar todos los datos habilitados
    List<Apoderado> findAllCustom();
    //Función para buscar por código 
    Optional<Apoderado> findById(Long id);
    //----------------------------------------
    //Función para Registrar datos 
    Apoderado add(Apoderado a);
    //Función para Actualizar datos 
    Apoderado update(Apoderado a);
    //Función para Eliminar datos 
    Apoderado delete(Apoderado a);
}
