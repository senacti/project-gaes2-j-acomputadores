package com.jacomputadores.Controller;


import com.jacomputadores.Entity.Entradas;
import com.jacomputadores.Service.EntradasServiceIMPL.ENIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Salidasrepo")

public class Entradascontroller {





    @Autowired
    private ENIMPL ENIMPL;

    @GetMapping
    @RequestMapping(value = "consultarentradas",method = RequestMethod.GET)
    public ResponseEntity<?> consultarentradas(){
        List<Entradas> EstadoList=this.ENIMPL.consultarentradas();
        return ResponseEntity.ok(EstadoList);
    }

    @PostMapping
    @RequestMapping(value = "crearentradas",method = RequestMethod.POST)
    public ResponseEntity<?> crearentradas(@RequestBody Entradas Entradas){
         Entradas entradacreada =this.ENIMPL.Crearentradas(Entradas);
        return ResponseEntity.status(HttpStatus.CREATED).body(entradacreada);
    }

    @PutMapping
    @RequestMapping(value = "modificarentradas",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarentradas(@RequestBody Entradas Entradas ){
        Entradas entradaModificada=this.ENIMPL.modificarentradas(Entradas);
        return ResponseEntity.status(HttpStatus.CREATED).body(entradaModificada);
    }

    @GetMapping
    @RequestMapping(value = "buscarentradas/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarentradas(@PathVariable int id){
        Entradas estadoentradas=this.ENIMPL.buscarentradas(id);
        return ResponseEntity.ok(estadoentradas);
    }

    @DeleteMapping
    @RequestMapping(value = "eliminarentradas/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarentradas(@PathVariable int id){
        this.ENIMPL.eliminarentradas(id);
        return ResponseEntity.ok().build();
    }
}
