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
public class Android extends Handphone{
    private String keyStore;

    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
}
