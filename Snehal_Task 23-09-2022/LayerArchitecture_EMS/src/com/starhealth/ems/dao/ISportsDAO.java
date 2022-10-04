package com.starhealth.ems.dao;

import java.util.List;

import com.starhealth.ems.bean.Sports;

public interface ISportsDAO {
	
	
	
	public int  addSports(Sports sp);
	public int  updateSports(Sports sp);
	
	public int deleteSportsById(int sid);
	public Sports  selectSportsById(int sid);
	
	public List<Sports>  selectAllSports();
	
	

}
