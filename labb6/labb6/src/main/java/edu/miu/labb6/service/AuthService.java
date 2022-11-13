package edu.miu.labb6.service;


import edu.miu.labb6.domain.dto.request.LoginRequest;
import edu.miu.labb6.domain.dto.request.RefreshTokenRequest;
import edu.miu.labb6.domain.dto.response.LoginResponse;

public interface AuthService  {

    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}

