package com.accommodationbooking.security.service.impl;

import com.accommodationbooking.security.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.stream.Collectors;

import static com.accommodationbooking.constants.DateTimeConstants.DEFAULT_ZONE_ID;
import static com.accommodationbooking.constants.SecurityConstants.ROLES_CLAIM;

@Service
@RequiredArgsConstructor
public class JwtServiceImpl implements JwtService {
    private final JwtEncoder jwtEncoder;
    @Value("${jwt.expiration-time}")
    private int expirationTime;

    @Override
    public String generateToken(final Authentication authentication) {
        final String scope = authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(" "));
        final Instant now = Instant.now(Clock.system(DEFAULT_ZONE_ID));
        final JwtClaimsSet claims = JwtClaimsSet.builder()
                .issuer("self")
                .issuedAt(now)
                .expiresAt(now.plus(expirationTime, ChronoUnit.HOURS))
                .subject(authentication.getName())
                .claim(ROLES_CLAIM, scope)
                .build();
        return jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
    }
}
