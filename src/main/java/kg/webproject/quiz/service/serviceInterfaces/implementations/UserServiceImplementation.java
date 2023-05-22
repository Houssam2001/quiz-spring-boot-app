package kg.webproject.quiz.service.serviceInterfaces.implementations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kg.webproject.quiz.io.entities.UserEntity;
import kg.webproject.quiz.io.repositories.UserRepository;
import kg.webproject.quiz.service.serviceInterfaces.UserService;
import kg.webproject.quiz.shared.dto.UserDto;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository _UserRepository;

    public UserServiceImplementation(UserRepository _UserRepository) {
        this._UserRepository = _UserRepository;
    }

    private ModelMapper modelMapper = new ModelMapper();

    @Override
    public UserDto createUser(UserDto user) {
        if (_UserRepository.findByUsername(user.getUsername()) != null)
            throw new RuntimeException("username already exists in Database");

        UserEntity userEntity = modelMapper.map(user, UserEntity.class);
        UserDto returnValue = modelMapper.map(_UserRepository.save(userEntity), UserDto.class);

        return returnValue;
    }

    @Override
    public Set<UserDto> getAllUsers() {
        Set<UserDto> returnSet = new HashSet<>();
        for(UserEntity user: _UserRepository.findAll()){
            UserDto userDto = modelMapper.map(user, UserDto.class);
            returnSet.add(userDto);
        }
        return returnSet;
    }

    @Override
    public String updateScore(int score, long id) {
        Optional<UserEntity> user = _UserRepository.findById(id);
        UserDto userDto = modelMapper.map(user, UserDto.class);
        userDto.setScores(score);
        UserEntity returnUser = _UserRepository.save(modelMapper.map(userDto, UserEntity.class));
        return "score of"+returnUser+" updated successfully";    
    }

    @Override
    public UserDto getUserById(long id) {
        return modelMapper.map(_UserRepository.findById(id), UserDto.class);
    }

    @Override
    public String deleteUser(long id){
        _UserRepository.deleteById(id);
        return "Operation successful";
    }

  
}
