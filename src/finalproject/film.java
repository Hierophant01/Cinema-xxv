/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Color;

/**
 *
 * @author AhmadGuntur
 */
public class film {
    public String jf;
    public int jml;
    public double hrg,ttl,uk,ub;
    
    public void setJf(String val){
        jf=val;
    }
    
    public String getJf(){
        return jf;
    }
    
    public void listflm()
    {
        if (jf.equals("Doctor Strange : Multiverse of Darkness"))
        {
            hrg = 55000;
        }
        else if (jf.equals("Shang-Chi and the Legend of the Ten Rings"))
        {
            hrg = 50000;
        }
        else 
        {
            jf.equals(" ");
            hrg = 0;
        }       
    }
        public void setHrg(double val) {
            hrg = val;
        }

        public double getHrg() {
            return hrg;
        }
        
        public void setJml(int val) {
        jml = val;
        }

        public int getJml() {
            return jml;
        }

        public double getTot() {
            ttl = hrg*jml;
            return ttl;
        }

        public void setUb(double val) {
            ub = val;
        }

        public double getUb() {
            return ub;
        }

        public double getUk() {
            return (ub-ttl);
        }
}
