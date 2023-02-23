package com.sunny.restpracticals;

import java.util.ArrayList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VotersControllers {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/sunny/restpracticals/config.xml");
	VotersDAO votersDAO = (VotersDAO)context.getBean("VotersDAO");
	
	@GetMapping("/voters")
	ArrayList<Voters> getAllVoters()
	{
		return votersDAO.getAllVoters();
	}
	@PostMapping("/addVoters")
	Voters addVoters(@RequestBody Voters newVoter)
	{
		return votersDAO.addVoters(newVoter);
	}
	@GetMapping(path = "/voters/{id}")
	Voters findVoters(@PathVariable Integer id) throws Exception
	{
		if (this.votersDAO == null)
		{
			throw new Exception("No data Fetched");
		}
	Voters Voter = votersDAO.findVotersById(id);
	if (Voter == null)
	{
		throw new Exception("No Voter found for id :" + id);
	}
		return Voter;
	}
	@PutMapping("/voters/{id}")
	Voters updateVoters(@RequestBody Voters Voter, @PathVariable("id") Integer id )
	{
	return votersDAO.updateVoters(Voter, id);
	}
	
	@DeleteMapping("/voters/{id}")
	void deleteVoters(@PathVariable Integer id)
	{
		votersDAO.deleteVoters(id);
	}

}
