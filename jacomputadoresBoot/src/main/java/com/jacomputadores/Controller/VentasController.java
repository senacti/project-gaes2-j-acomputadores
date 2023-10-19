package com.jacomputadores.Controller;

import com.jacomputadores.Entity.Garantia;
import com.jacomputadores.Entity.Ventas;
import com.jacomputadores.Service.VentasServiceIMPL.VSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("VentasRepo")
public class VentasController {
    @Autowired
    private VSIMPL vsimpl;

    @GetMapping
    @RequestMapping(value = "ConsultarVentas",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarVentas(){
        List<Ventas> VentasList=this.vsimpl.ConsultarVenta();
        return ResponseEntity.ok(VentasList);
    }

    @PostMapping
    @RequestMapping(value = "CrearVentas",method = RequestMethod.POST)
    public ResponseEntity<?> CrearVentas(@RequestBody Ventas ventas){
        Ventas VentaCreada=this.vsimpl.CrearVenta(ventas);
        return ResponseEntity.status(HttpStatus.CREATED).body(VentaCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarVenta",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarVenta(@RequestBody Ventas venta){
        Ventas VentaModificada=this.vsimpl.ModificarVenta(venta);
        return ResponseEntity.status(HttpStatus.CREATED).body(VentaModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarVenta/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarVenta(@PathVariable int id){
        Ventas ventas=this.vsimpl.BuscarVenta(id);
        return ResponseEntity.ok(ventas);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarVenta/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarVenta(@PathVariable int id){
        this.vsimpl.EliminarVenta(id);
        return ResponseEntity.ok().build();
    }
}




