package priv.huke.po;

public class UserContructorDI {

    int id;
    String name;

    public UserContructorDI(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserContructorDI{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
