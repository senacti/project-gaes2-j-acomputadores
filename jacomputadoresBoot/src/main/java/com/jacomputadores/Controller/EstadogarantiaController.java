package com.jacomputadores.Controller;

import com.jacomputadores.Entity.EstadoGarantia;
import com.jacomputadores.Service.EstadogarantiaServiceIMPL.EsSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("EstadogarantiaRepo")

public class EstadogarantiaController {

    @Autowired
    private EsSIMPL esSIMPL;

    @GetMapping
    @RequestMapping(value = "ConsultarEstadogarantia",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarEstadogarantia(){
        List<EstadoGarantia> EstadoList=this.esSIMPL.ConsultarEstadogarantia();
        return ResponseEntity.ok(EstadoList);
    }

    @PostMapping
    @RequestMapping(value = "CrearEstadogarantia",method = RequestMethod.POST)
    public ResponseEntity<?> CrearEstadogarantia(@RequestBody EstadoGarantia estadoGarantia){
        EstadoGarantia EstadoCreada=this.esSIMPL.CrearEstadogarantia(estadoGarantia);
        return ResponseEntity.status(HttpStatus.CREATED).body(EstadoCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarEstadogarantia",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarEstadogarantia(@RequestBody EstadoGarantia estadoGarantia){
        EstadoGarantia EstadoModificada=this.esSIMPL.ModificarEstadogarantia(estadoGarantia);
        return ResponseEntity.status(HttpStatus.CREATED).body(EstadoModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarEstadogarantia/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarEstadogarantia(@PathVariable int id){
        EstadoGarantia Estadogarantia=this.esSIMPL.BuscarEstadogarantia(id);
        return ResponseEntity.ok(Estadogarantia);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarEstadogarantia/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarEstadogarantia(@PathVariable int id){
        this.esSIMPL.EliminarEstadogarantia(id);
        return ResponseEntity.ok().build();
    }
}
