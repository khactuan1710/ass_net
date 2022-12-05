package com.example.tuannkph15655.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountResult {
    @SerializedName("isSuccess")
    @Expose
    private Boolean isSuccess;


    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

}
