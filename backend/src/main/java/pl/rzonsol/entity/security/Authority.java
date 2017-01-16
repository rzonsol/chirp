package pl.rzonsol.entity.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by rzonsol on 16.01.2017.
 */
public class Authority implements GrantedAuthority {

    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority(){
        return authority;
    }
}
