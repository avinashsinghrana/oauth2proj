//package com.auth.credential.oauthUtils;
//
//import java.io.UnsupportedEncodingException;
//import java.nio.charset.StandardCharsets;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.security.SecureRandom;
//import java.util.Base64;
//
//public class PCKEUtil {
//
//    String generateCodeVerifier() {
//        SecureRandom secureRandom = new SecureRandom();
//        byte[] codeVerifier = new byte[32];
//        secureRandom.nextBytes(codeVerifier);
//        return Base64.getUrlEncoder().withoutPadding().encodeToString(codeVerifier);
//    }
//
//    String generateCodeChallenge(String codeVerifier) throws NoSuchAlgorithmException {
//        SecureRandom secureRandom = new SecureRandom();
//        byte[] bytes = codeVerifier.getBytes(StandardCharsets.US_ASCII);
//        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
//        messageDigest.update(bytes, 0, bytes.length);
//        byte[] digest = messageDigest.digest();
//        secureRandom.nextBytes(bytes);
//        return Base64.getUrlEncoder().withoutPadding().encodeToString(digest);
//    }
//}
