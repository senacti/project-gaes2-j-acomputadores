package com.jacomputadores.Controller;

import com.jacomputadores.Entity.Servicios;
import com.jacomputadores.Service.ServiciosServiceIMPL.SOIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ServiciosController {
    @Autowired
    private SOIMPL soimpl;
}
    @GetMapping
    @RequestMapping(value = "ConsultarServicios",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarServicios(){
        List<Servicios> ServiciosList=this.soimpl.ConsultarServicio();
        return ResponseEntity.ok(ServiciosList);
    }

    @PostMapping
    @RequestMapping(value = "CrearServicios",method = RequestMethod.POST)
    public ResponseEntity<?> CrearServicios(@RequestBody Servicios servicios){
        Servicios ServicioCreada=this.soimpl.CrearServicio(servicios);
        return ResponseEntity.status(HttpStatus.CREATED).body(ServicioCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarServicio",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarServicio(@RequestBody Servicios servicios){
        Servicios ServiciosModificada=this.soimpl.ModificarServicio(servicios);
        return ResponseEntity.status(HttpStatus.CREATED).body(ServiciosModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarVenta/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarVenta(@PathVariable int id){
        Servicios servicios=this.soimpl.BuscarServicio(id);
        return ResponseEntity.ok(servicios);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarServicios/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarServicio(@PathVariable int id){
        this.soimpl.EliminarServicio(id);
        return ResponseEntity.ok().build();
    }
}
