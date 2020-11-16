package com.skilldistillery.run.services;

import java.util.List;

import com.skilldistillery.run.entities.Run;

public interface RunService {
	
	List<Run> index();
	Run showRun(Integer id);
	Run createRun(Run run);
	Run updateRun(Run run, Integer id);
	boolean deleteRun(Integer id);
	

}


//List<Post>	GET api/posts	Gets all posts
//Post	GET api/posts/{id}	Gets one post by id
//Post	POST api/posts	Creates a new post
//Post	PUT api/posts/{id}	Replaces an existing post by id
//void	DELETE api/posts/{id}	Deletes an existing post by id