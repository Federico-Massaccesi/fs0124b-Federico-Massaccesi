package it.epicode.ProgettoSettimanale.services;

import it.epicode.ProgettoSettimanale.entities.UserEntity;
import it.epicode.ProgettoSettimanale.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity saveUser(UserEntity user) {
        return userRepository.save(user);
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity getUserById(Long id) {
        if(userRepository.findById(id).isPresent()) {
            return userRepository.findById(id).get();
        }else{
            throw new RuntimeException();//SOSTITUIRE CON ECCEZIONE
        }
    }

    public UserEntity updateUser(UserEntity user,Long id) {

        var foundedUser = userRepository.findById(id);

        if(foundedUser.isPresent()) {

            var definedUser = foundedUser.get();

            return userRepository.save(definedUser.builder()
                    .withUsername(user.getUsername())
                    .withEmail(user.getEmail())
                    .withPassword(user.getPassword())
                    .build());
        }else{
            throw new RuntimeException("errore sdfogh"); //ECCEZIONE
        }
    }

    public UserEntity delete(Long id){
        var foundedUser = userRepository.findById(id);

        if(foundedUser.isPresent()) {
            userRepository.delete(foundedUser.get());
            return foundedUser.get();
        }else{
            throw new RuntimeException("fefe");//ECCEZIONE

        }
    }
}
