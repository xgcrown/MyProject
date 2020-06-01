package com.example.demo;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.util.StringUtils;

import java.util.Date;

public class TeamBition {
    public static final Long   EXPIRES_IN = 1 * 3600 * 1000L;
    public static final String TOKEN_APPID = "_appId";

    public static void main(String[] args) {
        String a = genAppToken("c60b1ef0-9f02-11ea-b8c4-5b32f7e3e500","88b82643-3b81-4a95-b280-67a1b9cb752d");
        System.out.println(a);
    }


    public static String genAppToken(String appId, String appSecret) {
        if (StringUtils.isEmpty(appId) || StringUtils.isEmpty(appSecret)) {
            return null;
        }

        Algorithm algorithm = Algorithm.HMAC256(appSecret);
        long timestamp = System.currentTimeMillis();
        Date issuedAt = new Date(timestamp);
        Date expiresAt = new Date(timestamp + EXPIRES_IN);

        return JWT.create()
                .withClaim(TOKEN_APPID, appId)
                .withIssuedAt(issuedAt)
                //.withExpiresAt(expiresAt)
                .sign(algorithm);
    }
}
