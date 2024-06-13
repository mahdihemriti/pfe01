package tn.pfe.pfe01.services;

import org.springframework.security.core.userdetails.UserDetails;

public interface IJwtService {
    String extractUsername(String token);

    String generateToken(UserDetails userDetails);

    boolean isTokenValid(String token, UserDetails userDetails);
    public long getExpirationTime();

}
