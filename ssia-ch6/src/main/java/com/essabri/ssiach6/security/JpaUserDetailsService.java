package com.essabri.ssiach6.security;

import com.essabri.ssiach6.bo.User;
import com.essabri.ssiach6.dao.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author FZ.ESSABRI
 */
public class JpaUserDetailsService implements UserDetailsService {
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Supplier<UsernameNotFoundException> s = (Supplier<UsernameNotFoundException>) new UsernameNotFoundException("Problem during authentication!");
        User u = userRepository.findUserByUsername(username).orElseThrow(s);


        return new CustomUserDetails(u);
    }
}
