package sit.jwtwebtokens.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sit.jwtwebtokens.entitys.UserDetail;
import sit.jwtwebtokens.repository.UserRepository;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;
    //    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username);
//        if (user != null) {
//            return new org.springframework.security.core.userdetails.User(
//                    user.getUsername(),
//                    user.getPassword(),
//                    new ArrayList<>()); // You can populate authorities/roles here
//        } else {
//            throw new UsernameNotFoundException("User not found with username: " + username);
//        }
//    }
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        if ("banlearit".equals(username)) {
//            return new User("banlearit", "$2y$10$iCd46DFA0Y1iyXSv4uNbOuDxeHenvkT6WzMfjE8XvWqxkXjN1mq4W",
//                    new ArrayList<>());
//        } else {
//            throw new UsernameNotFoundException("User not found with username: " + username);
//        }
//    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetail user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(), user.getPassword(), new ArrayList<>());
    }
}
