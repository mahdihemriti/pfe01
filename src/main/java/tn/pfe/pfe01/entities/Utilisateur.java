package tn.pfe.pfe01.entities;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer idUtilisateur;
    private String nom;
    private String prenom;
    private String nomUtilisateur;
    private String motDePasse;
    @Enumerated(EnumType.STRING)
    private Role role;
}
