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
import pe.com.apiescuelanueva.entity.Apoderado;
import pe.com.apiescuelanueva.service.ApoderadoService;

@RestController
@RequestMapping("/apoderado")
public class ApoderadoController {
    @Autowired
    private ApoderadoService apoderadoservice;
    
    @GetMapping
    public List<Apoderado> findAll(){
        return apoderadoservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<Apoderado> findAllCustom(){
        return apoderadoservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Apoderado> findById(@PathVariable Long id){
        return apoderadoservice.findById(id);
    }
    
    @PostMapping
    public Apoderado add(@RequestBody Apoderado a){
        return apoderadoservice.add(a);
    }
    
    @PutMapping("/{id}")
    public Apoderado update(@PathVariable long id, @RequestBody Apoderado a){
        a.setCodigo(id);
        return apoderadoservice.update(a);
    }
    
    @DeleteMapping("/{id}")
    public Apoderado delete(@PathVariable long id){
        Apoderado objapoderado=new Apoderado();
        objapoderado.setEstado(false);
        return apoderadoservice.delete(Apoderado.builder().codigo(id).build());
    }
    
}
