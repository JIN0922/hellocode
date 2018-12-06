package org.fkit.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable
{

    private String loginname;
    private String password;
    private String username;
    private Date birthday;

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public User()
    {
    }

    public User(String loginname, Date birthday)
    {
        this.loginname = loginname;
        this.birthday = birthday;
    }

    public User(String loginname, String password, String username, Date birthday)
    {
        this.loginname = loginname;
        this.password = password;
        this.username = username;
        this.birthday = birthday;
    }


    //
    public String getLoginname()
    {
        return loginname;
    }

    public String getPassword()
    {
        return password;
    }

    public String getUsername()
    {
        return username;
    }

    public void setLoginname(String loginname)
    {
        this.loginname = loginname;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }
}
