<?php

namespace App\Http\Controllers;

use App\Models\Usuario;
use Illuminate\Http\Request;

class UsuarioController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $usuarios=Usuario::all();
        return view('usuario.index', compact('usuarios')); 
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
        $usuarios=new Usuario;
        $usuarios->N_documento=$request->input('N_documento');
        $usuarios->nombre_usuario=$request->input('nombre_usuario');
        $usuarios->apellido_usuario=$request->input('apellido_usuario');
        $usuarios->contraseña=$request->input('contraseña');
        $usuarios->Correo_electronico=$request->input('Correo_electronico');
        $usuarios->direccion=$request->input('direccion');
        $usuarios->rol=$request->input('rol');
        $usuarios->save();  
        return redirect()->back();
        //
    }

    /**
     * Display the specified resource.
     */
    public function show(Usuario $usuario)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit($id_U)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, $id)
    {
        $usuarios=Usuario::find($id);
        $usuarios->N_documento=$request->input('N_documento');
        $usuarios->nombre_usuario=$request->input('nombre_usuario');
        $usuarios->apellido_usuario=$request->input('apellido_usuario');
        $usuarios->contraseña=$request->input('contraseña');
        $usuarios->Correo_electronico=$request->input('Correo_electronico');
        $usuarios->direccion=$request->input('direccion');
        $usuarios->rol=$request->input('rol');
        $usuarios->update();
        return redirect()->back();
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy($id)
    {
        $usuarios=Usuario::find($id);
        $usuarios->delete();
        return redirect()->back(); 
        //
    }
}
