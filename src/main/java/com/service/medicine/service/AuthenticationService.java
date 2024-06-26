package com.service.medicine.service;

import com.nimbusds.jose.JOSEException;
import com.service.medicine.dto.request.AuthenticationRequest;
import com.service.medicine.dto.request.IntrospectRequest;
import com.service.medicine.dto.request.LogoutRequest;
import com.service.medicine.dto.response.AuthenticationResponse;
import com.service.medicine.dto.response.IntrospectResponse;
import com.service.medicine.model.InvalidatedToken;
import com.service.medicine.model.User;

import java.text.ParseException;

public interface AuthenticationService {
    AuthenticationResponse authenticate (AuthenticationRequest request);

    String generateToken (User user);

    IntrospectResponse introspect(IntrospectRequest request) throws ParseException, JOSEException;

    void logout (LogoutRequest request) throws ParseException, JOSEException;
}
