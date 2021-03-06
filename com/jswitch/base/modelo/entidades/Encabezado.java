package com.jswitch.base.modelo.entidades;

import com.jswitch.base.modelo.entidades.auditoria.Auditable;
import com.jswitch.base.modelo.entidades.auditoria.AuditoriaBasica;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.swing.Icon;
import com.jswitch.base.modelo.util.bean.BeanVO;
import com.jswitch.base.modelo.util.ehts.BusinessKey;
import com.jswitch.base.modelo.util.ehts.Method;
import javax.persistence.Embedded;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * @author bc
 */
@Entity
@Table(name = "SYST_Encabezado")
public class Encabezado extends BeanVO implements Auditable {
    //TODO incluir a la persona que es de tipo productor para obtener sus datos

    /**
     * PK autoincremtado
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @BusinessKey(include = Method.TO_STRING)
    private Long id;
    /**
     */
    @Column
    @Size(min = 4, max = 120)
    @BusinessKey
    private String nombre;
    /**
     * Ciudad donde se encuentra la sucursal
     */
    @Column
    @Size(min = 4, max = 120)
    @BusinessKey
    private String cuidad;
    /**
     */
    @Column
    @BusinessKey
    private String observacion;
    /**
     */
    @Column
    @BusinessKey
    private String imagen;
    /**
     *
     */
    @Column
    @BusinessKey
    private String rif2;
    /**
     *
     */
    private transient Icon button;
    /**
     */
    @Version
    @Column
    private Integer optLock;
    /**
     * Datos de auditado de modificaciones en la tabla
     */
    @Embedded
    @BusinessKey
    private AuditoriaBasica auditoria;

    public Encabezado() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getOptLock() {
        return optLock;
    }

    public void setOptLock(Integer optLock) {
        this.optLock = optLock;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Icon getButton() {
        return button;
    }

    public void setButton(Icon button) {
        this.button = button;
    }

    public String getRif2() {
        return rif2;
    }

    public void setRif2(String rif2) {
        this.rif2 = rif2;
    }

    /**
     * Datos de auditado de modificaciones en la tabla
     *
     * @return the auditoria
     */
    public AuditoriaBasica getAuditoria() {
        return auditoria;
    }

    /**
     * Datos de auditado de modificaciones en la tabla
     *
     * @param auditoria the auditoria to set
     */
    public void setAuditoria(AuditoriaBasica auditoria) {
        this.auditoria = auditoria;
    }

    /**
     * Ciudad donde se encuentra la sucursal
     * @return the cuidad
     */
    public String getCuidad() {
        return cuidad;
    }

    /**
     * Ciudad donde se encuentra la sucursal
     * @param cuidad the cuidad to set
     */
    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }
        
}
