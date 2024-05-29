package tn.pfe.pfe01.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Candidat extends Utilisateur implements Serializable {
    private String cv;
    @ManyToMany(mappedBy = "candidats",cascade = CascadeType.ALL)
    private List<OffreEmploi> offreEmplois;

}
