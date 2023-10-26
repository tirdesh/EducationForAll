/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Profiles.Profile;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class UserAccountDirectory {
    
      ArrayList<UserAccount> useraccountlist ;
      UserAccount actualuser;

    public UserAccount getActualuser() {
        return actualuser;
    }
      public UserAccountDirectory (){
          
       useraccountlist = new ArrayList();
       UserAccount admin = new UserAccount ("admin",  "admin");
       useraccountlist.add(admin);

    }

    public UserAccount newUserAccount(Profile p, String un, String pw) {

        if (!isUsernameTaken(un)) {
            UserAccount ua = new UserAccount(p, un, pw);
            useraccountlist.add(ua);
            return ua;
        } else {
            // Handle the case where the username is not unique
            // You can throw an exception, return null, or handle it as needed
            return null;
        }
    }

    public UserAccount findUserAccount(int id) {

        for (UserAccount ua : useraccountlist) {

            if (ua.isMatch(id)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
         }

    public UserAccount authenticate(String username, String password) {
        for (UserAccount ua : useraccountlist) {
            if (ua.getUserLoginName().equals(username) && ua.checkPassword(password)) {
                this.actualuser = ua;
                return ua;
            }
        }
        return null; // User not found or incorrect credentials
    }

     
     public ArrayList<UserAccount> getUserAccountList()
     {
         for (UserAccount ua: useraccountlist){
                      System.out.println(ua);

         }
         return useraccountlist;
     }
     
     private boolean isUsernameTaken(String username) {
        for (UserAccount ua : useraccountlist) {
            if (ua.getUserLoginName().equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

}
