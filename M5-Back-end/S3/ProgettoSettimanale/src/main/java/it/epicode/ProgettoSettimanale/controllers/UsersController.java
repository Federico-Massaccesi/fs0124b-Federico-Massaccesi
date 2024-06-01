package it.epicode.ProgettoSettimanale.controllers;

import it.epicode.ProgettoSettimanale.entities.UserEntity;
import it.epicode.ProgettoSettimanale.logRegService.UserLogReg;
import it.epicode.ProgettoSettimanale.mappers.ValidatorToUserEntity;
import it.epicode.ProgettoSettimanale.services.UserService;
import it.epicode.ProgettoSettimanale.validationClasses.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    UserService svc;

    @Autowired
    ValidatorToUserEntity mapper;

    @Autowired
    UserLogReg logReg;
    @PostMapping(value = "/register")
    public ResponseEntity<?> register(@RequestBody @Validated UserValidation userValid,
                                      BindingResult validation,
                                      UriComponentsBuilder uri){
        if(validation.hasErrors()) {
            throw new RuntimeException("no");
        }
        var newUser = logReg.register(UserEntity.builder()
                        .withEmail(userValid.email())
                        .withUsername(userValid.username())
                        .withPassword(userValid.password())
                        .withRoles(userValid.roles())
                .build());

        var headers = new HttpHeaders();

        headers.add("Location",uri.path("/api/users/{id}").buildAndExpand(newUser.getId()).toString());

        return new ResponseEntity<>(newUser,headers, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Validated UserValidation model, //
                                   BindingResult validation) {
        if (validation.hasErrors()) {
            throw new RuntimeException("no");
        }

        return new ResponseEntity<>(logReg.login(model.username(), model.password()).orElseThrow(),
                HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<UserEntity>> getUsers(){

        var users = svc.getAllUsers();

        return new ResponseEntity<>(users, HttpStatus.FOUND);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable Long id){
        var foundedUser = svc.getUserById(id);
        return new ResponseEntity<>(foundedUser, HttpStatus.FOUND);
    }


    @PutMapping(value ="/{id}")
    public ResponseEntity<UserEntity> updateUser(@RequestBody @Validated UserValidation validatedUser, BindingResult validator,@PathVariable Long id){
        if(validator.hasErrors()){
            throw new RuntimeException("User validation failed");
        }else{

            var newUser = svc.updateUser(mapper.toUserEntity(validatedUser),id);

            return new ResponseEntity<>(newUser,HttpStatus.ACCEPTED);


        }

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<UserEntity> deleteUser(@PathVariable Long id){

        var user=svc.delete(id);

        return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
    }

}
