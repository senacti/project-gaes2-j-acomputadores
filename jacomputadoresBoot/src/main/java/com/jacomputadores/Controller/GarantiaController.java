package com.jacomputadores.Controller;

import com.jacomputadores.Entity.Garantia;
import com.jacomputadores.Service.GarantiaServiceIMPL.GSIMPL;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("GarantiaRepo")
public class GarantiaController {

    @Autowired
    private GSIMPL gsimpl;

    @GetMapping
    @RequestMapping(value = "ConsultarGarantia",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarGarantia(){
        List<Garantia> garantiaList=this.gsimpl.ConsultarGarantia();
        return ResponseEntity.ok(garantiaList);
    }

    @PostMapping
    @RequestMapping(value = "CrearGarantia",method = RequestMethod.POST)
    public ResponseEntity<?> CrearGarantia(@RequestBody Garantia garantia){
        Garantia GarantiaCreada=this.gsimpl.CrearGarantia(garantia);
        return ResponseEntity.status(HttpStatus.CREATED).body(GarantiaCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarGarantia",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarGarantia(@RequestBody Garantia garantia){
        Garantia GarantiaModificada=this.gsimpl.ModificarGarantia(garantia);
        return ResponseEntity.status(HttpStatus.CREATED).body(GarantiaModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarGarantia/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarGarantia(@PathVariable int id){
        Garantia Garantia=this.gsimpl.BuscarGarantia(id);
        return ResponseEntity.ok(Garantia);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarGarantia/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarGarantia(@PathVariable int id){
        this.gsimpl.EliminarGarantia(id);
        return ResponseEntity.ok().build();
    }
}
