package com.jacomputadores.Controller;

import com.jacomputadores.Entity.TipoGarantia;
import com.jacomputadores.Service.TipogarantiaServiceIMPL.TgSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("TipogarantiaRepo")

public class TipogarantiaController {

    @Autowired
    private TgSIMPL tgSIMPL;

    @GetMapping
    @RequestMapping(value = "ConsultarTipoGarantia",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarTipoGarantia(){
        List<TipoGarantia> TipoList=this.tgSIMPL.ConsultarTipoGarantia();
        return ResponseEntity.ok(TipoList);
    }

    @PostMapping
    @RequestMapping(value = "CrearTipoGarantia",method = RequestMethod.POST)
    public ResponseEntity<?> CrearTipoGarantia(@RequestBody TipoGarantia tipoGarantia){
        TipoGarantia TipoCreada=this.tgSIMPL.CrearTipoGarantia(tipoGarantia);
        return ResponseEntity.status(HttpStatus.CREATED).body(TipoCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarTipoGarantia",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarTipoGarantia(@RequestBody TipoGarantia tipoGarantia){
        TipoGarantia EstadoModificada=this.tgSIMPL.ModificarTipoGarantia(tipoGarantia);
        return ResponseEntity.status(HttpStatus.CREATED).body(EstadoModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarTipoGarantia/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarTipoGarantia(@PathVariable int id){
        TipoGarantia Tipogarantia=this.tgSIMPL.BuscarTipoGarantia(id);
        return ResponseEntity.ok(Tipogarantia);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarTipoGarantia/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarTipoGarantia(@PathVariable int id){
        this.tgSIMPL.EliminarTipoGarantia(id);
        return ResponseEntity.ok().build();
    }
}
