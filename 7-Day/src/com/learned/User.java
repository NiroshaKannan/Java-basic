package com.learned;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {


	String firstName;
    String lastName;
    int age;
    Long salary;
    Date dateOfBirth;
    
    public User() {

    }
    
    public User(String firstName) {
        this.firstName = firstName;
        System.out.println("First Name is :" + firstName );
    }
    
    public void setLastName(String lName) {
    	this.lastName = lName;
    }
    
    public String getLastName() {
        System.out.println("Last name is :" + lastName );
        return lastName;
     }
    
    public void setAge( int myAge ) {
    	age = myAge;
     }

     public int getAge( ) {
        System.out.println("My age is :" + age );
        return age;
     }
     
     public void setSalary( Long myAge ) {
    	 salary = myAge;
      }

      public Long getSalary( ) {
         System.out.println("My salary is :" + salary );
         return salary;
      }
    

    
    public static void main(String []args) {
        
    	User user = new User( "Nirosha" );
    	
    	user.setLastName("Kannan");
    	user.getLastName();
    	
    	user.setAge(21);
    	user.getAge();
    	
    	user.setSalary(21000L);
    	user.getSalary();
    	
    	String pattern = "EEEEE MMMMM yyyy";
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    	String date = simpleDateFormat.format(new Date());
    	System.out.println(date);


    	
     }

}
