<?php

namespace App\Http\Controllers;

use App\Models\Mantenimiento;
use Illuminate\Http\Request;

class MantenimientoController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $mantenimientos=Mantenimiento::all();
        return view('mantenimiento.index', compact('mantenimientos'));
        //
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $mantenimientos=new Mantenimiento;
        $mantenimientos->fecha_orden=$request->input('fecha_orden');
        $mantenimientos->id_cliente=$request->input('id_cliente');
        $mantenimientos->descripcion=$request->input('descripcion');
        $mantenimientos->precio_U=$request->input('precio_U');
        $mantenimientos->iva=$request->input('iva');
        $mantenimientos->total=$request->input('total');
        $mantenimientos->save();
        return redirect()->back();
        //
    }

    /**
     * Display the specified resource.
     */
    public function show(Mantenimiento $mantenimiento)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit($id)
    {
        
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, $id)
    {
        $mantenimientos=Mantenimiento::find($id);
        $mantenimientos->fecha_orden=$request->input('fecha_orden');
        $mantenimientos->id_cliente=$request->input('id_cliente');
        $mantenimientos->descripcion=$request->input('descripcion');
        $mantenimientos->precio_U=$request->input('precio_U');
        $mantenimientos->iva=$request->input('iva');
        $mantenimientos->total=$request->input('total');
        $mantenimientos->update();
        return redirect()->back();
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy($id)
    {
        $mantenimientos=Mantenimiento::find($id);
        $mantenimientos->delete();
        return redirect()->back(); 
        //
    }
}
