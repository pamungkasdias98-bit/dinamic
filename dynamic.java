package belajarjava;

public class dynamic {
    public static void main(String[] args) {
        String nama = "catur";
        int usia = 20;
        
        String teksDinamis = String.format("Nama saya %s, dan Usia saya %d tahun", nama, usia);
        System.out.println(teksDinamis);
    }
}