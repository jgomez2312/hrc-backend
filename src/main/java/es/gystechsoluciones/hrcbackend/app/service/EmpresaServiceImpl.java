package es.gystechsoluciones.hrcbackend.app.service;

import es.gystechsoluciones.hrcbackend.app.dao.IEmpresaDao;
import es.gystechsoluciones.hrcbackend.app.entity.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

    private final IEmpresaDao empresaDao;

    @Autowired
    public EmpresaServiceImpl(IEmpresaDao empresaDao) {
        this.empresaDao = empresaDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Empresa> findAll() {
        return (List<Empresa>) empresaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Empresa> findAllByTipoEmpresas(String tipoEmpresa) {
        return empresaDao.findAllByTipoEmpresa(tipoEmpresa);
    }

    @Override
    @Transactional(readOnly = true)
    public Empresa findById(Long id) {
        return empresaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Empresa save(Empresa empresa) {
        return empresaDao.save(empresa);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        empresaDao.deleteById(id);
    }

}
