package com.example.demo;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.util.StringUtils;

import java.util.Date;

public class TeamBition {
    public static final Long   EXPIRES_IN = 1 * 3600 * 1000L;
    public static final String TOKEN_APPID = "_appId";

    public static void main(String[] args) {
        //正式环境1
        String a = genAppToken("5e1ede0abe825b35f14791c2","a0EJqXvqTrpXUflHRjBZQ7VXMRY3BqIT");
        //测试环境
        //String a = genAppToken("a28a8260-7df4-11ea-97b4-a58e928b1b7e","9d5c30f1-c73e-4809-af95-6a8dfb1f1c4f");
        System.out.println(a);
    }


    static String genAppToken(String appId, String appSecret) {
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
