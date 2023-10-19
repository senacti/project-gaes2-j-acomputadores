package com.jacomputadores.Controller;

import com.jacomputadores.Entity.TipoGarantia;
import com.jacomputadores.Entity.TipoServicio;
import com.jacomputadores.Entity.Ventas;
import com.jacomputadores.Service.TipoServicioServiceIMPL.TSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("TipoServicio")
public class TipoServicioController {
    @Autowired
    private TSIMPL tsimpl;

    @GetMapping
    @RequestMapping(value = "ConsultarTipoServicio",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarTipoServicio() {
        List<TipoServicio> TiposervicioList = this.tsimpl.ConsultarTipoServicio();
        return ResponseEntity.ok(TiposervicioList);
    }

        @PostMapping
        @RequestMapping(value = "CrearTipoServicio",method = RequestMethod.POST)
        public ResponseEntity<?> CrearTipoServicio(@RequestBody TipoServicio tipoServicio){
            TipoServicio TiposervicioCreada=this.tsimpl.CrearTipoServicio(tipoServicio);
            return ResponseEntity.status(HttpStatus.CREATED).body(TiposervicioCreada);
        }

        @PutMapping
        @RequestMapping(value = "ModificarTipoServicio",method = RequestMethod.PUT)
        public ResponseEntity<?> ModificarTipoServicio(@RequestBody TipoServicio tipoServicio){
            TipoServicio EstadoModificada=this.tsimpl.ModificarTipoServicio(tipoServicio);
            return ResponseEntity.status(HttpStatus.CREATED).body(EstadoModificada);
        }

        @GetMapping
        @RequestMapping(value = "BuscarTipoServicio/{id}",method = RequestMethod.GET)
        public ResponseEntity<?> BuscarTipoServicio(@PathVariable int id){
            TipoServicio Tiposervicio=this.tsimpl.BuscarTipoServicio(id);
            return ResponseEntity.ok(Tiposervicio);
        }

        @DeleteMapping
        @RequestMapping(value = "EliminarTipoServicio/{id}",method = RequestMethod.DELETE)
        public ResponseEntity<?> EliminarTipoServicio(@PathVariable int id){
            this.tsimpl.EliminarTipoServicio(id);
            return ResponseEntity.ok().build();
        }
    }
    }


