package com.example.tuannkph15655.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BookResult {
    @SerializedName("status")
    int status;
    @SerializedName("message")
    String message;
    @SerializedName("currentPage")
    String currentPage;
    @SerializedName("totalPage")
    String totalPage;
    @SerializedName("data")
    List<BookModel> data;

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

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public String getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(String totalPage) {
        this.totalPage = totalPage;
    }

    public List<BookModel> getData() {
        return data;
    }

    public void setData(List<BookModel> data) {
        this.data = data;
    }

    public  class BookModel {
        @SerializedName("id")
        int id;
        @SerializedName("name")
        String name;
        @SerializedName("description")
        String description;
        @SerializedName("author")
        String author;
        @SerializedName("publishingYear")
        String publishingYear;
        @SerializedName("coverImage")
        String coverImage;
        @SerializedName("createdAt")
        String createdAt;
        @SerializedName("updatedAt")
        String updatedAt;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPublishingYear() {
            return publishingYear;
        }

        public void setPublishingYear(String publishingYear) {
            this.publishingYear = publishingYear;
        }

        public String getCoverImage() {
            return coverImage;
        }

        public void setCoverImage(String coverImage) {
            this.coverImage = coverImage;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }
    }
}
