package com.example.recyclerproject;//classe 2

public class book {
    String title,auther,year;
    public book(String title, String auther,String year) {
      this.title=title;
      this.auther=auther;
      this.year=year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
