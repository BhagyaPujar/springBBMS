package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mph.entity.Hospital;
import com.mph.service.HospitalService;

@RestController
@RequestMapping(value = "/hospital")
public class HospitalController {

	@Autowired
	HospitalService hospitalService;

	Hospital hospital;

	

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView search(@RequestParam("txthospid") String hospid) {
		int hospno = Integer.parseInt(hospid);
		List<Hospital> hosplist = hospitalService.searchHospitalById(hospno);
		boolean hosp = hosplist.isEmpty();
		if (hosp) {

			ModelAndView mv = new ModelAndView("home");
			return mv.addObject("NOTIFICATION", "Hospital NOT Found :( ");
		} else {

			ModelAndView mv = new ModelAndView("home");
			return mv.addObject("allhosp", hosplist);
		}
	}

}