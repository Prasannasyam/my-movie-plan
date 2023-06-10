package com.MyMoviePlan.entity;

import com.MyMoviePlan.model.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "users")
public class UserEntity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @Column(length = 50)
    private String name;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Column(nullable = false, length = 10, unique = true)
    private String mobile;

    @Column(length = 60)
    private String gender;
    @Column
    private String password;
    @Column
    private Boolean terms;

    @Column(name = "is_account_non_expired")
    private Boolean isAccountNonExpired;

    @Column(name = "is_account_non_locked")
    private Boolean isAccountNonLocked;

    @Column(name = "is_credentials_non_expired")
    private Boolean isCredentialsNonExpired;

    @Column(name = "is_enabled")
    private Boolean isEnabled;

    @Column(name = "user_role", length = 20)
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    public UserEntity(String name, String email, String mobile, String gender, String password, Boolean terms,
                      Boolean isAccountNonExpired, Boolean isAccountNonLocked,
                      Boolean isCredentialsNonExpired, Boolean isEnabled, UserRole userRole) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.gender = gender;
        this.password = password;
        this.terms = terms;
        this.setIsAccountNonExpired(isAccountNonExpired);
        this.setIsAccountNonLocked(isAccountNonLocked);
        this.setIsCredentialsNonExpired(isCredentialsNonExpired);
        this.setIsEnabled(isEnabled);
        this.userRole = userRole;
    }

    public UserEntity setId(String id) {
        this.id = id;
        return this;
    }

    public UserEntity setName(String name) {
        this.name = name;
        return this;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserEntity setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public UserEntity setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserEntity setActive(Boolean active) {
        terms = active;
        return this;
    }

    public UserEntity setAccountNonExpired(Boolean accountNonExpired) {
        setIsAccountNonExpired(accountNonExpired);
        return this;
    }

    public UserEntity setAccountNonLocked(Boolean accountNonLocked) {
        setIsAccountNonLocked(accountNonLocked);
        return this;
    }

    public UserEntity setCredentialsNonExpired(Boolean credentialsNonExpired) {
        setIsCredentialsNonExpired(credentialsNonExpired);
        return this;
    }

    public UserEntity setEnabled(Boolean enabled) {
        setIsEnabled(enabled);
        return this;
    }

    public UserEntity setUserRole(UserRole userRole) {
        this.userRole = userRole;
        return this;
    }

    public UserEntity setTerms(Boolean terms) {
        this.terms = terms;
        return this;
    }

	public String getId() {
		return id;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public String getPassword() {
		return password;
	}

	public Boolean getTerms() {
		return terms;
	}

	public Boolean getIsAccountNonExpired() {
		return isAccountNonExpired;
	}

	public void setIsAccountNonExpired(Boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
	}

	public Boolean getIsAccountNonLocked() {
		return isAccountNonLocked;
	}

	public void setIsAccountNonLocked(Boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}

	public Boolean getIsCredentialsNonExpired() {
		return isCredentialsNonExpired;
	}

	public void setIsCredentialsNonExpired(Boolean isCredentialsNonExpired) {
		this.isCredentialsNonExpired = isCredentialsNonExpired;
	}

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public String getMobile() {
		return mobile;
	}


}
