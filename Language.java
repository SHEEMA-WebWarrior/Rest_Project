package com.example.model;
import jakarta.persistence.*;
import java.util.*;
@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private String description;
	public void setId(Long id2) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setId'");
	}
}
