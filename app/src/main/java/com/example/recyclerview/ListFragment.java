package com.example.recyclerview;

public class ListFragment {
    private String title;
    private String deskripsi;
    private String dateline;


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setDateline(String dateline) { this.dateline = dateline; }

    public String getTitle() {
        return title;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getDateline() {
        return dateline;
    }


}