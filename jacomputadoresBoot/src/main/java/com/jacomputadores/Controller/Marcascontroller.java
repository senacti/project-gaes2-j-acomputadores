package com.jacomputadores.Controller;


import com.jacomputadores.Entity.Marcas;
import com.jacomputadores.Service.MarcasServiceIMPL.MAIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Marcasrepo")
public class Marcascontroller {


    @Autowired
    private MAIMPL MAIMPL;


    @GetMapping
    @RequestMapping(value = "consultarmarcas",method = RequestMethod.GET)
    public ResponseEntity<?> consultarmarcas(){
        List<Marcas> garantiaList=this.MAIMPL.consultarmarca();
        return ResponseEntity.ok(garantiaList);
    }

    @PostMapping
    @RequestMapping(value = "crearmarca",method = RequestMethod.POST)
    public ResponseEntity<?> crearmarca(@RequestBody Marcas Marcas){
        Marcas marcaCreada=this.MAIMPL.crearmarca(Marcas);
        return ResponseEntity.status(HttpStatus.CREATED).body(marcaCreada);
    }

    @PutMapping
    @RequestMapping(value = "modificarmarca",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarmarca(@RequestBody Marcas Marcas){
        Marcas MARCAModificada=this.MAIMPL.modificarmarca(Marcas);
        return ResponseEntity.status(HttpStatus.CREATED).body(MARCAModificada);
    }

    @GetMapping
    @RequestMapping(value = "buscarmarca/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarmarca(@PathVariable int id){
        Marcas marca=this.MAIMPL.buscarmarca(id);
        return ResponseEntity.ok(marca);
    }

    @DeleteMapping
    @RequestMapping(value = "eliminarmarca/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarmarca(@PathVariable int id){
        this.MAIMPL.eliminarmarca(id);
        return ResponseEntity.ok().build();
    }
}






