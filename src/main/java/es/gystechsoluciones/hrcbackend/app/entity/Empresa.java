package es.gystechsoluciones.hrcbackend.app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "empresas")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_fiscal")
    private String nombreFiscal;

    @Column(name = "tipo_identificador")
    private String tipoIdentificador;

    private String identificador;

    @Column(name = "tipo_empresa")
    private String tipoEmpresa;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;
}
