package com.example.baiktra1;

public class Singer {
    private String ten, nghedanh, quocgia;
    private int anh;

    public Singer(String ten, String nghedanh, String quocgia, int anh) {
        this.ten = ten;
        this.nghedanh = nghedanh;
        this.quocgia = quocgia;
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNghedanh() {
        return nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        this.nghedanh = nghedanh;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}
