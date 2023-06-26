
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
            
            <form action="{{route('home.store')}} " method="post" enctype="multipart/form-data">
                @csrf
            <div class="modal-body">
                <div class="mb-3">
                    <label for="" class="form-label">Nombre</label>
                    <input type="text"
                        class="form-control" name="nombre" id="" aria-describedby="helpId" placeholder="">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">telefono</label>
                    <input type="text"
                        class="form-control" name="telefono" id="" aria-describedby="helpId" placeholder="">
                    
                </div>

                <div class="mb-3">
                    <label for="" class="form-label">Correo</label>
                    <input type="email"
                        class="form-control" name="correo" id="" aria-describedby="helpId" placeholder="">
                    
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
<div class="modal fade" id="delete{{$cliente->id}}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">ELIMINAR CLIENTE</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
            
            <form action="{{route('home.destroy',$cliente->id)}} " method="post" enctype="multipart/form-data">
                @csrf
                @method('DELETE')
            <div class="modal-body">
            Estas seguro de eliminar a <strong> {{$cliente->nombre}} ? </strong>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                <button button type="submit" class="btn btn-primary">Guardar</button>
            </div>
            </form>
        </div>
    </div>
</div>