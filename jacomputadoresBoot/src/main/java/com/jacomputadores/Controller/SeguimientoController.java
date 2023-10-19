package com.jacomputadores.Controller;

import com.jacomputadores.Entity.Seguimiento;
import com.jacomputadores.Service.SeguimientoServiceIMPL.SsIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("SeguimientoRepo")
public class SeguimientoController {

    @Autowired
    private SsIMPL ssIMPL;


    @GetMapping
    @RequestMapping(value = "ConsultarSeguimiento",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarSeguimiento(){
        List<Seguimiento> seguimientoList=this.ssIMPL.ConsultarSeguimiento();
        return ResponseEntity.ok(seguimientoList);
    }

    @PostMapping
    @RequestMapping(value = "CrearSeguimiento",method = RequestMethod.POST)
    public ResponseEntity<?> CrearSeguimiento(@RequestBody Seguimiento seguimiento){
        Seguimiento SeguimientoCreada=this.ssIMPL.CrearSeguimiento(seguimiento);
        return ResponseEntity.status(HttpStatus.CREATED).body(SeguimientoCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarSeguimiento",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarSeguimiento(@RequestBody Seguimiento seguimiento){
        Seguimiento SeguimientoModificada=this.ssIMPL.ModificarSeguimiento(seguimiento);
        return ResponseEntity.status(HttpStatus.CREATED).body(SeguimientoModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarSeguimiento/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarSeguimiento(@PathVariable int id){
        Seguimiento Seguimiento=this.ssIMPL.BuscarSeguimiento(id);
        return ResponseEntity.ok(Seguimiento);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarSeguimiento/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarSeguimiento(@PathVariable int id){
        this.ssIMPL.EliminarSeguimiento(id);
        return ResponseEntity.ok().build();
    }
}
