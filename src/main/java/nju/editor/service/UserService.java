package nju.editor.service;

import nju.editor.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by wangzehao on 2017/2/23.
 */
@Service
public interface UserService {
    boolean checkPassword(User user);
}
