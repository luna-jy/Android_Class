package com.example.project01_clone.chat;

import java.io.Serializable;

public class ChatDTO implements Serializable {
    private  int profile_img;
    private  String tv_1, tv_2, tv_3;

    public ChatDTO(int profile_img, String tv_1, String tv_2, String tv_3) {
        this.profile_img = profile_img;
        this.tv_1 = tv_1;
        this.tv_2 = tv_2;
        this.tv_3 = tv_3;
    }

    public int getProfile_img() {
        return profile_img;
    }

    public void setProfile_img(int profile_img) {
        this.profile_img = profile_img;
    }

    public String getTv_1() {
        return tv_1;
    }

    public void setTv_1(String tv_1) {
        this.tv_1 = tv_1;
    }

    public String getTv_2() {
        return tv_2;
    }

    public void setTv_2(String tv_2) {
        this.tv_2 = tv_2;
    }

    public String getTv_3() {
        return tv_3;
    }

    public void setTv_3(String tv_3) {
        this.tv_3 = tv_3;
    }
}
