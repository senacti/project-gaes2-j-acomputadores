<!-- Modal -->
<div class="modal fade" id="create" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Crear Productos</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
            
            <form action="{{route('inventarios.store')}} " method="post" enctype="multipart/form-data">
                @csrf
            <div class="modal-body">
                <div class="mb-3">
                    <label for="" class="form-label">nombre_producto</label>
                    <input type="text"
                        class="form-control" name="nombre_producto" id="" aria-describedby="helpId" placeholder="">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">descripción</label>
                    <input type="text"
                        class="form-control" name="descripción" id="" aria-describedby="helpId" placeholder="">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">marca</label>
                    <input type="text"
                        class="form-control" name="marca" id="" aria-describedby="helpId" placeholder="">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">precio_U</label>
                    <input type="text"
                        class="form-control" name="precio_U" id="" aria-describedby="helpId" placeholder="">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">imagenes</label>
                    <input type="text"
                        class="form-control" name="imagenes" id="" aria-describedby="helpId" placeholder="">
                    
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
<div class="modal fade" id="delete{{$inventario->id}}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">ELIMINAR PRODUCTO</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
            
            <form action="{{route('inventarios.destroy',$inventario->id)}} " method="post" enctype="multipart/form-data">
                @csrf
                @method('DELETE')
            <div class="modal-body">
            Estas seguro de eliminar a <strong> {{$inventario->nombre_producto}} ? </strong>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                <button button type="submit" class="btn btn-primary">Guardar</button>
            </div>
            </form>
        </div>
    </div>
</div>