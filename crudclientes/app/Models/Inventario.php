<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Inventario extends Model
{
    use HasFactory;
    protected $table='inventarios';
    protected $primaryKey='id';
    protected $fillable=['nombre_producto','descripción','marca','precio_U','imagenes'];
    protected $guarded=[];
    public $timestamps=false;
}
