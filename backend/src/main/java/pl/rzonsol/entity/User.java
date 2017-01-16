package pl.rzonsol.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import pl.rzonsol.entity.security.Authority;
import pl.rzonsol.entity.security.UserRole;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by rzonsol on 13.01.2017.
 */
@Document
public class User implements UserDetails {

    @Id
    private String id;
    private String username;
    private String password;
    private String email;
    private Set<UserRole> userRoles =new HashSet<>();

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = new HashSet<>();
        userRoles.forEach(ur-> authorities.add(new Authority(ur.getRole().getName())));
        return authorities;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }
}
