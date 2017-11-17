package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vote {

	public Vote(int storyId, int userId, boolean vote) {
		this.storyId = storyId;
		this.userId = userId;
		this.vote = vote;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int voteid;
	
	@Column(name = "storyid")
	private int storyId;
	
	@Column(name = "userid")
	private int userId;
	
	public int getStoryId() {
		return storyId;
	}

	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean isVote() {
		return vote;
	}

	public void setVote(boolean vote) {
		this.vote = vote;
	}

	@Column
	private boolean vote;
	
}
