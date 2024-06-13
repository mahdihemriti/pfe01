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
@NoArgsConstructor
@AllArgsConstructor
public class OffreEmploi implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer idOffreEmploi;
    private String titre;
    private String description;
    private String exigences;
    private LocalDate datePublication;
    private LocalDate dateExpiration;
    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Utilisateur> utilisateurs;

}
