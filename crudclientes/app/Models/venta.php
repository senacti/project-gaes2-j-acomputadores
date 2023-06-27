<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class venta extends Model
{
    use HasFactory;
    protected $table='ventas';
    protected $primaryKey='id';
    protected $fillable=['N_factura','descripción','cantidad','iva','descuento','total'];
    protected $guarded=[];
    public $timestamps=false;
}
