package com.hibernateProj.student_laptopproj;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Laptop laptop;

    public Student() {}

    public Student(String name) {
        this.name = name;
    }

	public void setLaptop(Laptop laptop2) {
		// TODO Auto-generated method stub
		
	}

    // getters and setters
}
