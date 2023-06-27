
<!-- Modal -->
<div class="modal fade" id="edit{{$mantenimiento->id}}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">EDITAR ORDEN SERVICIO</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
            
            <form action="{{route('mantenimientos.update',$mantenimiento->id)}} " method="post" enctype="multipart/form-data">
                @csrf
                @method('PUT')
            <div class="modal-body">
                <div class="mb-3">
                    <label for="" class="form-label">fecha_orden</label>
                    <input type="text"
                        class="form-control" name="fecha_orden" id="" aria-describedby="helpId" placeholder="" value="{{$mantenimiento->fecha_orden}}">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">id_cliente</label>
                    <input type="text"
                        class="form-control" name="id_cliente" id="" aria-describedby="helpId" placeholder="" value="{{$mantenimiento->id_cliente}}">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">descripcion</label>
                    <input type="text"
                        class="form-control" name="descripcion" id="" aria-describedby="helpId" placeholder="" value="{{$mantenimiento->descripcion}}">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">precio_U</label>
                    <input type="text"
                        class="form-control" name="precio_U" id="" aria-describedby="helpId" placeholder="" value="{{$mantenimiento->precio_U}}">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">iva</label>
                    <input type="text"
                        class="form-control" name="iva" id="" aria-describedby="helpId" placeholder="" value="{{$mantenimiento->iva}}">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">total</label>
                    <input type="text"
                        class="form-control" name="total" id="" aria-describedby="helpId" placeholder="" value="{{$mantenimiento->total}}">
                    
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