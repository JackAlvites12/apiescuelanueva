
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.Parentesco;
import pe.com.apiescuelanueva.repository.ParentescoRepository;

@Service
public class ParentescoImpl implements ParentescoService{

    //Permite inyectar dependencias
    @Autowired
    private ParentescoRepository parentescorepository;
    
    @Override
    public List<Parentesco> findAll() {
        return parentescorepository.findAll();
    }

    @Override
    public List<Parentesco> findAllCustom() {
        return parentescorepository.findAllCustom();
    }

    @Override
    public Optional<Parentesco> findById(Long id) {
        return parentescorepository.findById(id);
    }

    @Override
    public Parentesco add(Parentesco p) {
        return parentescorepository.save(p);
    }

    @Override
    public Parentesco update(Parentesco p) {
        Parentesco objparentesco=parentescorepository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objparentesco);
        return parentescorepository.save(objparentesco);
    }

    @Override
    public Parentesco delete(Parentesco p) {
        Parentesco objparentesco=parentescorepository.getById(p.getCodigo());
        objparentesco.setEstado(false);
        return parentescorepository.save(objparentesco);
    }
    
}
