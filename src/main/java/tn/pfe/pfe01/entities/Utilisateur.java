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
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer idUtilisateur;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    @Enumerated(EnumType.STRING)
    private Role role;

    //employe
    private String sexe;
    private String dateNaissance;
    private Long numTelephone;
    private LocalDate dateEmbauche;
    private String intitulePoste;
    private Double joursCongesRestants;
    @ManyToOne
    private Departement departement;
    @OneToMany(mappedBy = "utilisateur")
    @JsonIgnore
    private List<DemandeConge> demandeConges;
    @OneToOne(cascade = CascadeType.ALL)
    private Adresse adresse;

    //condidat
    @ManyToMany(mappedBy = "utilisateurs",cascade = CascadeType.ALL)
    private List<OffreEmploi> offreEmplois;
    private String cv;
}
