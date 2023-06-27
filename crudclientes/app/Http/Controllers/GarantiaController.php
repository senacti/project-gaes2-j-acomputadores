<?php

namespace App\Http\Controllers;

use App\Models\Garantia;
use Illuminate\Http\Request;

class GarantiaController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $garantias=Garantia::all();
        return view('garantia.index', compact('garantias'));
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
        $garantias=new Garantia;
        $garantias->Nombre_producto=$request->input('Nombre_producto');
        $garantias->descripción=$request->input('descripción');
        $garantias->tiempo_establecido=$request->input('tiempo_establecido');
        $garantias->save();
        return redirect()->back();
        //
    }

    /**
     * Display the specified resource.
     */
    public function show(garantia $garantia)
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
        $garantias=Garantia::find($id);
        $garantias->Nombre_producto=$request->input('Nombre_producto');
        $garantias->descripción=$request->input('descripción');
        $garantias->tiempo_establecido=$request->input('tiempo_establecido');
        $garantias->update();
        return redirect()->back();
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy($id)
    {
        $garantias=Garantia::find($id);
        $garantias->delete();
        return redirect()->back();  
        //
    }
}
