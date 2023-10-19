package com.jacomputadores.Controller;

import com.jacomputadores.Entity.Pedidos;
import com.jacomputadores.Service.PedidosServiceIMPL.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("Pedidosrepo")
public class PedidosController {
    @Autowired
    private PSIMPL psimpl;

    @GetMapping
    @RequestMapping(value = "ConsultarPedido",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarPedido(){
        List<Pedidos> PedidosList=this.psimpl.ConsultarPedido();
        return ResponseEntity.ok(PedidosList);

}

    @PostMapping
    @RequestMapping(value = "CrearPedido",method = RequestMethod.POST)
    public ResponseEntity<?> CrearPedido(@RequestBody Pedidos pedidos){
        Pedidos PedidoCreada=this.psimpl.CrearPedido(pedidos);
        return ResponseEntity.status(HttpStatus.CREATED).body(PedidoCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarPedido",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPedido(@RequestBody Pedidos pedido){
        Pedidos PedidoModificada=this.psimpl.ModificarPedido(pedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(PedidoModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarPedido/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPedido(@PathVariable int id){
        Pedidos pedidos=this.psimpl.BuscarPedido(id);
        return ResponseEntity.ok(pedidos);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarPedido/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarPedido(@PathVariable int id){
        this.psimpl.EliminarPedido(id);
        return ResponseEntity.ok().build();
    }
}




