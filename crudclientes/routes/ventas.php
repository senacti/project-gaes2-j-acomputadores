<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet"href="{{asset ('css/ )}}">
    <link rel="stylesheet" href="{{asset ('css/normalize.css')}}">
    <title>dashboard</title>
</head>
<body>
    <section class="Izquierda" id="Izquierda">
        <div class="M"> 
            <img class="Logo" src="IMG/ds.png">
            <h1 class="Logotitulo">J.A Computadores</h1>
        </div>
        <div class="MenuLogo">
            <nav>
                <li>
                    <a class="selecc" href="#" style="text-decoration: none;">
                        <i class='bx bxs-home' style='color:#ffffff'  ></i>
                        <span class="text">Home</span>
                    </a>
                </li>
                <li>
                    <a class="selecc" href="Index.html" style="text-decoration: none;">
                        <i class='bx bxs-user-circle' style='color:#ffffff' ></i>
                        <span class="text">Usuarios</span>
                    </a>
                </li>
                <li>
                    <a class="selecc" href="ventas.html" style="text-decoration: none;">
                        <i class='bx bxs-shopping-bag' style='color:#ffffff'  ></i>
                        <span class="text">Tienda</span>
                    </a>
                </li>
                <li>
                    <a class="selecc" href="inventario.html" style="text-decoration: none;">
                        <i class='bx bxs-book' style='color:#ffffff'  ></i>
                        <span class="text">Inventario</span>
                    </a>
                </li>
                <li>
                    <a class="selecc" href="garantias.html" style="text-decoration: none;">
                        <i class='bx bxs-shield' style='color:#ffffff' ></i>
                        <span class="text">Garantias</span>
                    </a>
                </li>
            </nav>
        </div>
        <div class="login">
            <img class="loginfoto" src="IMG/Perfil.jpg">
            <h2 class="logintext">Daniel<br>Admin</h2>
            <img class="loginflecha" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAAAXNSR0IArs4c6QAAAKxJREFUSEvtk9ENwjAMRF83YJN2BJiIEUo36EYwAmzCCOgkkEIax85HJZDirza63rMv7sDONezsTwe4CfeIfj+iC7ACT6PVA3AGFmuU2iXLfAbuwKkAkfkVmN4A6TdVA8jgBowFSGr+AI7WlN6aliDq8tN51VxCDyBNDtGZYnHNo4AcoveQeQsghejZzDy/5UhE6TeKS2WtbdMWuX9pRNA6QcTzS9MBbmT/H9ELPngdGfgDn7kAAAAASUVORK5CYII="/>
        </div>
    </section>

    <section class="Centro" id="Centro">
        <div class="header">
            <h1>Tienda</h1>
            <form class="Buscar">
                <button>
                    <svg width="17" height="16" fill="none" xmlns="http://www.w3.org/2000/svg" role="img" aria-labelledby="search">
                        <path d="M7.667 12.667A5.333 5.333 0 107.667 2a5.333 5.333 0 000 10.667zM14.334 14l-2.9-2.9" stroke="currentColor" stroke-width="1.333" stroke-linecap="round" stroke-linejoin="round"></path>
                    </svg>
                </button>
                <input class="input" placeholder="Realice su busqueda" required="" type="text">
                <button class="reset" type="reset">
                    <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6" fill="none" viewBox="0 0 24 24" stroke="currentColor" stroke-width="2">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M6 18L18 6M6 6l12 12"></path>
                    </svg>
                </button>
            </form>
    </section>

    <div class="fondotabla2">
        <div class="tabla2">
            <table>
                <thead>
                    <th>ID</th>
                    <th>Nombre de Venta</th>
                    <th>Descripción</th>
                    <th>Precio</th>
                    <th>Fecha de Creación</th>
                </thead>
                <tbody>
                    <tr>
                        <td>152</td>
                        <td>Mause Gamer</td>
                        <td>Ratón recargable inalámbrico USB 2400DPI</td>
                        <td>$48.231</td>
                        <td>2/02/2023</td>
                    </tr>
                    <tr>
                        <td>452</td>
                        <td>Microfono</td>
                        <td>Micrófono De Escritorio USB 360 Ajustable</td>
                        <td>$14.539</td>
                        <td>28/02/2023</td>
                    </tr>
                    <tr>
                        <td>852</td>
                        <td>Cable HDMI</td>
                        <td>Cable adaptador HDMI macho a VGA macho convertidor de vídeo para PC DVD</td>
                        <td>$20.706</td>
                        <td>14/02/2023</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>

    <div class="fondoformulario">
        <div class="formulario">
            <div class="for1">
                <h2>Nombre del Producto</h2>
                <input type="text" name="producto" id="producto" placeholder="Ingrese Nombre del producto">
            </div>
            <div class="for2">
                <h2>Categoria</h2>
                <input type="text" name="datos" id="datos" placeholder="Ingrese Categoria">
            </div>
            <div class="for3">
                <h2>Descripción del producto</h2>
                <input type="text" name="apellido" id="apellido" placeholder="Ingrese Descripción">
            </div>
            <div class="for4">
                <h2>Precio Venta</h2>
                <input type="text" name="dirección" id="dirección" placeholder="Ingrese Precio final">
            </div>
            <div class="for5">
                <h2>% Descuento</h2>
                <input type="text" name="Factura" id="Factura" placeholder="Ingrese Descuento">
            </div>
            <div class="for6">
                <h2>Cantidad Disponible</h2>
                <input type="text" name="venta" id="venta" placeholder="Ingrese Cantidad">
            </div>
            <div class="for10">
                <h2>Imagen del producto</h2>
                <img src="IMG/download.png" style="height: 30px; width: 30px;">
            </div>
            <button class="Cancelar">Cancelar</button>
            <button class="Guardar">Guardar</button>
        </div>
    </div>

    <div class="fondotabla1">
        <div class="tabla1">
            <table>
                <tbody>
                    <tr>
                        <td class="cuadro">123</td>
                        <td>Julian Sanchez</td>
                        <td>$150.000</td>
                        <td>20/03/2023</td>
                        <td class="proceso">Completado</td>
                        <td>...</td>
                    </tr>
                    <tr>
                        <td class="cuadro2">234</td>
                        <td>Lucia Rodriguez</td>
                        <td>$50.000</td>
                        <td>18/03/2023</td>
                        <td class="proceso2">Pendiente</td>
                        <td>...</td>
                    </tr>
                    <tr>
                        <td class="cuadro3">24</td>
                        <td>Rocio Mendez</td>
                        <td>$200.000</td>
                        <td>7/03/2023</td>
                        <td class="proceso3">Completado</td>
                        <td>...</td>
                    </tr>
                    <tr>
                        <td class="cuadro4">56</td>
                        <td>Juan Gonzales</td>
                        <td>$20.000</td>
                        <td>2/03/2023</td>
                        <td class="proceso4">Error</td>
                        <td>...</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>

    <div class="graficas">
        <img class="gra1" src="IMG/Grafica1.png">
        <img class="gra2" src="IMG/Grafica2.png">
    </div>

</body>
</html>