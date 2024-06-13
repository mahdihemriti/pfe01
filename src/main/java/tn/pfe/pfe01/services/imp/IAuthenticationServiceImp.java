package tn.pfe.pfe01.services.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tn.pfe.pfe01.dto.request.SignInRequest;
import tn.pfe.pfe01.dto.request.SignUpRequest;
import tn.pfe.pfe01.dto.response.JwtAuthenticationResponse;
import tn.pfe.pfe01.entities.Role;
import tn.pfe.pfe01.entities.Utilisateur;
import tn.pfe.pfe01.repositories.UtilisateurRepository;
import tn.pfe.pfe01.services.IAuthenticationService;
import tn.pfe.pfe01.services.IJwtService;

@Service
@RequiredArgsConstructor
public class IAuthenticationServiceImp implements IAuthenticationService {
    private final UtilisateurRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final IJwtService jwtService;
    @Override
    public JwtAuthenticationResponse signup(SignUpRequest request) {
        var user = Utilisateur.builder()
                .nom(request.getNom())
                .prenom(request.getPrenom())
                .sexe(request.getSexe())
                .dateNaissance(request.getDateNaissance())
                .numTelephone(request.getNumTelephone())
                .email(request.getEmail())
                .motDePasse(passwordEncoder.encode(request.getPassword()))
                .role(Role.CANDIDAT).build();
        userRepository.save(user);
        var jwt = jwtService.generateToken(user);
        return JwtAuthenticationResponse.builder().token(jwt).expiresIn(jwtService.getExpirationTime()).build();
    }

    @Override
    public JwtAuthenticationResponse signin(SignInRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        var user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new IllegalArgumentException("Invalid email or password"));
        var jwt = jwtService.generateToken(user);
        return JwtAuthenticationResponse.builder().token(jwt).expiresIn(jwtService.getExpirationTime()).build();
    }
}
