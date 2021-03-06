package club.zenyuca.eee.beans;

import club.zenyuca.core.template.BaseBean;
import java.io.Serializable;
import java.util.Date;

public class User extends BaseBean implements Serializable {
    private static final long serialVersionUID = 1L;
    /** 主键 */
    private Integer id;
    /** 用户名称 */
    private String name;
    /** 密码 */
    private String pwd;
    /** 最近一次登陆时间 */
    private Date loginTime;
    /** 最近一次登出时间 */
    private Date logoutTime;
    /** 注册时的IP */
    private String registerIP;
    /** 最后一次登录的IP */
    private String loginIP;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getRegisterIP() {
        return registerIP;
    }

    public void setRegisterIP(String registerIP) {
        this.registerIP = registerIP;
    }

    public String getLoginIP() {
        return loginIP;
    }

    public void setLoginIP(String loginIP) {
        this.loginIP = loginIP;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", loginTime=" + loginTime +
                ", logoutTime=" + logoutTime +
                ", registerIP='" + registerIP + '\'' +
                ", loginIP='" + loginIP + '\'' +
                '}';
    }
}