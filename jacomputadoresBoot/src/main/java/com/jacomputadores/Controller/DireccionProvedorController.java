package com.jacomputadores.Controller;


import com.jacomputadores.Entity.DireccionProvedor;
import com.jacomputadores.Service.DireccionProvedorIMPL.DIRIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("DireccionRepo")
public class DireccionProvedorController {


    @Autowired
    private DIRIMPL DIRIMPL;



    @GetMapping
    @RequestMapping(value = "Consultardirecionprovedor",method = RequestMethod.GET)
    public ResponseEntity<?> Consultardirecionprovedor(){
        List<DireccionProvedor> garantiaList=this.DIRIMPL.Consultardirecionprovedor();
        return ResponseEntity.ok(garantiaList);
    }

    @PostMapping
    @RequestMapping(value = "Creardirecionprovedor",method = RequestMethod.POST)
    public ResponseEntity<?> Creardirecionprovedor(@RequestBody DireccionProvedor DireccionProvedor){
        DireccionProvedor creadadireccion=this.DIRIMPL.Creardirecionprovedor(DireccionProvedor);
        return ResponseEntity.status(HttpStatus.CREATED).body(creadadireccion);
    }

    @PutMapping
    @RequestMapping(value = "Modificardirecionprovedor",method = RequestMethod.PUT)
    public ResponseEntity<?> Modificardirecionprovedor(@RequestBody DireccionProvedor DireccionProvedor){
        DireccionProvedor GarantiaModificada=this.DIRIMPL.Modificardirecionprovedor(DireccionProvedor);
        return ResponseEntity.status(HttpStatus.CREATED).body(GarantiaModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarGarantia/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarGarantia(@PathVariable int id){
       DireccionProvedor  DIRECCION=this.DIRIMPL.Buscardirecionprovedor(id);
        return ResponseEntity.ok(DIRECCION);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarGarantia/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarGarantia(@PathVariable int id){
        this.DIRIMPL.Eliminardirecionprovedor(id);
        return ResponseEntity.ok().build();
    }
}





