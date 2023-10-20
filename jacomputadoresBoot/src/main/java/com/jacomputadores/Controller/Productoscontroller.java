package com.jacomputadores.Controller;

import com.jacomputadores.Entity.Productos;
import com.jacomputadores.Service.ProductosServiceIMPL.PROIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping( "Productosrepo")
public class Productoscontroller {

    @Autowired
    private PROIMPL PROIMPL;

    @GetMapping
    @RequestMapping(value = "consultarproductos",method = RequestMethod.GET)
    public ResponseEntity<?> consultarproductos(){
        List<Productos> fichaList=this.PROIMPL.consultarproductos();
        return ResponseEntity.ok(fichaList);
    }

    @PostMapping
    @RequestMapping(value = "crearproducto",method = RequestMethod.POST)
    public ResponseEntity<?> crearproducto(@RequestBody Productos Productos){
        Productos productoCreado=this.PROIMPL.crearproductos(Productos);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoCreado);
    }

    @PutMapping
    @RequestMapping(value = "modificarproductos",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarproductos(@RequestBody Productos Productos){
        Productos productoModificada=this.PROIMPL.modificarproductos(Productos);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoModificada);
    }

    @GetMapping
    @RequestMapping(value = "buscarproductos/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarproductos(@PathVariable int id){
        Productos producto=this.PROIMPL.buscarproductos(id);
        return ResponseEntity.ok(producto);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarFichatecnica/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarFichatecnica(@PathVariable int id){
        this.PROIMPL.eliminarproductos(id);
        return ResponseEntity.ok().build();
    }
}






