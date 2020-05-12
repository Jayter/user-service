package com.eugenet.user.service.domain;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String department;

    private BigDecimal averagePoint;
}
