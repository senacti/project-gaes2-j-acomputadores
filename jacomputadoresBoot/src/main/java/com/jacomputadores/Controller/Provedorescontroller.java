package com.jacomputadores.Controller;

import com.jacomputadores.Entity.Provedores;
import com.jacomputadores.Service.ProvedoresServiceIMPL.PROVIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("Provedoresrepo")
public class Provedorescontroller {

    @Autowired
    private PROVIMPL  PROVIMPL;

    @GetMapping
    @RequestMapping(value = "consultarprovedores",method = RequestMethod.GET)
    public ResponseEntity<?> consultarprovedores(){
        List<Provedores> provedorlisto=this.PROVIMPL.consultarprovedores();
        return ResponseEntity.ok(provedorlisto);
    }

    @PostMapping
    @RequestMapping(value = "crearprovedor",method = RequestMethod.POST)
    public ResponseEntity<?> crearprovedor(@RequestBody Provedores Provedores){
        Provedores PROVEDORCREADO=this.PROVIMPL.crearprovedores(Provedores);
        return ResponseEntity.status(HttpStatus.CREATED).body(PROVEDORCREADO);
    }

    @PutMapping
    @RequestMapping(value = "modificarprovedor",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarprovedor(@RequestBody Provedores Provedores){
        Provedores PROVEDORMODIFICADO=this.PROVIMPL.modificarprovedores(Provedores);
        return ResponseEntity.status(HttpStatus.CREATED).body(PROVEDORMODIFICADO);
    }

    @GetMapping
    @RequestMapping(value = "buscarprovedor/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarprovedor(@PathVariable int id){
        Provedores PROVEDORR=this.PROVIMPL.buscarprovedores(id);
        return ResponseEntity.ok(PROVEDORR);
    }

    @DeleteMapping
    @RequestMapping(value = "eliminargarantia/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminargarantia(@PathVariable int id){
        this.PROVIMPL.elminarprovedores(id);
        return ResponseEntity.ok().build();
    }
}



