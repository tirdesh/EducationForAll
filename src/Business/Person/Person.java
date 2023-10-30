/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

public class Person {

    int id;
    String first_name;
    String last_name;
    String email;
    private static int idCounter = 0;
    
    public Person() {
        this.id = ++idCounter;

    }

    public Person(String first_name, String last_name, String email) {
        this.id = ++idCounter;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public int getPersonId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public static void decrementIdCounter() {
        idCounter--;
    }

    public static int getIdCounter() {
        return idCounter;
    }


    public boolean isMatch(int id) {
        return getPersonId() == id;
    }

}
