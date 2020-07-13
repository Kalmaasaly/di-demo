package guru.springframework.didemo.examplebeans;

/**
 * Created by @author Kalmaasali on 25/04/2020.
 **/
public class FakeJmsBroker {


    private String userName;
    private String password;
    private String url;
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
