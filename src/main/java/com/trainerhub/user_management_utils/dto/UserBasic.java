package com.trainerhub.user_management_utils.dto;

import lombok.Data;

@Data
public class UserBasic {
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String role;
}
