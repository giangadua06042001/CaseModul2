package dangKys;

import java.io.Serializable;

public class Manager implements Serializable {
    private String name;
    private String password;
    private String position=location;
    public  static final String location="manager";

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String password() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String position() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Manager() {
    }

    public Manager(String name, String password, String position) {
        this.name = name;
        this.password = password;
        this.position=position;
    }
}
