package pl.rzonsol.config;

import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

/**
 * Created by rzonsol on 16.01.2017.
 */
@Component
public class AuthFailureHandler extends SimpleUrlAuthenticationFailureHandler {
}
