package kg.webproject.quiz.service.serviceInterfaces;


import java.util.Set;

import kg.webproject.quiz.shared.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
    Set<UserDto> getAllUsers();
    String updateScore(int score,long id );
    UserDto getUserById(long id);
    String deleteUser(long id);
}
