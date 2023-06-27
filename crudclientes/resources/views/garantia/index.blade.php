@extends('garantias')


@section('content')
<div class="Tabla" style="position: relative; top: -900px; left: 100px;">
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8">
            <br></br>
            <h3>Garantias</h3>
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
                            <th scope="col">Nombre_producto</th>
                            <th scope="col">descripción</th>
                            <th scope="col">tiempo_establecido</th>
                            <th scope="col">Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        @foreach($garantias as $garantia)
                        <tr class="">
                            <td scope="row"> {{$garantia->id}} </td>
                            <td> {{$garantia->Nombre_producto}} </td>
                            <td> {{$garantia->descripción}} </td>
                            <td> {{$garantia->tiempo_establecido}} </td>
                            <td>
                                <button type="button" class="btn btn-success" data-toggle="modal" data-target="#edit{{$garantia->id}}">
                                    Editar
                                </button>
                                <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#delete{{$garantia->id}}">
                                    Eliminar
                                </button>
                            </td>
                        </tr>
                        @include('garantia.info')
                        @endforeach
                    </tbody>
                </table>
            </div>
            @include('garantia.create')

        </div>
        <div class="col-md-2"></div>
    </div>
</div>
@endsection
