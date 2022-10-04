package com.starthealth.ems.service;

import java.util.List;

import com.starhealth.ems.bean.Sports;
import com.starhealth.ems.dao.SportsDaoImp;
import com.starhealth.ems.dao.ISportsDAO;

public class SportsServiceImp implements ISportsService {

	
	ISportsDAO  dao =	new SportsDaoImp();
	
	
	@Override
	public int addSports(Sports sp) {
		
		return  dao.addSports(sp);
	}

	@Override
	public int updateSports(Sports sp) {
		// TODO Auto-generated method stub
		return dao.updateSports(sp);
	}

	@Override
	public int deleteById(int sid) {
		
		return dao.deleteSportsById(sid);
	}

	@Override
	public Sports selectSportsById(int sid) {
		
		return dao.selectSportsById(sid);
	}

	@Override
	public List<Sports> selectAllSports() {
		
		return dao.selectAllSports();
	}

	
	
	public static boolean validateInputs(Sports sp) {

		boolean isValid = false;
	
	if (sp.getsid() > 99 && sp.getsname().length() > 3 && sp.getsvalue() > 1000) {

		isValid = true;
	}
	
	return isValid;

}
	
	
	
}
