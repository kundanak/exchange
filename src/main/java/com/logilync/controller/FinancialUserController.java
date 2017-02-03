package com.logilync.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.logilync.domain.FinancialUser;
import com.logilync.repository.FinancialUserRepo;

@Controller

public class FinancialUserController {
	
	@Autowired
	
	FinancialUserRepo financialUserRepo;
	
	@RequestMapping(value="/createFinancialUser",method=RequestMethod.GET)
	public String showCreateFinancialUser(){
		return "createFinancialUser";
	}
	
	@RequestMapping(value="/saveFinancialUser",method=RequestMethod.POST)
	public String saveCreateFinancialUser(FinancialUser financialUser,Model model ){
		financialUser=financialUserRepo.save(financialUser);
		model.addAttribute("financialUser",financialUser);
		return "createFinancialUser";

}
}
