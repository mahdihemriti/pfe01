package tn.pfe.pfe01.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignUpRequest {
    private String nom;
    private String prenom;
    private String sexe;
    private String dateNaissance;
    private Long numTelephone;
    private String email;
    private String password;
}
