
package pe.com.apiescuelanueva.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.apiescuelanueva.entity.Distrito;
import pe.com.apiescuelanueva.service.DistritoService;

//@RequestMapping --> permite definir el nombre del ENDPOINT
@RestController
@RequestMapping("/distrito")
public class DistritoController {
    @Autowired
    private DistritoService distritoservice;
    
    //@GetMapping sirve para obtener valores 
    @GetMapping
    public List<Distrito> findAll(){
        return distritoservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<Distrito> findAllCustom(){
        return distritoservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Distrito> findById(@PathVariable Long id){
        return distritoservice.findById(id);
    }
    
    @PostMapping
    public Distrito add(@RequestBody Distrito d){
        return distritoservice.add(d);
    }
    
    @PutMapping("/{id}")
    public Distrito update(@PathVariable long id, @RequestBody Distrito d){
        d.setCodigo(id);
        return distritoservice.update(d);
    }
    
    @DeleteMapping("/{id}")
    public Distrito delete(@PathVariable long id){
        Distrito objdistrito=new Distrito();
        objdistrito.setEstado(false);
        return distritoservice.delete(Distrito.builder().codigo(id).build());
    }
}
