package com.courseregistration.model;


public class Student {
    private int id;
    private String matno;
    private String firstname;
    private String lastname;
    private String email;
	
    
    public Student() {
		
    }
	
    
    public Student(String matno, String firstname, String lastname, String email) {
        this.matno = matno;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatno() {
        return matno;
    }

    public void setMatno(String matno) {
        this.matno = matno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 

}
