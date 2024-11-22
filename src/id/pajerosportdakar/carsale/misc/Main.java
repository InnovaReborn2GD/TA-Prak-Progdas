/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.pajerosportdakar.carsale.misc;
import id.pajerosportdakar.carsale.test.MainFrame;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.io.File;  
import javax.imageio.ImageIO;  
import java.awt.image.BufferedImage;  

/**
 *
 * @author DarkLighs
 */
class JendelaA {  
    private JFrame frameA;  
    private JLabel imageLabel; // Label untuk menampilkan gambar  

    public JendelaA() {  
        // Membuat JFrame untuk Jendela A  
        frameA = new JFrame("Jendela A");  
        frameA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frameA.setSize(400, 300);  
        frameA.setLayout(new FlowLayout());  

        // Membuat tombol di Jendela A  
        JButton button = new JButton("Buka Jendela B");  
        frameA.add(button);  

        // Tombol untuk memilih gambar  
        JButton chooseImageButton = new JButton("Pilih Gambar");  
        frameA.add(chooseImageButton);  

        // Label untuk menampilkan gambar  
        imageLabel = new JLabel();  
        frameA.add(imageLabel);  

        // Menambahkan action listener ke tombol  
        button.addActionListener(new ActionListener() {  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                new JendelaB(); // Memanggil konstruktor JendelaB  
            }  
        });  

        // Action listener untuk memilih gambar  
        chooseImageButton.addActionListener(new ActionListener() {  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                JFileChooser fileChooser = new JFileChooser();  
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);  
                
                // Tampilkan dialog file chooser  
                int returnValue = fileChooser.showOpenDialog(frameA);  
                if (returnValue == JFileChooser.APPROVE_OPTION) {  
                    File selectedFile = fileChooser.getSelectedFile();  
                    try {  
                        // Mengambil gambar dari file yang dipilih  
                        BufferedImage img = ImageIO.read(selectedFile);  
                        // Mengubah ukuran gambar menjadi 300x300  
                        Image scaledImg = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);  
                        // Menampilkan gambar di JLabel  
                        ImageIcon imageIcon = new ImageIcon(scaledImg);  
                        imageLabel.setIcon(imageIcon);  
                        imageLabel.setText(""); // Menghapus teks jika ada 
                    } catch (Exception ex) {  
                        JOptionPane.showMessageDialog(frameA, "Gagal memuat gambar: " + ex.getMessage());  
                    }  
                }  
            }  
        });  

        frameA.setVisible(true); // Menampilkan Jendela A  
    }  
}  

class JendelaB {  
    private JFrame frameB;  

    public JendelaB() {  
        // Membuat JFrame untuk Jendela B  
        frameB = new JFrame("Jendela B");  
        frameB.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
        frameB.setSize(300, 200);  
        frameB.setVisible(true); // Menampilkan Jendela B  
    }  
}  

public class Main {  
    public static void main(String[] args) {  
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        System.out.println(""); 
        
        SwingUtilities.invokeLater(() -> new JendelaA()); // Menjalankan Jendela A  
    }  
}  