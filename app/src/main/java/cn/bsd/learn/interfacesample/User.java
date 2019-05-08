package cn.bsd.learn.interfacesample;

/**
 * Created by bishiduo on 2019/4/21.
 */

public class User {
    private String username;
    private String pwd;

    public User(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
