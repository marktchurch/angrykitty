package angrykitty.anonymous;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggedInController {

  @RequestMapping("/loggedin")
  public ResponseEntity<Boolean> isLoggedIn() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    return new ResponseEntity<Boolean>(authentication != null &&
                   !(authentication instanceof AnonymousAuthenticationToken) &&
                   authentication.isAuthenticated(),
            HttpStatus.OK
    );
  }
}