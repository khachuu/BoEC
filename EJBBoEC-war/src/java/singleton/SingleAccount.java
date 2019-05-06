/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;



/**
 *
 * @author taint
 */
public class SingleAccount {
    //create an object of SingleObject
 
    private String username;


    private String password;
    
    private short enabled;

    public String getUsername() {
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

    public short getEnabled() {
        return enabled;
    }

    public void setEnabled(short enabled) {
        this.enabled = enabled;
    }
  
    private static SingleAccount instance = new SingleAccount();
    
    //make the constructor private so that this class cannot be
    //instantiated
    private SingleAccount(){}
    //Get the only object available
    public static SingleAccount getInstance(){
    return instance;
    }

}
