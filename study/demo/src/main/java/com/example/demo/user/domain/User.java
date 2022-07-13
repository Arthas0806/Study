package com.example.demo.user.domain;

public class User {

    private int userId;
    private String userName;
    private int userAge;
    private String userGender;
    private int userSalary;
    private char deleteStatus = 'N';
    
    // boolean 방식
//    private boolean deleteStatus;

//    public boolean isDeleteStatus() {
//        return deleteStatus;
//    }
//
//    public void setDeleteStatus(boolean deleteStatus) {
//        this.deleteStatus = deleteStatus;
//    }

    public char getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(char deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getUserAge() {
        return userAge;
    }
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
    public String getUserGender() {
        return userGender;
    }
    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }
    public int getUserSalary() {
        return userSalary;
    }
    public void setUserSalary(int userSalary) {
        this.userSalary = userSalary;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userGender='" + userGender + '\'' +
                ", userSalary=" + userSalary +
                ", deleteStatus=" + deleteStatus +
                '}';
    }
}
