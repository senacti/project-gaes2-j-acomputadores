<?php

namespace App\Http\Controllers;

use App\Models\Inventario;
use Illuminate\Http\Request;

class InventarioController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $inventarios=Inventario::all();
        return view('inventario.index', compact('inventarios'));
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
        $inventarios=new Inventario;
        $inventarios->nombre_producto=$request->input('nombre_producto');
        $inventarios->descripción=$request->input('descripción');
        $inventarios->marca=$request->input('marca');
        $inventarios->precio_U=$request->input('precio_U');
        $inventarios->imagenes=$request->input('imagenes');
        $inventarios->save();
        return redirect()->back();
        //
    }

    /**
     * Display the specified resource.
     */
    public function show(Inventario $inventario)
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
        $inventarios=Inventario::find($id);
        $inventarios->nombre_producto=$request->input('nombre_producto');
        $inventarios->descripción=$request->input('descripción');
        $inventarios->marca=$request->input('marca');
        $inventarios->precio_U=$request->input('precio_U');
        $inventarios->imagenes=$request->input('imagenes');
        $inventarios->update();
        return redirect()->back();
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy($id)
    {
        $inventarios=Inventario::find($id);
        $inventarios->delete();
        return redirect()->back();
        //
    }
}
