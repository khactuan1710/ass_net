package com.example.tuannkph15655.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegisterResult {
    @SerializedName("status")
    @Expose
    int status;
    @SerializedName("message")
    @Expose
    String message;
    @SerializedName("data")
    @Expose
    RegisterModel data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RegisterModel getData() {
        return data;
    }

    public void setData(RegisterModel data) {
        this.data = data;
    }

    public  class RegisterModel {
        @SerializedName("id")
        @Expose
        int id;
        @SerializedName("username")
        @Expose
        String username;
        @SerializedName("keyApi")
        @Expose
        String keyApi;
        @SerializedName("updatedAt")
        @Expose
        String updatedAt;
        @SerializedName("createdAt")
        @Expose
        String createdAt;
        @SerializedName("refreshToken")
        @Expose
        String refreshToken;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getKeyApi() {
            return keyApi;
        }

        public void setKeyApi(String keyApi) {
            this.keyApi = keyApi;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getRefreshToken() {
            return refreshToken;
        }

        public void setRefreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
        }
    }
}
