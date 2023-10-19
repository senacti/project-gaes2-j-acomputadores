package com.jacomputadores.Controller;
import com.jacomputadores.Entity.FichaMantenimientos;
import com.jacomputadores.Service.FichaManServiceIMPL.FMSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("FichamantenimientoRepo")
public class FichamantenimientosController {

    @Autowired
    private FMSIMPL fmsimpl;

    @GetMapping
    @RequestMapping(value = "ConsultarFichaMantenimientos",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarFichaMantenimientos(){
        List<FichaMantenimientos> EstadoList=this.fmsimpl.ConsultarFichaMantenimientos();
        return ResponseEntity.ok(EstadoList);
    }

    @PostMapping
    @RequestMapping(value = "CrearFichaMantenimientos",method = RequestMethod.POST)
    public ResponseEntity<?> CrearFichaMantenimientos(@RequestBody FichaMantenimientos fichaMantenimientos){
        FichaMantenimientos EstadoCreada=this.fmsimpl.CrearFichaMantenimientos(fichaMantenimientos);
        return ResponseEntity.status(HttpStatus.CREATED).body(EstadoCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarFichaMantenimientos",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarFichaMantenimientos(@RequestBody FichaMantenimientos fichaMantenimientos){
        FichaMantenimientos EstadoModificada=this.fmsimpl.ModificarFichaMantenimientos(fichaMantenimientos);
        return ResponseEntity.status(HttpStatus.CREATED).body(EstadoModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarFichaMantenimientos/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarFichaMantenimientos(@PathVariable int id){
        FichaMantenimientos fichaMantenimiento=this.fmsimpl.BuscarFichaMantenimientos(id);
        return ResponseEntity.ok(fichaMantenimiento);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarFichaMantenimientos/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarFichaMantenimientos(@PathVariable int id){
        this.fmsimpl.EliminarFichaMantenimientos(id);
        return ResponseEntity.ok().build();
    }
}
