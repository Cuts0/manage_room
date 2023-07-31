/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class KhachHang implements Serializable{
    private int ma,sophong;
    private String tenKH,kieuphong;
    private static int sma=100;

    public KhachHang() {
    }

    public KhachHang(int sophong, String tenKH, String kieuphong) throws TrongException{
        if(tenKH.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.sophong = sophong;
        this.tenKH = tenKH;
        this.kieuphong = kieuphong;
    }

    public KhachHang(int ma, int sophong, String tenKH, String kieuphong) {
        this.ma = ma;
        this.sophong = sophong;
        this.tenKH = tenKH;
        this.kieuphong = kieuphong;
    }

    

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getSophong() {
        return sophong;
    }

    public void setSophong(int sophong) {
        this.sophong = sophong;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getKieuphong() {
        return kieuphong;
    }

    public void setKieuphong(String kieuphong) {
        this.kieuphong = kieuphong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KhachHang.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{ma,tenKH,kieuphong,sophong};
    }
}
