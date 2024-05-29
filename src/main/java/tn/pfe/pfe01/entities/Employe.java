package tn.pfe.pfe01.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employe extends Utilisateur implements Serializable  {
    private String sexe;
    private String dateNaissance;
    private Long numTelephone;
    private LocalDate dateEmbauche;
    private String intitulePoste;
    private Double joursCongesRestants;
    @ManyToOne
    private Departement departement;
    @OneToMany(mappedBy = "employe")
    @JsonIgnore
    private List<DemandeConge> demandeConges;
    @OneToOne(cascade = CascadeType.ALL)
    private Adresse adresse;
}
