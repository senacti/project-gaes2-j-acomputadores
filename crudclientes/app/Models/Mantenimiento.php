<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Mantenimiento extends Model
{
    use HasFactory;
    protected $table='mantenimientos';
    protected $primaryKey='id';
    protected $fillable=['fecha_orden','id_cliente','descripcion','precio_U','iva','total'];
    protected $guarded=[];
    public $timestamps=false;
}
