<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class ventas extends Model
{
    use HasFactory;
    protected $table='ventas';
    protected $primaryKey='id';
    protected $fillable=['nombre','Cantidad','Descripcion','Descuento'];
    protected $guarded=[];
    public $timestamps=false;
}
