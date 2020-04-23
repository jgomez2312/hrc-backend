package es.gystechsoluciones.hrcbackend.app.dao;

import es.gystechsoluciones.hrcbackend.app.entity.Empresa;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IEmpresaDao extends CrudRepository<Empresa, Long> {

    List<Empresa> findAllByTipoEmpresa(String tipoEmpresa);
}
