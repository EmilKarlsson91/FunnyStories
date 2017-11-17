package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Story {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int storyid;
	
	@Column(name = "storytext",nullable = false, length = 500)
	private String story;
	
	@Column
	private int votes;

	public Story() {
		
	}
	
	public Story(String story) {
		this.story = story;
	}	
	
	public String getStory() {
		System.out.println(this.story);
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public int getStoryid() {
		return storyid;
	}
	
	
}
