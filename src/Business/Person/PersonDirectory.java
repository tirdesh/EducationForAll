/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class PersonDirectory {
    
      ArrayList<Person> personlist ;
    
      public PersonDirectory (){
          
       personlist = new ArrayList();

    }

    public Person newPerson() {

        Person p = new Person();
        personlist.add(p);
        return p;
    }
    
    public void deletePerson(Person personToDelete) {
       if (personToDelete != null) {
        int deletedId = personToDelete.getPersonId();
        personlist.remove(personToDelete);

        // Check if the deleted person's ID is the highest so far
        if (deletedId == Person.getIdCounter()) {
            Person.decrementIdCounter();
        }
    }
    }

    public Person findPerson(int id) {

        for (Person p : personlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
         }
}
