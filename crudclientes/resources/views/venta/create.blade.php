<!-- Modal -->

<div class="modal fade" id="create" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
            
            <form action="{{route('ventas.store')}} " method="post" enctype="multipart/form-data">
                @csrf
            <div class="modal-body">
                <div class="mb-3">
                    <label for="" class="form-label">N_factura</label>
                    <input type="text"
                        class="form-control" name="N_factura" id="" aria-describedby="helpId" placeholder="">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">descripción</label>
                    <input type="text"
                        class="form-control" name="descripción" id="" aria-describedby="helpId" placeholder="">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">cantidad</label>
                    <input type="text"
                        class="form-control" name="cantidad" id="" aria-describedby="helpId" placeholder="">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">iva</label>
                    <input type="text"
                        class="form-control" name="iva" id="" aria-describedby="helpId" placeholder="">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">descuento</label>
                    <input type="text"
                        class="form-control" name="descuento" id="" aria-describedby="helpId" placeholder="">
                    
                </div>
                <div class="mb-3">
                    <label for="" class="form-label">total</label>
                    <input type="text"
                        class="form-control" name="total" id="" aria-describedby="helpId" placeholder="">
                    
                </div>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                <button button type="submit" class="btn btn-primary">Guardar</button>
            </div>
            
            </form>
        </div>
    </div>
</div>


<!-- Modal -->
<div class="modal fade" id="delete{{$venta->id}}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">ELIMINAR GARANTIA</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
            
            <form action="{{route('ventas.destroy',$venta->id)}} " method="post" enctype="multipart/form-data">
                @csrf
                @method('DELETE')
            <div class="modal-body">
            Estas seguro de eliminar a <strong> {{$venta->N_factura}} ? </strong>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                <button button type="submit" class="btn btn-primary">Guardar</button>
            </div>
            </form>
        </div>
    </div>
</div>