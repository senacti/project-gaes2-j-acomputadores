package com.jacomputadores.Controller;

import com.jacomputadores.Entity.Mantenimientos;
import com.jacomputadores.Service.MantenimientoServiceIMPL.MtIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("MantenimientoRepo")
public class MantenimientoController {

    @Autowired
    private MtIMPL mtIMPL;

    @GetMapping
    @RequestMapping(value = "ConsultarMantenimientos",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarMantenimientos(){
        List<Mantenimientos> EstadoList=this.mtIMPL.ConsultarMantenimientos();
        return ResponseEntity.ok(EstadoList);
    }

    @PostMapping
    @RequestMapping(value = "CrearMantenimientos",method = RequestMethod.POST)
    public ResponseEntity<?> CrearMantenimientos(@RequestBody Mantenimientos mantenimientos){
        Mantenimientos EstadoCreada=this.mtIMPL.CrearMantenimientos(mantenimientos);
        return ResponseEntity.status(HttpStatus.CREATED).body(EstadoCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarMantenimientos",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarMantenimientos(@RequestBody Mantenimientos mantenimientos){
        Mantenimientos EstadoModificada=this.mtIMPL.ModificarMantenimientos(mantenimientos);
        return ResponseEntity.status(HttpStatus.CREATED).body(EstadoModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarMantenimientos/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarMantenimientos(@PathVariable int id){
        Mantenimientos mantenimientos=this.mtIMPL.BuscarMantenimientos(id);
        return ResponseEntity.ok(mantenimientos);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarMantenimientos/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarMantenimientos(@PathVariable int id){
        this.mtIMPL.EliminarMantenimientos(id);
        return ResponseEntity.ok().build();
    }
}
