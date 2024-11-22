package id.pajerosportdakar.carsale.test;
import java.io.*;
import javax.swing.*;  
import java.util.ArrayList;  
import java.util.logging.*;

public class Main {  
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Car> carList = new ArrayList<>();
    
    public static void main(String[] args) {  
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
        */
        try { javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold> 
        loadData();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame(userList).setVisible(true); 
            }
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
    
    // simpan data pengguna ke usersDB.txt
    public static void saveUserData() {  
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usersDb.txt"))) {  
            for (User user : userList) {  
                writer.write(user.getUsername() + "," + user.getPassword() + "," + user.getPhone());  
                writer.newLine();  
            }  
            System.out.println ("Simpan data pengguna Sukses.");  
        } catch (IOException e) {  
            System.out.println("Gagal menyimpan data pengguna: " +e.getMessage());
            JOptionPane.showMessageDialog(null, "Gagal menyimpan data pengguna: " + e.getMessage(), "Galat", JOptionPane.ERROR_MESSAGE);  
        }  
    }   
    // muat data pengguna dari usersDB.txt
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
    // muat data mobil dari carDB.txt
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
    // menyimpan data mobil ke dalam carDB.txt
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
}
