package com.sathya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.dto.PlanDto;
import com.sathya.service.PlanServiceImpl;
@RestController
public class PlanController
{@Autowired
	private PlanServiceImpl service;
@GetMapping(value="/plans", produces="application/json")
public List<PlanDto> getAllPlans()
{
	return service.getAllPlans();
}
@GetMapping(value="/plans/{planId}", produces="application/json")
public PlanDto getSpecificPlan(@PathVariable Long  planId
		)
{
	return service.getSpecificPlan(planId);
}

}
