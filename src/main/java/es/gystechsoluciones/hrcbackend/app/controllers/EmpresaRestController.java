package es.gystechsoluciones.hrcbackend.app.controllers;

import es.gystechsoluciones.hrcbackend.app.entity.Empresa;
import es.gystechsoluciones.hrcbackend.app.service.EmpresaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EmpresaRestController {

    private final EmpresaServiceImpl empresaService;

    @Autowired
    public EmpresaRestController(EmpresaServiceImpl empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping("/empresas")
    public List<Empresa> listEmpresas(){
        return empresaService.findAll();
    }

    @GetMapping("/clientes")
    public List<Empresa> listClientes(){
        return empresaService.findAllByTipoEmpresas("CLIENTE");
    }

    @GetMapping("/proveedores")
    public List<Empresa> listProveedores(){
        return empresaService.findAllByTipoEmpresas("PROVEEDOR");
    }

    @GetMapping("/oportunidades")
    public List<Empresa> listOportunidades(){
        return empresaService.findAllByTipoEmpresas("OPORTUNIDAD");
    }
}
