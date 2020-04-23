package es.gystechsoluciones.hrcbackend.app.controllers;

import es.gystechsoluciones.hrcbackend.app.entity.Empresa;
import es.gystechsoluciones.hrcbackend.app.service.EmpresaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    /**
     * Metodo Buscar todos.
     * @return Busca todos las empresas.
     */
    @GetMapping("/empresas")
    public List<Empresa> listEmpresas(){
        return empresaService.findAll();
    }

    /**
     * Metodo Buscar por clientes.
     * @return Devuelve todas las empresas que sean CLEINTES
     */
    @GetMapping("/clientes")
    public List<Empresa> listClientes(){
        return empresaService.findAllByTipoEmpresas("CLIENTE");
    }

    /**
     * Metodo Buscar por Proveedor
     * @return Devuelve todas las empresas que sean PROVEEDORES
     */
    @GetMapping("/proveedores")
    public List<Empresa> listProveedores(){
        return empresaService.findAllByTipoEmpresas("PROVEEDOR");
    }

    /**
     * Metodo Buscar por Oportunidades
     * @return Devuelve todas las empresas que sean OPORTUNIDADES
     */
    @GetMapping("/oportunidades")
    public List<Empresa> listOportunidades(){
        return empresaService.findAllByTipoEmpresas("OPORTUNIDAD");
    }

    /**
     * Metodo Mostrar, con esto mostramos todos los datos de un cliente en concreto.
     * @param id
     * @return Devuelve la Empresa encontrada por id.
     */
    @GetMapping("/empresa/{id}")
    public Empresa mostrar(@PathVariable Long id){
        return empresaService.findById(id);
    }

    /**
     * Metodo Crear - Metodo para crear una nueva Empresa de cualquiera de los tipos
     * @param empresa
     * @return Devuelve la empresa creada. Status 200 ok
     */
    @PostMapping("/empresa")
    @ResponseStatus(HttpStatus.CREATED)
    public Empresa crear(@RequestBody Empresa empresa){
        return empresaService.save(empresa);
    }

}
