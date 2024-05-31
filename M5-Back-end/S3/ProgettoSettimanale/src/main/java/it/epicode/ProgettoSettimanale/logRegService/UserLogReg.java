package it.epicode.ProgettoSettimanale.logRegService;

import it.epicode.ProgettoSettimanale.entities.UserEntity;
import it.epicode.ProgettoSettimanale.repositories.RoleRepository;
import it.epicode.ProgettoSettimanale.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserLogReg {

    @Autowired
    PasswordEncoder encoder;
    @Autowired
    UserRepository userRepo;

    @Autowired
    RoleRepository roleRepo;

    @Autowired
    AuthenticationManager authenticationManager;

//    @Autowired
//    JwtU

    public UserEntity register(UserEntity user) {
        try {
            var p = encoder.encode(user.getPassword());
            user.setPassword(p);
            return userRepo.save(user);
        } catch (Exception e) {
            throw new RuntimeException("popopopo");
        }
    }

}
