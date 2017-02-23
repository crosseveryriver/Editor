package nju.editor.service.impl;

import nju.editor.model.User;
import nju.editor.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by wangzehao on 2017/2/23.
 */
@Service
public class UserServiceImpl implements UserService{
    @Override
    public boolean checkPassword(User user) {
        return false;
    }
}
