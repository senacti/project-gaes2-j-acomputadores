package com.jacomputadores.Controller;


import com.jacomputadores.Entity.Calificaciones;
import com.jacomputadores.Service.CalificacionesServiceIMPL.CALIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("calificacionesrepo")
public class CalificacionesController {


    @Autowired
    private CALIMPL CALIMPL ;


    @GetMapping
    @RequestMapping(value = "consultarcalificaciones",method = RequestMethod.GET)
    public ResponseEntity<?> consultarcalificaciones(){
        List<Calificaciones> TipoList=this.CALIMPL.consultarcalificaciones();
        return ResponseEntity.ok(TipoList);
    }

    @PostMapping
    @RequestMapping(value = "crearcalificaiones",method = RequestMethod.POST)
    public ResponseEntity<?> crearcalificaiones(@RequestBody Calificaciones  Calificaciones){
        Calificaciones califiacioncreada =this.CALIMPL.crearcalificaiones(Calificaciones);
        return ResponseEntity.status(HttpStatus.CREATED).body(califiacioncreada);
    }

    @PutMapping
    @RequestMapping(value = "modificarcalifiaciones",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarcalifiaciones(@RequestBody Calificaciones Calificaciones){
        Calificaciones EstadoModificada=this.CALIMPL.modificarcalifiaciones(Calificaciones);
        return ResponseEntity.status(HttpStatus.CREATED).body(EstadoModificada);
    }

    @GetMapping
    @RequestMapping(value = "buscarcalificaciones/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarcalificaciones(@PathVariable int id){
        Calificaciones Tipogarantia=this.CALIMPL.buscarcalificaciones(id);
        return ResponseEntity.ok(Tipogarantia);
    }

    @DeleteMapping
    @RequestMapping(value = "eliminarcalificaciones/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarcalificaciones(@PathVariable int id){
        this.CALIMPL.eliminarcalificaciones(id);
        return ResponseEntity.ok().build();
    }
}


