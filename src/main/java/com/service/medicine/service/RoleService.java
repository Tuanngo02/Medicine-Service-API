package com.service.medicine.service;

import com.service.medicine.dto.request.RoleRequest;
import com.service.medicine.dto.response.RoleResponse;

import java.util.List;

public interface RoleService {
    RoleResponse createRole (RoleRequest request);

    List<RoleResponse> getAllRole ();

    void deleteRole (String name);
}
