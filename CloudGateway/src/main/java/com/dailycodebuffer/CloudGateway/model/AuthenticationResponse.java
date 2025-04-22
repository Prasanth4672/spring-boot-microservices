package com.dailycodebuffer.CloudGateway.model;

import java.util.Collection;

public class AuthenticationResponse {

    private String userId;
    private String accessToken;
    private String refreshToken;
    private long expiresAt;
    private Collection<String> authorityList;

    // Default constructor
    public AuthenticationResponse() {
    }

    // All-args constructor
    public AuthenticationResponse(String userId, String accessToken, String refreshToken, long expiresAt, Collection<String> authorityList) {
        this.userId = userId;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expiresAt = expiresAt;
        this.authorityList = authorityList;
    }

    // Getters
    public String getUserId() {
        return userId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public long getExpiresAt() {
        return expiresAt;
    }

    public Collection<String> getAuthorityList() {
        return authorityList;
    }

    // Setters
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public void setExpiresAt(long expiresAt) {
        this.expiresAt = expiresAt;
    }

    public void setAuthorityList(Collection<String> authorityList) {
        this.authorityList = authorityList;
    }

    // Static method to create a builder
    public static AuthenticationResponseBuilder builder() {
        return new AuthenticationResponseBuilder();
    }

    // Static builder class
    public static class AuthenticationResponseBuilder {
        private String userId;
        private String accessToken;
        private String refreshToken;
        private long expiresAt;
        private Collection<String> authorityList;

        public AuthenticationResponseBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AuthenticationResponseBuilder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public AuthenticationResponseBuilder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public AuthenticationResponseBuilder expiresAt(long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        public AuthenticationResponseBuilder authorityList(Collection<String> authorityList) {
            this.authorityList = authorityList;
            return this;
        }

        public AuthenticationResponse build() {
            return new AuthenticationResponse(userId, accessToken, refreshToken, expiresAt, authorityList);
        }
    }
}