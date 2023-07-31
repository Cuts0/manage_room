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
public class Phong implements Serializable{
    private int ma,sophong;
    private String kieuphong;
    private double tienthue;
    private static int sma=100;

    public Phong() {
    }

    public Phong( int sophong, String kieuphong, double tienthue){
        this.ma = sma++;
        this.sophong = sophong;
        this.kieuphong = kieuphong;
        this.tienthue = tienthue;
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

    public String getKieuphong() {
        return kieuphong;
    }

    public void setKieuphong(String kieuphong) {
        this.kieuphong = kieuphong;
    }

    public double getTienthue() {
        return tienthue;
    }

    public void setTienthue(double tienthue) {
        this.tienthue = tienthue;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Phong.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{ma,kieuphong,tienthue,sophong};
    }
    
}
