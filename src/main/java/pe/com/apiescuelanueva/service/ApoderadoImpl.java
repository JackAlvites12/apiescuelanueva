
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.Apoderado;
import pe.com.apiescuelanueva.repository.ApoderadoRepository;

@Service
public class ApoderadoImpl implements ApoderadoService{

    //Permite inyectar dependencias
    @Autowired
    private ApoderadoRepository apoderadorepository;
    
    @Override
    public List<Apoderado> findAll() {
        return apoderadorepository.findAll();
    }

    @Override
    public List<Apoderado> findAllCustom() {
        return apoderadorepository.findAllCustom();
    }

    @Override
    public Optional<Apoderado> findById(Long id) {
        return apoderadorepository.findById(id);
    }

    @Override
    public Apoderado add(Apoderado a) {
        return apoderadorepository.save(a);
    }

    @Override
    public Apoderado update(Apoderado a) {
        Apoderado objapoderado=apoderadorepository.getById(a.getCodigo());
        BeanUtils.copyProperties(a, objapoderado);
        return apoderadorepository.save(objapoderado);
    }

    @Override
    public Apoderado delete(Apoderado a) {
        Apoderado objapoderado=apoderadorepository.getById(a.getCodigo());
        objapoderado.setEstado(false);
        return apoderadorepository.save(objapoderado);
    }
    
}
