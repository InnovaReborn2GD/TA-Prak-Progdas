package id.pajerosportdakar.carsale;
import com.formdev.flatlaf.themes.*;
import java.io.*;
import javax.swing.*;  
import java.util.ArrayList;  

public class Main {  
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Car> carList = new ArrayList<>();
    
    public static void main(String[] args) {  
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        FlatMacDarkLaf.setup();
        //</editor-fold> 
        loadData();
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame(userList).setVisible(true);
        });  
    }
    
    // function memuat data user dan mobil
    public static void loadData() {
        loadUserData();
        loadCarData(); 
    }
    
    // function menyimpan data user dan mobil
    public static void saveData() {
        saveUserData();
        saveCarData();
    }
    
    // simpan data pengguna ke usersDb.txt
    public static void saveUserData() {  
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usersDb.txt"))) {  
            for (User user : userList) {  
                writer.write(user.getUsername() + "," + user.getPassword() + "," + user.getPhone());  
                writer.newLine();  
            }  
            System.out.println ("Simpan data pengguna sukses.");  
        } catch (IOException e) {  
            System.out.println("Gagal menyimpan data pengguna: " +e.getMessage());
            JOptionPane.showMessageDialog(null, "Gagal menyimpan data pengguna: " + e.getMessage(), "Galat", JOptionPane.ERROR_MESSAGE);  
        }  
    }   
    
    // muat data pengguna dari usersDb.txt
    public static void loadUserData() {  
        try (BufferedReader reader = new BufferedReader(new FileReader("usersDb.txt"))) {  
            String line;  
            while ((line = reader.readLine()) != null) {  
                String[] parts = line.split(",");  
                if (parts.length == 3) {  
                    String username = parts[0];  
                    String password = parts[1];  
                    String phone = parts[2];  
                    userList.add(new User(username, password, phone));  
                }  
            }
            System.out.println("Muat data pengguna sukses");
        } catch (IOException e) {
            System.out.println("Gagal memuat database pengguna:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Gagal memuat database pengguna: " + e.getMessage(), "Galat", JOptionPane.ERROR_MESSAGE);  
        }  
    }
    
    // simpan data mobil ke carDb.txt
    public static void saveCarData() {  
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("carDb.txt"))) {  
            for (Car car : carList) {  
                writer.write(car.getMerek() + ";" + car.getModel() + ";" + car.getTahun() + ";" + car.getHarga() + ";" + 
                        car.getDeskripsi() + ";" + car.getOdometer() + ";" + car.getJenisBBM() + ";" + car.getJenisGearbox() + ";" + 
                        car.getKubikasi() + ";" + car.getWarna() + ";" + car.getLokasi() + ";" + car.getNomorPenjual() + ";" + 
                        car.getNamaPenjual() + ";" + car.getImagePath());  
                writer.newLine(); 
            }  
            System.out.println("Simpan data mobil sukses");  
        } catch (IOException e) {  
            JOptionPane.showMessageDialog(null, "Gagal menyimpan data mobil: " + e.getMessage(), "Galat", JOptionPane.ERROR_MESSAGE);  
        }  
    } 
    
    // muat data mobil dari carDb.txt
    public static void loadCarData() {  
        try (BufferedReader reader = new BufferedReader(new FileReader("carDb.txt"))) {  
            String line;  
            while ((line = reader.readLine()) != null) {  
                String[] parts = line.split(";");  
                if (parts.length == 14) {  
                    String merek = parts[0];  
                    String model = parts[1];  
                    String tahun = parts[2];  
                    String harga = parts[3];  
                    String deskripsi = parts[4];
                    String odometer = parts[5];
                    String jenisBBM = parts[6];
                    String jenisGearbox = parts[7];
                    String kubikasi = parts[8];
                    String warna = parts[9];
                    String lokasi = parts[10];
                    String nomorPenjual = parts[11];
                    String namaPenjual = parts[12];
                    String imagePath = parts[13];
                    carList.add(new Car(merek, model, tahun, harga, deskripsi, odometer, jenisBBM, jenisGearbox, kubikasi, warna, lokasi, nomorPenjual, namaPenjual, imagePath));  
                }  
            }  
            System.out.println("Muat data mobil sukses");
        } catch (IOException e) {  
            System.out.println("Gagal memuat database mobil" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Gagal memuat database mobil: " + e.getMessage(), "Galat", JOptionPane.ERROR_MESSAGE);  
        }  
    }         
}
