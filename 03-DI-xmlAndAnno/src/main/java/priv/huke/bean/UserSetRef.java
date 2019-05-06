package priv.huke.bean;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class UserSetRef {
    private int id;
    private UserSetDI user;
    private List<String> list;
    private Set<UserSetDI> set;
    private Map<String,Object> map;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserSetDI getUser() {
        return user;
    }

    public void setUser(UserSetDI user) {
        this.user = user;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<UserSetDI> getSet() {
        return set;
    }

    public void setSet(Set<UserSetDI> set) {
        this.set = set;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "UserSetRef{" +
                "id=" + id +
                ", user=" + user +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
