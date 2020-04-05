package com.SpringBootJWT.jwtexample.dto;

import com.SpringBootJWT.jwtexample.model.Roles;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class UserDataDto {


    @ApiModelProperty(position = 0)
    private String username;

    @ApiModelProperty(position = 1)
    private String email;

    @ApiModelProperty(position = 2)
    private String password;

    @ApiModelProperty(position = 3)
    List<Roles> roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Roles> getRoless() {
        return roles;
    }

    public void setRoless(List<Roles> Roless) {
        this.roles = roles;
    }

}
