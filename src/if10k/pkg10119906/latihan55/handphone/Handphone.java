/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan55.handphone;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class Handphone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga) {
        this.manufacture= man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }

   
    
    public void displayProduct() {
       
      Android android = new Android("Samsung", "Android", "Grand", 3000000);
      android.setKeyStore("234ibfd3840fo");
      BlackBerry blackberry = new BlackBerry("Blackb", "RIM", "Curve", 2000000);
      blackberry.setPinBB("BHS249");
      WindowsPhone windows = new WindowsPhone("Nokia", "Win8", "Lumia",1000000);
      windows.setWpKeyStore("UUUQIJWORJ");
 
      System.out.println("Manufaktur : " + android.manufacture);
      System.out.println("OS : " + android.operatingSystem);
      System.out.println("Model : " + android.model);
      System.out.println("Harga : " + android.harga);
      System.out.println("Android Key Store : " + android.getKeyStore());
      System.out.println("");
      
      System.out.println("Manufaktur : " + blackberry.manufacture);
      System.out.println("OS : " + blackberry.operatingSystem);
      System.out.println("Model : " + blackberry.model);
      System.out.println("Harga : " + blackberry.harga);
      System.out.println("PIN: " + blackberry.getPinBB());
      System.out.println("");
      
      System.out.println("Manufaktur : " + windows.manufacture);
      System.out.println("OS : " + windows.operatingSystem);
      System.out.println("Model : " + windows.model);
      System.out.println("Harga : " + windows.harga);
      System.out.println("Wp Key Store: " + windows.getWpKeyStore());
      System.out.println("");
      
    }
}
