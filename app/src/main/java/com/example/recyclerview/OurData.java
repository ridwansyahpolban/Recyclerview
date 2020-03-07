package com.example.recyclerview;

import java.util.ArrayList;

public class OurData {

    public static String [] title = new String[]{
            "Proyek",
            "PPL teori",
            "PPL praktikum",
            "Apsi teori",
            "Apsi Praktikum",
            "PKN",
            "Statpro"
    };

    public static String [] deskripsi = new String[]{
            "Membuat Aplikasi berbasis web",
            "Membuat class diagram dan membuat sequence diagram dari class diagram",
            "Menampilkan data dari database dengan view detail",
            "Membaca chapter 4",
            "Membuat SOP dan dari business proses yang dibuat",
            "presentasi mengenai kesejahteraan",
            "menghitung mean, median, dan membuat diagram dari data yang talah dibuat"
    };

    public static String [] dateline = new String[]{
            "25 februari 2020",
            "28 februari 2020",
            "28 februari 2020",
            "26 februari 2020",
            "27 februari 2020",
            "27 februari 2020",
            "27 februari 2020"
    };
    static ArrayList<ListFragment> getListData() {
        ArrayList<ListFragment> list = new ArrayList<>();
        for (int position = 0; position < title.length; position++) {
            ListFragment hero = new ListFragment();
            hero.setTitle(title[position]);
            hero.setDeskripsi(deskripsi[position]);
            hero.setDateline(dateline[position]);
            list.add(hero);
        }
        return list;
    }
}
