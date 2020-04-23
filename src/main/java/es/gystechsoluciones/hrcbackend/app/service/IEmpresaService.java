package es.gystechsoluciones.hrcbackend.app.service;

import es.gystechsoluciones.hrcbackend.app.entity.Empresa;

import java.util.List;

public interface IEmpresaService {

    List<Empresa> findAll();
    List<Empresa> findAllByTipoEmpresas(String tipoEmpresa);
    Empresa findById(Long Id);
    Empresa save(Empresa empresa);
    void delete(Long id);

}
