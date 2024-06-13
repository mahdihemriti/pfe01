package tn.pfe.pfe01.services;

import tn.pfe.pfe01.dto.request.SignInRequest;
import tn.pfe.pfe01.dto.request.SignUpRequest;
import tn.pfe.pfe01.dto.response.JwtAuthenticationResponse;

public interface IAuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);
}
