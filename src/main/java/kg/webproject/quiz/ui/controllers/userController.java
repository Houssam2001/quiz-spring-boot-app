package kg.webproject.quiz.ui.controllers;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import kg.webproject.quiz.io.entities.UserEntity;
import kg.webproject.quiz.io.repositories.UserRepository;
import kg.webproject.quiz.service.serviceInterfaces.UserService;
import kg.webproject.quiz.shared.dto.UserDto;
import kg.webproject.quiz.ui.models.request.UserRequestModel;
import kg.webproject.quiz.ui.models.response.UserResponseModel;

@RestController
@RequestMapping("users")
public class userController {
    
    @Autowired
    UserService userService;
    UserRepository Userrepo;
    
    private ModelMapper modelMapper = new ModelMapper();

    @CrossOrigin
    @RequestMapping(value = "createUser", method = RequestMethod.POST)
    public UserResponseModel createUser(@RequestBody UserRequestModel user){
        UserDto userDto = modelMapper.map(user, UserDto.class);

        return modelMapper.map(userService.createUser(userDto),UserResponseModel.class);
    }

    @CrossOrigin
    @GetMapping
    @ApiOperation(value = "getAllUsers")
    public Set<UserResponseModel> getAllUsers(){
        Set<UserResponseModel> returnValue = new HashSet<>();
        for(UserDto userDto: userService.getAllUsers()){
            UserResponseModel userResponseModel= modelMapper.map(userDto, UserResponseModel.class);
            returnValue.add(userResponseModel);
        }

        return returnValue;
    }

    // @CrossOrigin
    // @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    // public Optional<UserEntity> getUserById(@PathVariable long id){
    //     return Userrepo.(id);
    // }




    @CrossOrigin
    @GetMapping(path = "/{id}")
    @ApiOperation(value = "getUserById")
    public UserResponseModel getQuestionById(@PathVariable long id){
        return modelMapper.map(userService.getUserById(id), UserResponseModel.class);
    }

    @CrossOrigin
    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "deleteUserById")
    public String deleteUsernById(@PathVariable long id){

        userService.deleteUser(id);
        return "User was successfully deleted";

    }
    @CrossOrigin
    @PutMapping(path = "/{id}")
    @ApiOperation(value = "updateScore")
    public UserResponseModel updateScore(@PathVariable long id, @RequestBody int score){


        return modelMapper.map(userService.updateScore(score, id), UserResponseModel.class);

    }
}
