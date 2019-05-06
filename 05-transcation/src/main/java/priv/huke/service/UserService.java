package priv.huke.service;

import priv.huke.pojo.User;

public interface UserService {

    void saveUser(User user);

    void updateUserXml(int outId, int inId, int age);

    void updateUserAnno(int outId, int inId, int age);
}
