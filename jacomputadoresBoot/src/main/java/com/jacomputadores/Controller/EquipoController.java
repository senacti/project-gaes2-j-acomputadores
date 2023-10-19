package com.jacomputadores.Controller;

import com.jacomputadores.Entity.Equipos;
import com.jacomputadores.Service.EquipoServiceIMPL.EIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("EquipoRepo")
public class EquipoController {

    @Autowired
    private EIMPL eimpl;

    @GetMapping
    @RequestMapping(value = "ConsultarEquipos",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarEquipos(){
        List<Equipos> EquipoList=this.eimpl.ConsultarEquipos();
        return ResponseEntity.ok(EquipoList);
    }

    @PostMapping
    @RequestMapping(value = "CrearEquipos",method = RequestMethod.POST)
    public ResponseEntity<?> CrearEquipos(@RequestBody Equipos equipos){
        Equipos EquipoCreada=this.eimpl.CrearEquipos(equipos);
        return ResponseEntity.status(HttpStatus.CREATED).body(EquipoCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarEquipos",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarEquipos(@RequestBody Equipos equipos){
        Equipos EquipoModificada=this.eimpl.ModificarEquipos(equipos);
        return ResponseEntity.status(HttpStatus.CREATED).body(EquipoModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarEquipos/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarEquipos(@PathVariable int id){
        Equipos equipos=this.eimpl.BuscarEquipos(id);
        return ResponseEntity.ok(equipos);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarEquipos/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarEquipos(@PathVariable int id){
        this.eimpl.EliminarEquipos(id);
        return ResponseEntity.ok().build();
    }

}
