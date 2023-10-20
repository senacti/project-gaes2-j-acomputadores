package com.jacomputadores.Controller;

import com.jacomputadores.Entity.Categorias;

import com.jacomputadores.Service.CategoriasServiceIMPL.PROIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("CategoriaRepo")
public class Categoriascontroller {






    @Autowired
    private PROIMPL PROIMPL ;

    @GetMapping
    @RequestMapping(value = "consultarcategoria",method = RequestMethod.GET)
    public ResponseEntity<?> consultarcategoria(){
        List<Categorias> EstadoList=this.PROIMPL.consultarcategoria();
        return ResponseEntity.ok(EstadoList);
    }

    @PostMapping
    @RequestMapping(value = "crearcategorias",method = RequestMethod.POST)
    public ResponseEntity<?> crearcategorias(@RequestBody Categorias Categorias){
        Categorias categoriacreada =this.PROIMPL.crearcategoria(Categorias);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriacreada);
    }

    @PutMapping
    @RequestMapping(value = "modificarcategoria",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarcategoria(@RequestBody Categorias Categorias ){
        Categorias categoriaModificada=this.PROIMPL.modificarcategoria(Categorias);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaModificada);
    }

    @GetMapping
    @RequestMapping(value = "buscarcategoria/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarcategoria(@PathVariable int id){
        Categorias estadocategoria=this.PROIMPL.buscarcategoria(id);
        return ResponseEntity.ok(estadocategoria);
    }

    @DeleteMapping
    @RequestMapping(value = "eliminarcategoria/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarcategoria(@PathVariable int id){
        this.PROIMPL.eliminarcategoria(id);
        return ResponseEntity.ok().build();
    }
}

