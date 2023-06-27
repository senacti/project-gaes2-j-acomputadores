<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Usuario extends Model
{
    use HasFactory;
    protected $table='usuarios';
    protected $primaryKey='id';
    protected $fillable=['N_documento','nombre_usuario','apellido_usuario','contraseña','Correo_electronico','direccion','rol'];
    protected $guarded=[];
    public $timestamps=false;
}
