package com.hibernateProj.student_laptopproj;
import javax.persistence.*;
@Entity
@Table(name = "laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "laptop_id")
    private Long id;

    @Column(name = "brand")
    private String brand;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    public Laptop() {}

    public Laptop(String brand) {
        this.brand = brand;
    }

	public void setStudent(Student student2) {
		// TODO Auto-generated method stub
		
	}

    // getters and setters
}
