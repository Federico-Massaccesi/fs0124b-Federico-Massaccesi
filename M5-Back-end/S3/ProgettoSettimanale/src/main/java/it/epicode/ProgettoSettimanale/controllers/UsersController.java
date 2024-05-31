package it.epicode.ProgettoSettimanale.controllers;

import it.epicode.ProgettoSettimanale.entities.UserEntity;
import it.epicode.ProgettoSettimanale.mappers.ValidatorToUserEntity;
import it.epicode.ProgettoSettimanale.services.UserService;
import it.epicode.ProgettoSettimanale.validationClasses.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    UserService svc;

    @Autowired
    ValidatorToUserEntity mapper;

//    @PostMapping
//    public ResponseEntity<UserEntity> saveUser


    @GetMapping
    public ResponseEntity<List<UserEntity>> getUsers(){

        var users = svc.getAllUsers();

        return new ResponseEntity<>(users, HttpStatus.FOUND);
    }

    @GetMapping(value = "/id")
    public ResponseEntity<UserEntity> getUserById(Long id){
        var foundedUser = svc.getUserById(id);
        return new ResponseEntity<>(foundedUser, HttpStatus.FOUND);
    }


    @PutMapping(value ="/id")
    public ResponseEntity<UserEntity> updateUser(@RequestBody @Validated UserValidation uV, BindingResult validator,Long id){
        if(validator.hasErrors()){
            throw new RuntimeException("User validation failed");
        }else{

            var newUser = svc.updateUser(mapper.toUserEntity(uV),id);

            return new ResponseEntity<>(newUser,HttpStatus.ACCEPTED);

        }

    }

}
