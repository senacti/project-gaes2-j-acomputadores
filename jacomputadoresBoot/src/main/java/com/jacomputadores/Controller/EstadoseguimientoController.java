package com.jacomputadores.Controller;

import com.jacomputadores.Entity.EstadoSegumiento;
import com.jacomputadores.Service.EstadoseguimientoServiceIMPL.EsSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("EstadoseguimientoRepo")

public class EstadoseguimientoController {

    @Autowired
    private EsSIMPL esSIMPL;

    @GetMapping
    @RequestMapping(value = "ConsultarEstadoSeguimiento",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarEstadoSeguimiento(){
        List<EstadoSegumiento> EstadoList=this.esSIMPL.ConsultarEstadoSeguimiento();
        return ResponseEntity.ok(EstadoList);
    }

    @PostMapping
    @RequestMapping(value = "CrearEstadoSeguimiento",method = RequestMethod.POST)
    public ResponseEntity<?> CrearEstadoSeguimiento(@RequestBody EstadoSegumiento estadoSegumiento){
        EstadoSegumiento EstadoCreada=this.esSIMPL.CrearEstadoSeguimiento(estadoSegumiento);
        return ResponseEntity.status(HttpStatus.CREATED).body(EstadoCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarEstadoSeguimiento",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarEstadoSeguimiento(@RequestBody EstadoSegumiento estadoSegumiento){
        EstadoSegumiento EstadoModificada=this.esSIMPL.ModificarEstadoSeguimiento(estadoSegumiento);
        return ResponseEntity.status(HttpStatus.CREATED).body(EstadoModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarEstadoSeguimiento/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarEstadoSeguimiento(@PathVariable int id){
        EstadoSegumiento Estadoseguimiento=this.esSIMPL.BuscarEstadoSeguimiento(id);
        return ResponseEntity.ok(Estadoseguimiento);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarEstadoSeguimiento/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarEstadoSeguimiento(@PathVariable int id){
        this.esSIMPL.EliminarEstadoSeguimiento(id);
        return ResponseEntity.ok().build();
    }
}
