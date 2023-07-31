/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Bangsapxep implements Serializable{
    private Phong phong;
    private KhachHang kh;
    private int songaythue;

    public Bangsapxep() {
    }

    public Bangsapxep(Phong phong, KhachHang kh, int songaythue) {
        this.phong = phong;
        this.kh = kh;
        this.songaythue = songaythue;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public int getSongaythue() {
        return songaythue;
    }

    public void setSongaythue(int songaythue) {
        this.songaythue = songaythue;
    }
    public Object[] toObject(){
        return new Object[]{phong.getMa(),kh.getMa(),kh.getTenKH(),kh.getKieuphong(),kh.getSophong(),songaythue};
    }
}
