<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Garantia extends Model
{
    use HasFactory;
    protected $table='garantias';
    protected $primaryKey='id';
    protected $fillable=['Nombre_producto','descripción','tiempo_establecido'];
    protected $guarded=[];
    public $timestamps=false;
}
