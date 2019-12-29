/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252;
import soft252.Patient.Patient;
import soft252.Admin.Admin;
import soft252.Doctor.Doctor;
import soft252.Secretary.Secretary;

import soft252.System.ICreateUser;
import soft252.System.SystemDatabase;

/**
 *
 * @author Nick1
 */
public class SOFT252 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ICreateUser TestObject = new Patient("Nick","Clothier","Plymouth Uni", 21,"Male");
//        System.out.println(TestObject.getUserID());
//        System.out.println(TestObject.getUserFirst());
//        System.out.println(TestObject.getUserLast());
//        System.out.println(TestObject.getUserAdress());
//        System.out.println(TestObject.getUserAge());
//        System.out.println(TestObject.getUserGender());
        
//        ICreateUser TestObject2 = new Admin("Nathan","Clothier","Weymouth COllege");
//        System.out.println(TestObject2.getUserID());
//        System.out.println(TestObject2.getUserFirst());
//        System.out.println(TestObject2.getUserLast());
//        System.out.println(TestObject2.getUserAdress());
//        System.out.println(TestObject2.getUserAge());
//        System.out.println(TestObject2.getUserGender());
        



        ICreateUser TestObject = new Patient("Nick","Clothier","Plymouth Uni", 21, "Male");
        ICreateUser TestObject2 = new Doctor("Nathan","Clothier","Weymouth College");
        ICreateUser TestObject3 = new Doctor("Gary","Clothier","Weymouth");
        ICreateUser TestObject4 = new Doctor("Michaela","Clothier","Weymouth");
        
        SystemDatabase.Users[0] = TestObject;
        SystemDatabase.Users[1] = TestObject2;
        SystemDatabase.Users[2] = TestObject3;
        SystemDatabase.Users[3] = TestObject4;
        
        System.out.println("Creating Test Patient - Added Into Users Array.");
        System.out.println(SystemDatabase.Users[0].getUserID());
        System.out.println(SystemDatabase.Users[0].getUserFirst() + " " + SystemDatabase.Users[0].getUserLast());
        
        System.out.println("");
        System.out.println("Create Test Admin - Added Into Users Array.");
        System.out.println(SystemDatabase.Users[1].getUserID());
        System.out.println(SystemDatabase.Users[1].getUserFirst() + " " + SystemDatabase.Users[1].getUserLast());
        
        System.out.println("");
        System.out.println("Create Test Doctor - Added Into Users Array.");
        System.out.println(SystemDatabase.Users[2].getUserID());
        System.out.println(SystemDatabase.Users[2].getUserFirst() + " " + SystemDatabase.Users[2].getUserLast());
        
        System.out.println("");
        System.out.println("Create Test Secretary - Added Into Users Array.");
        System.out.println(SystemDatabase.Users[3].getUserID());
        System.out.println(SystemDatabase.Users[3].getUserFirst() + " " + SystemDatabase.Users[3].getUserLast());
        
        ICreateUser TestObject5 = new Patient("Bradley", "Pickering","Wyke", 20,"Male");
        SystemDatabase.Users[4] = TestObject5;
        System.out.println("Creating Second Test Patient - Added Into Users Array. Should ");
        System.out.println(SystemDatabase.Users[4].getUserID());
        System.out.println(SystemDatabase.Users[4].getUserFirst() + " " + SystemDatabase.Users[4].getUserLast());
    }
    
}
