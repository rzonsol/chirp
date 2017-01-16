package pl.rzonsol.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.rzonsol.entity.User;
import pl.rzonsol.repository.UserRepository;


/**
 * Created by rzonsol on 16.01.2017.
 */
@Service
public class UserSecurityService implements UserDetailsService {
    private static final Logger LOG = LoggerFactory.getLogger(UserSecurityService.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);
        if (null==user){
            LOG.warn("Username not found");
            throw new UsernameNotFoundException("Username "+username+ "not found!" );
        }
        return user;
    }


}
