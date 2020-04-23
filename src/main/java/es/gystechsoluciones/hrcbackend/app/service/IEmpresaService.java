package es.gystechsoluciones.hrcbackend.app.service;

import es.gystechsoluciones.hrcbackend.app.entity.Empresa;

import java.util.List;

public interface IEmpresaService {

    public List<Empresa> findAll();
    public List<Empresa> findAllByTipoEmpresas(String tipoEmpresa);

    public Empresa save(Empresa empresa);

}
