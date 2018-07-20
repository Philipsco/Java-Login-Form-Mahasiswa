/*class DataKontak*/
package database;


public class DataMahasiswa {
    private String nama,email,alamat,password,username,programstudi;
    
    public DataMahasiswa(){}
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }    
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat( String alamat){
        this.alamat= alamat;
    }
    
    public String getprogramStudi(){
        return programstudi;
    }
    
    public void setprogramStudi(String programstudi){
        this.programstudi = programstudi;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
