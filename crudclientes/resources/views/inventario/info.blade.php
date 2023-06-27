
<!-- Modal -->
<div class="modal fade" id="edit{{$inventario->id}}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">EDITAR PRODUCTO</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
            
            <form action="{{route('inventarios.update',$inventario->id)}} " method="post" enctype="multipart/form-data">
                @csrf
                @method('PUT')
            <div class="modal-body">
                <div class="mb-3">
                    <label for="" class="form-label">nombre_producto</label>
                    <input type="text"
                        class="form-control" name="nombre_producto" id="" aria-describedby="helpId" placeholder="" value="{{$inventario->nombre_producto}}">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">descripción</label>
                    <input type="text"
                        class="form-control" name="descripción" id="" aria-describedby="helpId" placeholder="" value="{{$inventario->descripción}}">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">marca</label>
                    <input type="text"
                        class="form-control" name="marca" id="" aria-describedby="helpId" placeholder="" value="{{$inventario->marca}}">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">precio_U</label>
                    <input type="text"
                        class="form-control" name="precio_U" id="" aria-describedby="helpId" placeholder="" value="{{$inventario->precio_U}}">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">imagenes</label>
                    <input type="text"
                        class="form-control" name="imagenes" id="" aria-describedby="helpId" placeholder="" value="{{$inventario->imagenes}}">
                    
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