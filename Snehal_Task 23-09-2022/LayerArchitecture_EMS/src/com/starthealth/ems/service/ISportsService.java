package com.starthealth.ems.service;

import java.util.List;

import com.starhealth.ems.bean.Sports;

public interface ISportsService {
	
	
	
	public int  addSports(Sports sp);
	public int  updateSports(Sports sp);
	
	public int deleteById(int sid);
	public Sports  selectSportsById(int sid);
	
	public List<Sports>  selectAllSports();
	
	

}
