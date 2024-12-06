package id.pajerosportdakar.carsale;
import java.util.regex.Matcher;  
import java.util.regex.Pattern;  

// kelas dan konstruktor user
public class User {  
    private String username;  
    private String password;  
    private String phone;  

    public User(String username, String password, String phone) {  
        this.username = username;  
        this.password = password;  
        this.phone = phone;  
    }  

    // metode getter utk masing masing atribut data user
    public String getUsername() {  
        return username;  
    }  

    public String getPassword() {  
        return password;  
    }  

    public String getPhone() {  
        return phone;  
    }  
    
    // metode untuk validasi password (1 huruf besar, 1 huruf kecil, 1 angka, 1 simbol, 8-20 karakter)
    public static boolean validatePwd(String password) {  
        String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$";  
        Pattern pattern = Pattern.compile(passwordPattern);  
        Matcher matcher = pattern.matcher(password);  
        return matcher.matches();  
    }  
    
    // metode untuk validasi nomor telepon
    public static boolean validateNomor(String phone) {
        String regex = "^8\\d{8,14}$"; // 8 sd 14 digit setelah "8"  
        Pattern pattern = Pattern.compile(regex);  
        Matcher matcher = pattern.matcher(phone);  
        return matcher.matches(); 
    }
}