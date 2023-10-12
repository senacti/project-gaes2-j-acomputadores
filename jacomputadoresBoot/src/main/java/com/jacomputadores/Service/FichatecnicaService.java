package com.jacomputadores.Service;

import com.jacomputadores.Entity.FichaTecnica;

import java.util.List;

public interface FichatecnicaService {

    public List<FichaTecnica> ConsultarFichatecnica();

    public FichaTecnica CrearFichatecnica(FichaTecnica fichaTecnica);
    public FichaTecnica ModificarFichatecnica(FichaTecnica fichaTecnica);
    public FichaTecnica BuscarFichatecnica(int id);
    public void EliminarFichatecnica(int id);
}
