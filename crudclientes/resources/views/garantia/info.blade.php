
<!-- Modal -->
<div class="modal fade" id="edit{{$garantia->id}}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">EDITAR GARANTIA</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
            
            <form action="{{route('garantias.update',$garantia->id)}} " method="post" enctype="multipart/form-data">
                @csrf
                @method('PUT')
            <div class="modal-body">
                <div class="mb-3">
                    <label for="" class="form-label">Nombre_producto</label>
                    <input type="text"
                        class="form-control" name="Nombre_producto" id="" aria-describedby="helpId" placeholder="" value="{{$garantia->Nombre_producto}}">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">descripción</label>
                    <input type="text"
                        class="form-control" name="descripción" id="" aria-describedby="helpId" placeholder="" value="{{$garantia->descripción}}">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">tiempo_establecido</label>
                    <input type="text"
                        class="form-control" name="tiempo_establecido" id="" aria-describedby="helpId" placeholder="" value="{{$garantia->tiempo_establecido}}">
                    
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