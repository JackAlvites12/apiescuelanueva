
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.Distrito;
import pe.com.apiescuelanueva.repository.DistritoRepository;

//Permite definir la clase como un servicio
@Service
public class DistritoImpl implements DistritoService{

    //Permite inyectar dependencias
    @Autowired
    private DistritoRepository distritorepository;
    
    @Override
    public List<Distrito> findAll() {
        return distritorepository.findAll();
    }

    @Override
    public List<Distrito> findAllCustom() {
        return distritorepository.findAllCustom();
    }

    @Override
    public Optional<Distrito> findById(Long id) {
        return distritorepository.findById(id);
    }

    @Override
    public Distrito add(Distrito d) {
        return distritorepository.save(d);
    }

    @Override
    public Distrito update(Distrito d) {
        Distrito objdistrito=distritorepository.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objdistrito);
        return distritorepository.save(objdistrito);
    }

    @Override
    public Distrito delete(Distrito d) {
        Distrito objdistrito=distritorepository.getById(d.getCodigo());
        objdistrito.setEstado(false);
        return distritorepository.save(objdistrito);
    }
    
}
