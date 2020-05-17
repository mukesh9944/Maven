package mapper;

import mapstruct.User;
import mapstruct.UserCommand;
import org.mapstruct.Mapper;

@Mapper
public interface UserCommandMapper {

    User userCommandToUser(UserCommand userCommand);
    UserCommand userToUserCommand(User user);
}
