package hn.lenguajes.banco.Modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="clientes")
@Data
public class Cliente {
    
    @Id
    @Column(name="dni")
    private String dni;
    
    private String nombre;
    
    private String apellido;
    
    private String correo;
    
    private String telefono;
    
    @Column(name="fechaingreso")
    private Date fechaIngreso;


    @OneToOne
    @JoinColumn(name="iddireccion")
    private Direcciones direccion;
    

}
