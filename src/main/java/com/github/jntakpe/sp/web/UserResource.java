package com.github.jntakpe.sp.web;

import com.github.jntakpe.sp.security.Authorities;
import com.github.jntakpe.sp.web.dto.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Resource permettant de gérer l'authentification
 *
 * @author jntakpe
 */
@RestController
@RequestMapping("/user")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public User getAuth() {
        User user = new User();
        Authentication ctxAuth = SecurityContextHolder.getContext().getAuthentication();
        user.setLogin(ctxAuth.getName());
        user.setAdmin(ctxAuth.getAuthorities().stream().
                map(GrantedAuthority::getAuthority).
                anyMatch(auth -> auth.equals(Authorities.ROLE_ADMIN.name())));
        return user;
    }

}
