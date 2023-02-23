package com.sunny.restpracticals;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class VotersDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject= new JdbcTemplate(dataSource);
	}
	
	public ArrayList<Voters>getAllVoters()
	{
		String query = "select * from voters";
		ArrayList<Voters> voters = (ArrayList<Voters>) 
		jdbcTemplateObject.query(query, new VoterMapper());		
		return voters;
	}
	
	@SuppressWarnings("deprecation")
	public Voters findVotersById(int id) {
		Voters voters = null;
		try
		{
			voters = jdbcTemplateObject.queryForObject("select * from voters where id = ?", new Object[] { id }, new VoterMapper());

		}
		catch (Exception ex)
		{
			System.out.println("Exception:" + ex);
		}
		return voters;
	}
	
	public Voters updateVoters(Voters voters, int id )
	{
		jdbcTemplateObject.update("update voters set name = ?, address = ? where id = ?", new Object[] { voters.getName(), voters.getAddress(),id });
		return findVotersById(id);
	}
	public Voters addVoters(Voters voters)
	{
		jdbcTemplateObject.update("insert into voters (id, name, address) VALUES (?,?,?)", new Object[] { voters.getId(), voters.getName(), voters.getAddress()});
		return findVotersById(voters.getId());
	}
	public boolean deleteVoters(int id)
	{
		return jdbcTemplateObject.update("delete from voters where id = ?", new Object[] { id }) > 0;
	}
	
}
