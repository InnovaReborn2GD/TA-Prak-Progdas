package id.pajerosportdakar.carsale;
import java.util.regex.Matcher;  
import java.util.regex.Pattern;  

class User {  
    private String username;  
    private String password;  
    private String phone;  

    public User(String username, String password, String phone) {  
        this.username = username;  
        this.password = password;  
        this.phone = phone;  
    }  

    public String getUsername() {  
        return username;  
    }  

    public String getPassword() {  
        return password;  
    }  

    public String getPhone() {  
        return phone;  
    }  

    public static boolean validatePwd(String password) {  
        String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";  
        Pattern pattern = Pattern.compile(passwordPattern);  
        Matcher matcher = pattern.matcher(password);  
        return matcher.matches();  
    }  
    
    public static boolean validateNomor(String phone) {
        String regex = "^81\\d{7,13}$"; // 7 sd 13 digit setelah "81"  
        Pattern pattern = Pattern.compile(regex);  
        Matcher matcher = pattern.matcher(phone);  
        return matcher.matches(); 
    }
}