package bijiawang.service.commands;

import bijiawang.service.Command;
import bijiawang.service.commands.util.ResultMessage;
import service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by disinuo on 17/4/13.
 */
public class LoginCommand extends Command {
    @Autowired
    UserService userService;

    private String username;
    private String password;
    @Override
    protected ResultMessage doCommand(){
        userService.login(username,password);
        return null;
    }

    public LoginCommand(String username, String password){
        this.username=username;
        this.password=password;
        args.put("username",username);
        args.put("password",password);
    }
    @Override
    protected void initCommandId() {
        commandId="service.commands.LoginCommand";
    }
}
