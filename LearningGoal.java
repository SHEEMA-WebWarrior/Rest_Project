package com.example.model;
import jakarta.persistence.*;
import java.util.*;
@Entity
public class LearningGoal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String goalName;
    private Date targetCompletionDate;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

	public void setId(Long id2) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setId'");
	}
}
