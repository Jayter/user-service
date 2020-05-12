package com.eugenet.user.service.service;

import com.eugenet.user.service.api.UserEndpoint;
import com.eugenet.user.service.domain.User;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    @Value("${user-service.tenant}")
    private String tenant;

    private final UserEndpoint userEndpoint;

    public List<User> getAllUsers() {
        try {
            return userEndpoint.getAllUsers(tenant);
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }
}
