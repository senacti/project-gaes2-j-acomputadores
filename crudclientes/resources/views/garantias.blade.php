<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css" rel="stylesheet">
    <title>Garantia</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS v5.2.1 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">

    <link rel="stylesheet" href="{{asset('css/garantia.css')}}"> 
    <script src="./js/app.js" defer></script>

</head>
<div class="menu-dashboard">
        <!-- TOP MENU -->
        <div class="top-menu">
            <div class="logo">
                <img src="./img/ds.png" alt="">
                <span>J.A Computadores</span>
            </div>
            <div class="toggle">
                <i class='bx bx-menu'></i>
            </div>
        </div>
        <!-- INPUT SEARCH -->
        <div class="input-search">
            <i class='bx bx-search'></i>
            <input type="text" class="input" placeholder="Buscar">
        </div>
        <!-- MENU -->
        <div class="menu">
            <div class="enlace">
                <a class="selecc" href="home" style="text-decoration: none;">
                <i class="bx bx-grid-alt"></i>
                <span>Menu</span>
                </a>
            </div>

            <div class="enlace">
                <a class="selecc" href="usuarios" style="text-decoration: none;">
                <i class="bx bx-user"></i>
                <span>Usuarios</span>
                </a>
            </div>

            <div class="enlace">
                <a class="selecc" href="inventarios" style="text-decoration: none;">
                <i class='bx bxs-book'></i>
                <span>Inventario</span>
                </a>
            </div>

            <div class="enlace">
                <a class="selecc" href="ventas" style="text-decoration: none;">
                <i class='bx bxs-cart'></i>
                <span>Ventas</span>
                </a>
            </div>

            <div class="enlace">
                <a class="selecc" href="mantenimientos" style="text-decoration: none;">
                <i class='bx bxs-wrench'></i>
                <span>Mantenimientos</span>
                </a>
            </div>

            <div class="enlace">
                <a class="selecc" href="garantias" style="text-decoration: none;">
                <i class='bx bxs-shield'></i>
                <span>Garantias</span>
                </a>
            </div>

            <div class="enlace">
                <i class="bx bx-cog"></i>
                <span>Configuración</span>
            
            </div>
        </div>
    </div>


    <section class="Centro" id="Centro">
        <div class="header">
            <h1>Garantia</h1>
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


    <div class="crud">
    @yield('content')
    <!-- Bootstrap JavaScript Libraries -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
        integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous">
    </script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
        integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz" crossorigin="anonymous">
    </script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</div>

</body>
</html>