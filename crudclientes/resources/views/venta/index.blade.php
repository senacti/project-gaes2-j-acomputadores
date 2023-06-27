@extends('ventas')


@section('content')
<div class="Tabla" style="position: relative; top: -900px; left: 100px;">
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8">
            <br></br>
            <h3>Ventas</h3>
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
                            <th scope="col">N_factura</th>
                            <th scope="col">descripción</th>
                            <th scope="col">cantidad</th>
                            <th scope="col">iva</th>
                            <th scope="col">descuento</th>
                            <th scope="col">total</th>
                            <th scope="col">Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        @foreach($ventas as $venta)
                        <tr class="">
                            <td scope="row"> {{$venta->id}} </td>
                            <td> {{$venta->N_factura}} </td>
                            <td> {{$venta->descripción}} </td>
                            <td> {{$venta->cantidad}} </td>
                            <td> {{$venta->iva}} </td>
                            <td> {{$venta->descuento}} </td>
                            <td> {{$venta->total}} </td>
                            <td>
                                <button type="button" class="btn btn-success" data-toggle="modal" data-target="#edit{{$venta->id}}">
                                    Editar
                                </button>
                                <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#delete{{$venta->id}}">
                                    Eliminar
                                </button>
                            </td>
                        </tr>
                        @include('venta.info')
                        @endforeach
                    </tbody>
                </table>
            </div>
            @include('venta.create')

        </div>
        <div class="col-md-2"></div>
    </div>
</div>

@endsection