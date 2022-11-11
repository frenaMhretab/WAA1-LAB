package edu.miu.cs545.lab5.lab5.service;

import edu.miu.cs545.lab5.lab5.domain.dto.request.LoginRequest;
import edu.miu.cs545.lab5.lab5.domain.dto.request.RefreshTokenRequest;
import edu.miu.cs545.lab5.lab5.domain.dto.response.LoginResponse;

public interface AuthService  {

    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}

