package hn.lenguajes.banco.Modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="direcciones")
public class Direcciones {
    
    @Id
    @Column(name="iddireccion")
    private int idDireccion;
    
    private String departamento;

    private String ciudad;


    @OneToOne(mappedBy = "direccion")
    private Cliente cliente;
}
