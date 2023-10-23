/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import org.mindrot.jbcrypt.BCrypt;
import Business.Profiles.Profile;
import java.util.ArrayList;



/**
 *
 * @author kal bugrara
 */
public class UserAccount {
    
    Profile profile;
    String username;
    private final ArrayList<String> passwordHashes = new ArrayList<>();

    
    public UserAccount (Profile profile, String un, String pw){
        username = un;
        setPassword(pw);
        this.profile = profile;

    }
    
    public UserAccount (String un, String pw){
        if ("admin".equals(un)){
            username = un;
            setPassword(pw);
        }
            this.profile = null;

    }

    public int getPersonId(){
        return profile.getPerson().getPersonId();
    }
    public String getUserLoginName(){
        return username;
    }

        public boolean isMatch(int id){
        return getPersonId() == id;
    }
        public boolean IsValidUser(String un, String pw){
        
        return username.equalsIgnoreCase(un) && checkPassword(pw);
        
        }
        public String getRole(){
            return profile.getRole();
        }
        
        public Profile getAssociatedPersonProfile(){
            return profile;
        }
        
        public boolean checkPassword(String password) {
        if (!passwordHashes.isEmpty()) {
            String latestPasswordHash = passwordHashes.get(0);
            return BCrypt.checkpw(password, latestPasswordHash);
        }
        return false;
    }

    public void setPassword(String newPassword) {
        if (newPassword != null) {
            // Hash the new password using BCrypt
            String hashedPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());
            
            // Check if the new hashed password is not the same as any of the existing hashes
            for (String storedPasswordHash : passwordHashes) {
                if (BCrypt.checkpw(newPassword, storedPasswordHash)) {
                    // New password matches an old one, so it cannot be used
                    return;
                }
            }
            
            // Add the new hashed password at the beginning of the list (index 0)
            passwordHashes.add(0, hashedPassword);
        }
    }
    
    
    @Override
        public String toString(){
            
            //return getUserLoginName();
            return "UserAccount{" +
           "profile=" + profile +
           ", username='" + username + '\'' +
           ", passwordHashes=" + passwordHashes +
           '}';
        }
        
}

