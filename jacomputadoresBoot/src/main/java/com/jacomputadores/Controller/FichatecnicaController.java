package com.jacomputadores.Controller;

import com.jacomputadores.Entity.FichaTecnica;
import com.jacomputadores.Service.FichatecnicaServiceIMPL.FtSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("FichatecnicaRepo")

public class FichatecnicaController {

    @Autowired
    private FtSIMPL ftSIMPL;

    @GetMapping
    @RequestMapping(value = "ConsultarFichatecnica",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarFichatecnica(){
        List<FichaTecnica> fichaList=this.ftSIMPL.ConsultarFichatecnica();
        return ResponseEntity.ok(fichaList);
    }

    @PostMapping
    @RequestMapping(value = "CrearFichatecnica",method = RequestMethod.POST)
    public ResponseEntity<?> CrearFichatecnica(@RequestBody FichaTecnica fichaTecnica){
        FichaTecnica FichaCreada=this.ftSIMPL.CrearFichatecnica(fichaTecnica);
        return ResponseEntity.status(HttpStatus.CREATED).body(FichaCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarFichatecnica",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarFichatecnica(@RequestBody FichaTecnica fichaTecnica){
        FichaTecnica FichaModificada=this.ftSIMPL.ModificarFichatecnica(fichaTecnica);
        return ResponseEntity.status(HttpStatus.CREATED).body(FichaModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarFichatecnica/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarFichatecnica(@PathVariable int id){
        FichaTecnica Fichatecnica=this.ftSIMPL.BuscarFichatecnica(id);
        return ResponseEntity.ok(Fichatecnica);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarFichatecnica/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarFichatecnica(@PathVariable int id){
        this.ftSIMPL.EliminarFichatecnica(id);
        return ResponseEntity.ok().build();
    }
}
