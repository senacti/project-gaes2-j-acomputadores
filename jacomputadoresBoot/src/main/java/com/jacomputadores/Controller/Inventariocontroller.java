package com.jacomputadores.Controller;


import com.jacomputadores.Entity.Inventario;
import com.jacomputadores.Service.Inventarioservicelmpl.INIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Inventariorepo")
public class Inventariocontroller {


    @Autowired
    private INIMPL INIMPL;


    @PostMapping
    @RequestMapping(value = "consultarinventario", method = RequestMethod.GET)
    public ResponseEntity<?> consultarinventario() {
        List<Inventario> listainventario = this.INIMPL.consultarinventario();
        return ResponseEntity.ok(listainventario);

    }

    @PostMapping
    @RequestMapping(value = "Crearinvetario", method = RequestMethod.POST)
    public ResponseEntity<?> Crearinvetario(@RequestBody Inventario Inventario) {
        Inventario increado = this.INIMPL.Crearinvetario(Inventario);
        return ResponseEntity.status(HttpStatus.CREATED).body(increado);

    }


    @PutMapping
    @RequestMapping(value = "Modificarinventario", method = RequestMethod.PUT)
    public ResponseEntity<?> Modificarinventario(@RequestBody Inventario Inventario) {
        Inventario inModificada = this.INIMPL.Modificarinventario(Inventario);
        return ResponseEntity.status(HttpStatus.CREATED).body(inModificada);
    }


    @GetMapping
    @RequestMapping(value = "buscarinventario/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> buscarinventario(@PathVariable int id) {
        Inventario Inventario = this.INIMPL.buscarinventario(id);
        return ResponseEntity.ok(Inventario);
    }

    @DeleteMapping
    @RequestMapping(value = "eliminarinventario/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarinventario(@PathVariable int id) {
        this.INIMPL.eliminarinventario(id);
        return ResponseEntity.ok().build();
    }
}













