package com.jacomputadores.Controller;


import com.jacomputadores.Entity.Inventario;
import com.jacomputadores.Entity.Salidas;
import com.jacomputadores.Service.SalidasServiceIMPL.SLIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Salidasrepo")

public class Salidascontroller {

    @Autowired
    private SLIMPL SLIMPL;




    @PostMapping
    @RequestMapping(value = "consultarsalida", method = RequestMethod.GET)
    public ResponseEntity<?> consultarsalida() {
        List<Salidas> listasalidas = this.SLIMPL.consultarsalida();
        return ResponseEntity.ok(listasalidas);

    }

    @PostMapping
    @RequestMapping(value = "crearsalidas", method = RequestMethod.POST)
    public ResponseEntity<?> crearsalidas(@RequestBody Salidas salidas) {
        Salidas slcreado = this.SLIMPL.crearsalidad(salidas);
        return ResponseEntity.status(HttpStatus.CREATED).body(slcreado);

    }


    @PutMapping
    @RequestMapping(value = "modificarsalida", method = RequestMethod.PUT)
    public ResponseEntity<?> modificarsalida(@RequestBody Salidas Salidas) {
        Salidas SLModificada = this.SLIMPL.modificarsalida(Salidas);
        return ResponseEntity.status(HttpStatus.CREATED).body(SLModificada);
    }


    @GetMapping
    @RequestMapping(value = "buscarsalida/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> buscarsalida(@PathVariable int id) {
        Salidas SALIA = this.SLIMPL.buscarsalida(id);
        return ResponseEntity.ok(SALIA);
    }

    @DeleteMapping
    @RequestMapping(value = "eliminarsalida/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarsalida(@PathVariable int id) {
        this.SLIMPL.eliminarsalida(id);
        return ResponseEntity.ok().build();
    }
}

