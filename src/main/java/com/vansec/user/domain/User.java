package com.vansec.user.domain;

import com.vansec.authority.domain.Role;
import com.vansec.comm.domain.EntityImpl;

import java.util.List;

/**
 * 用户实体.
 * @author zhousd
 */
public class User extends EntityImpl {

    private String loginName = ""; // 登录名

    private String password = ""; // 密码

    private String phone = ""; // 手机号码

    private String email; //邮箱

    private String photo; // 头像图片地址

    private String wechatId; // 微信ID

    private String wechatName; // 微信用户名

    private String weiboId; // 微博id

    private String weiboName; // 微博用户名

    private int rewardMoney; // 奖励金额

    private int rewardPoint; // 奖励积分

    private List<Role> roleList; // 当前岗位使用角色集合

    public User() {
        super();
    }

    public User(String loginName, String password) {
        this();
        this.loginName = loginName;
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName;
    }

    public String getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(String weiboId) {
        this.weiboId = weiboId;
    }

    public String getWeiboName() {
        return weiboName;
    }

    public void setWeiboName(String weiboName) {
        this.weiboName = weiboName;
    }

    public int getRewardMoney() {
        return rewardMoney;
    }

    public void setRewardMoney(int rewardMoney) {
        this.rewardMoney = rewardMoney;
    }

    public int getRewardPoint() {
        return rewardPoint;
    }

    public void setRewardPoint(int rewardPoint) {
        this.rewardPoint = rewardPoint;
    }
}