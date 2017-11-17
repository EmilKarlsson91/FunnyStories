package com.backing;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.entities.Story;
import com.entities.User;
import com.entities.Vote;
import com.entities.facades.StoryFacade;
import com.entities.facades.UserFacade;
import com.entities.facades.VoteFacade;

@Named
@ViewScoped
public class FunnyBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EJB private UserFacade userEJB;
	@EJB private StoryFacade storyEJB;
	@EJB private VoteFacade voteEJB;
	
	private List<User> users;
	private List<Story> stories;
	private List<Vote> votes;
	
	public List<User> getUsers(){
			users = userEJB.findAll();
			if(users.size() <= 0) {
				System.out.println("No element in user");				
			}
			for(User user : users) {
				System.out.println(user.getName());
			}
		return users;
	}
	
	public List<Story> getStories(){
			stories = storyEJB.findAll();
		return stories;
	}

	public List<Vote> getVotes(){
		if(votes == null) {
			votes = voteEJB.findAll();
		}
		return votes;
	}
	
	
	
}
