package com.MyMoviePlan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

import static com.MyMoviePlan.model.UserPermission.*;

@Getter
@AllArgsConstructor
public enum UserRole {

    ROLE_USER(Arrays.asList(READ)),
    ROLE_MANAGER(Arrays.asList(READ, WRITE)),
    ROLE_ADMIN(Arrays.asList(READ, WRITE, UPDATE)),
    ROLE_SUPER_ADMIN(Arrays.asList(READ, WRITE, UPDATE, DELETE));

  

	UserRole(List<UserPermission> asList) {
		this.permissions = null;
	
	}

	public List<UserPermission> getPermissions() {
		return permissions;
	}

	private final List<UserPermission> permissions;
}
