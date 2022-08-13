package com.example.uas_akb_if2_10119061.motnot;
/**
 * Nama : Rheiza Akmal Razzaky
 * Kelas : IF2
 * NIM :10119061
 * Email : rheiza.10119061@mahasiswa.unikom.ac.id
 * **/
public class ModelMonot {
    private String id;
    private String judul;
    private String date;
    private String month;
    private String year;
    private String isi;

    public ModelMonot(String id, String judul, String isi, String date, String month, String year) {
        this.id = id;
        this.judul = judul;
        this.date = date;
        this.month = month;
        this.year = year;
        this.isi = isi;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDate() {
        return date;
    }

    public String getMonth() {
        return month;
    }
    public String getYear() {
        return year;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}
