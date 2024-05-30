package tn.pfe.pfe01.entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DemandeConge implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer idDemandeConge;
    private String type;
    private String description;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String statut;
    @ManyToOne
    private Utilisateur utilisateur;
}
