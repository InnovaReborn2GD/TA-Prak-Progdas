package id.pajerosportdakar.carsale;

public class Car {
    private String merek;  
    private String model;  
    private String tahun;  
    private String harga;  
    private String deskripsi;
    private String odometer;
    private String jenisBBM;
    private String jenisGearbox;
    private String kubikasi;
    private String warna;
    private String lokasi;
    private String nomorPenjual;
    private String namaPenjual;
    private String imagePath;

    public Car(String merek, String model, String tahun, String harga, String deskripsi, String odometer, String jenisBBM, String jenisGearbox, String kubikasi, String warna, String lokasi, String nomorPenjual, String namaPenjual, String imagePath) {  
        this.merek = merek;  
        this.model = model;  
        this.tahun = tahun;  
        this.harga = harga;  
        this.deskripsi = deskripsi; 
        this.odometer = odometer;
        this.jenisBBM = jenisBBM;
        this.jenisGearbox = jenisGearbox;
        this.kubikasi = kubikasi;
        this.warna = warna;
        this.lokasi = lokasi;
        this.nomorPenjual = nomorPenjual;
        this.namaPenjual = namaPenjual; 
        this.imagePath = imagePath;
    }  

    // Getter methods  
    public String getMerek() {  
        return merek;  
    }  

    public String getModel() {  
        return model;  
    }  

    public String getTahun() {  
        return tahun;  
    }  

    public String getHarga() {  
        return harga;  
    }  

    public String getDeskripsi() {  
        return deskripsi;  
    }  
    
    public String getOdometer() {
        return odometer;
    }
    
    public String getJenisBBM() {
        return jenisBBM;
    }
    
    public String getJenisGearbox() {
        return jenisGearbox;
    }
    
    public String getKubikasi() {
        return kubikasi;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public String getLokasi() {
        return lokasi;
    }
    
    public String getNomorPenjual() {
        return nomorPenjual;
    }

    public String getNamaPenjual() {
        return namaPenjual;
    }
    
    public String getImagePath() {
        return imagePath;
    }
    
    @Override  
    public String toString() {  
        return merek + " " + model + " (" + tahun + ")";  
    }  
} 

