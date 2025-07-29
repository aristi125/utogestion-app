package co.org.michael.autogestion.infraestructure.adapter.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "consumos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsumoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;

    @OneToOne
    @JoinColumn(name = "plan_id")
    private PlanEntity planId;

    private Integer datosGb;
    private Integer minutos;
    private Integer sms;
    private LocalDateTime ultimaActualizacion;
}

