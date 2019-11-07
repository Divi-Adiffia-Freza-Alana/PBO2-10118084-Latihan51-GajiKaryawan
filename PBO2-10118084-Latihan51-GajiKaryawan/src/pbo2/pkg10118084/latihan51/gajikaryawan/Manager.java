/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan51.gajikaryawan;

/**
 *
 * @author Freza
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

 
    public float tunjanganKehadiran(int hadir){
        return kehadiran*10000 ;
        
    }
    public float tunjanganJabatan(String jabatan){
        switch (jabatan) {
            case "Manager":
                return 2000000;
            case "Kabag":
                return 1000000;
            default:
                return 0;
        }
    }
    public float tunjanganGolongan(int golongan){
        if(golongan==1){
            return 500000;
        } 
        else if(golongan==2) {
            return 100000;
        }
        else{
  
        return 1500000;
        }
        
    }
    public float gajiTotal(float tunjanganGolongan, float tunjanganJabatan,float tunjanganKehadiran){
        return tunjanganGolongan + tunjanganJabatan + tunjanganKehadiran;
    
    }
    
}
