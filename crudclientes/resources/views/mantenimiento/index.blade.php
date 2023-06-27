@extends('mantenimientos')


@section('content')
<div class="Tabla" style="position: relative; top: -900px; left: 100px;">
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8">
            <br></br>
            <h3>ORDEN DE SERVICIO</h3>
            <br></br>
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#create">
                Nuevo
            </button>
            <div class="table-responsive">
                <br>
                <table class="table table-primary">
                    <thead class="bg-dark-text-white">
                        <tr>
                            <th scope="col">id</th>
                            <th scope="col">fecha_orden</th>
                            <th scope="col">id_cliente</th>
                            <th scope="col">descripcion</th>
                            <th scope="col">precio_U</th>
                            <th scope="col">iva</th>
                            <th scope="col">total</th>
                            <th scope="col">Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        @foreach($mantenimientos as $mantenimiento)
                        <tr class="">
                            <td scope="row"> {{$mantenimiento->id}} </td>
                            <td> {{$mantenimiento->fecha_orden}} </td>
                            <td> {{$mantenimiento->id_cliente}} </td>
                            <td> {{$mantenimiento->descripcion}} </td>
                            <td> {{$mantenimiento->precio_U}} </td>
                            <td> {{$mantenimiento->iva}} </td>
                            <td> {{$mantenimiento->total}} </td>
                            <td>
                                <button type="button" class="btn btn-success" data-toggle="modal" data-target="#edit{{$mantenimiento->id}}">
                                    Editar
                                </button>
                                <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#delete{{$mantenimiento->id}}">
                                    Eliminar
                                </button>
                            </td>
                        </tr>
                        @include('mantenimiento.info')
                        @endforeach
                    </tbody>
                </table>
            </div>
            @include('mantenimiento.create')

        </div>
        <div class="col-md-2"></div>
    </div>
</div>
@endsection
