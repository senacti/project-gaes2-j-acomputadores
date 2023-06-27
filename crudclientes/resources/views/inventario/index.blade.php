@extends('inventarios')


@section('content')
<div class="Tabla" style="position: relative; top: -900px; left: 100px;">
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8">
            <br></br>
            <h3>Productos</h3>
            <br></br>
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#create">
                Nuevo
            </button>
            <div class="table-responsive">
                <br>
                <table class="table table-primary">
                    <thead class="bg-dark-text-white">
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">nombre_producto</th>
                            <th scope="col">descripción</th>
                            <th scope="col">marca</th>
                            <th scope="col">precio_U</th>
                            <th scope="col">imagenes</th>
                            <th scope="col">Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        @foreach($inventarios as $inventario)
                        <tr class="">
                            <td scope="row"> {{$inventario->id}} </td>
                            <td> {{$inventario->nombre_producto}} </td>
                            <td> {{$inventario->descripción}} </td>
                            <td> {{$inventario->marca}} </td>
                            <td> {{$inventario->precio_U}} </td>
                            <td> {{$inventario->imagenes}} </td>
                            <td>
                                <button type="button" class="btn btn-success" data-toggle="modal" data-target="#edit{{$inventario->id}}">
                                    Editar
                                </button>
                                <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#delete{{$inventario->id}}">
                                    Eliminar
                                </button>
                            </td>
                        </tr>
                        @include('inventario.info')
                        @endforeach
                    </tbody>
                </table>
            </div>
            @include('inventario.create')

        </div>
        <div class="col-md-2"></div>
    </div>
</div>
@endsection
