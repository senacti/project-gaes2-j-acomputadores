<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="https://unpkg.com/boxicons@2.0.5/css/boxicons.min.css" rel="stylesheet">
  <title>J.A COMPUTADORES</title>
  <link rel="stylesheet" href="{{asset('css/welcome.css')}}">
</head>
<body>
  <header class="header" id="header">
    <div class="logo"> 
        <button class="Ingresar"><a href="login" style="text-decoration: none; color: white;">INICIAR SESION</a></button>
        <button class="Registrar"><a href="register" style="text-decoration: none; color: white;">Registrar</a></button>
        <img class="imglogo" src="IMG/ds.png">
        <nav class="Menu">
            <a href="#Inicio" style="text-decoration: none; color: white;">inicio</a>
            <a href="#Promociones" style="text-decoration: none; color: white;">Promociones</a>
            <a href="#Productos" style="text-decoration: none; color: white;">Productos</a>
            <a href="#Servicios" style="text-decoration: none; color: white;">Servicios</a>
            <a href="#Contacto" style="text-decoration: none; color: white;">Contacto</a>
        </nav>
    </div>
    <div class=" nombre">
      <h1>Solucionamos tus problemas <br> tecnologicos <br><br>J.A COMPUTADORES </h1>
  </div>
  
    <div class="carrusel-contenido">
          <div id="carrusel-caja">
              <div class="carrusel-elemento">
                  <img class="imagenes" src="IMG/fondo1.jpg" >
              </div>
              <div class="carrusel-elemento">   
                  <img class="imagenes" src="IMG/fondo2.jpg">
              </div>
              <div class="carrusel-elemento">   
                  <img class="imagenes" src="IMG/imagen3.jpg">                        
              </div>
          </div>  
      </div>
    </div>
</header>
  <main>
    <section class="Prom contenedor" id="Promociones">
      <h2 class="subtitulo">Promociones</h2>
      <div class="contenedor-promo">
        <div class="prom1">
          <h3 class="text0">Promociones Del Día</h3>
          <button class="ds">45% Descuento</button>
          <img class="imagen0" src="IMG/promocione.png">
        </div>
        <div class="prom2">
          <h3 class="text1">Canon 4000D con lente 18-55mm + Memoria 64Gb de 100Mb/s</h3>
          <img class="imagen1" src="IMG/camera.png">
        </div>
      </div>
    </section>

    <section class="product contenedor" id="Productos">
      <h2 class="subtitulo">Productos</h2>
      <div class="contenedor-productos">
        
        <div class="card1">
          <div class="car1">
            <img class="Imagen3" src="IMG/gamer.jpg">
              <div class="InfoCard">
                <h4>Pc Gamer<br>Gama Media</h4>
                <p class="Precio">$2.500.000</p>
              </div>
              <button class="ds">
                <div class="hover-btn">
                  <svg class="css-i6dzq1" stroke-linejoin="round" stroke-linecap="round" fill="none" stroke-width="2" stroke="#ffd300" height="20" width="20" viewBox="0 0 24 24"><circle r="1" cy="21" cx="9"></circle><circle r="1" cy="21" cx="20"></circle><path d="M1 1h4l2.68 13.39a2 2 0 0 0 2 1.61h9.72a2 2 0 0 0 2-1.61L23 6H6"></path></svg>
                  <span>Comprar</span>
                </div>
              </button>
          </div>
        </div>
        <div class="card2">
          <div class="car2">
            <img class="Imagen4" src="IMG/procesador.jpg">
              <div class="InfoCard1">
                <h4>AMD Raizen 7<br>3700 X</h4>
                <p class="Precio">$1.300.000</p>
              </div>
              <button class="ds">
                <div class="hover-btn">
                  <svg class="css-i6dzq1" stroke-linejoin="round" stroke-linecap="round" fill="none" stroke-width="2" stroke="#ffd300" height="20" width="20" viewBox="0 0 24 24"><circle r="1" cy="21" cx="9"></circle><circle r="1" cy="21" cx="20"></circle><path d="M1 1h4l2.68 13.39a2 2 0 0 0 2 1.61h9.72a2 2 0 0 0 2-1.61L23 6H6"></path></svg>
                  <span>Comprar</span>
                </div>
              </button>
          </div>
        </div>
        <div class="card3">
          <div class="car3">
            <img class="Imagen5" src="IMG/audifonos.jpg">
              <div class="InfoCard2">
                <h4>Audifonos <br>Con Diadema Sony</h4>
                <p class="Precio">$50.900</p>
              </div>
              <button class="ds">
                <div class="hover-btn">
                  <svg class="css-i6dzq1" stroke-linejoin="round" stroke-linecap="round" fill="none" stroke-width="2" stroke="#ffd300" height="20" width="20" viewBox="0 0 24 24"><circle r="1" cy="21" cx="9"></circle><circle r="1" cy="21" cx="20"></circle><path d="M1 1h4l2.68 13.39a2 2 0 0 0 2 1.61h9.72a2 2 0 0 0 2-1.61L23 6H6"></path></svg>
                  <span>Comprar</span>
                </div>
              </button>
          </div>
        </div>
        <div class="card4">
          <div class="car4">
            <img class="Imagen6" src="IMG/raton.jpg">
              <div class="InfoCard3">
                <h4>Mause Alambrico <br>Hp 200 Negro</h4>
                <p class="Precio">$40000</p>
              </div>
            </div>
        </div>
      </div>
    </section>

    <section class="contenedor" id="Servicios">
      <h2 class="subtitulo">Servicios</h2>
      <section class="servi">
        <div class="cont-servi">
          <img src="IMG/maintenance.png">
          <h3 class="n-servi">Mantenimientos</h3>
        </div>
        <div class="cont-servi">
          <img src="IMG/Online.png">
          <h3 class="n-servi">Ventas</h3>
        </div>
      </section>
    </section>

  </main>
  <footer id="Contacto">
    <div class="footer-content">
      <div class="contac-us">
        <h2 class="brand">Daniel Alarcon</h2>
        <p>Experto en tecnologia</p>
        <div class="line"></div>
      </div>
      <div class="social-media">
        <a href="./" class="social-media-icon">
          <i class="bx bxl-facebook"></i>
        </a>
        <a href="./" class="social-media-icon">
          <i class="bx bxl-twitter"></i>
        </a>
        <a href="./" class="social-media-icon">
          <i class="bx bxl-instagram"></i>
        </a>
      </div>
    </div>
  </footer>
  <script src="script.js"></script>
</body>
</html>
