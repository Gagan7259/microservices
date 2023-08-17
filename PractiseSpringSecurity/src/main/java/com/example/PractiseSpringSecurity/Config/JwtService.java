package com.example.PractiseSpringSecurity.Config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class JwtService {
    private static final String SECREATE_KEY = "2G!-tW4dD/V!1eqHP7DH7-5trE0fUxlaNXOLCylLAtLkEYTpyPPAVhyADT?6xfqtU4a/Dy=gHcxd3OUNMj3qvTB1PfIEQe07lY!GTw7DkjxOGFRFt-2fnmgy=NAU9xcoVjwv/z4ND30cJRuyUNIkf0?ymCcn75reTaVSqiPxyS91K8sTbl?=5OXR4UsTNvTEzh5w?lQR5z6pub0zN9zO9kP5v26FrBF0UE5VOVucdTANdiv4N6leBWeNt2Hbz6IN\n";

    public String extractUsername(String token) {
        return extractclaim(token, Claims::getSubject);
    }

    private String generatetoken(UserDetails userDetails) {
        return generatetoken(new HashMap<>(), userDetails);
    }

    private String generatetoken(Map<String, Object> extractclaims, UserDetails userDetails) {
        return Jwts.builder().signWith(getsignInkey(), SignatureAlgorithm.ES256).setClaims(extractclaims).setSubject(userDetails.getUsername()).setIssuedAt(new Date(System.currentTimeMillis())).setExpiration(new Date(System.currentTimeMillis() * 1000 * 60 * 24)).compact();
    }

    private Claims extractClaims(String token) {
        return Jwts.parserBuilder().setSigningKey(getsignInkey()).build().parseClaimsJws(token).getBody();
    }

    private <T> T extractclaim(String token, Function<Claims, T> resolver) {
        Claims claims = extractClaims(token);
        return resolver.apply(claims);
    }


    private Key getsignInkey() {
        byte[] keysbyte = Decoders.BASE64.decode(SECREATE_KEY);
        return Keys.hmacShaKeyFor(keysbyte);
    }
}
