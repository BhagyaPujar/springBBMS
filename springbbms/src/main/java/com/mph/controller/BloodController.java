package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mph.entity.Blood;
import com.mph.service.BloodService;



@RestController
public class BloodController {
	
	
	@Autowired
	BloodService bloodService;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView search(@RequestParam("txtbld_id") String bld_id) {
		int bldno = Integer.parseInt(bld_id);
		List<Blood> bldlist = bloodService.searchBloodById(bldno);
		boolean bld = bldlist.isEmpty();
		if (bld) {

			ModelAndView mv = new ModelAndView("home");
			return mv.addObject("NOTIFICATION", "Blood NOT Found :( ");
		} else {

			ModelAndView mv = new ModelAndView("home");
			return mv.addObject("allbld", bldlist);
		}
	}
}
