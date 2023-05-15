package com.sathya.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.dto.PlanDto;
import com.sathya.entity.Plan;
import com.sathya.repository.PlanRepository;

@Service
public class PlanServiceImpl 
{
@Autowired
private PlanRepository rep;
public List<PlanDto> getAllPlans()
{
	List<Plan> list=rep.findAll();
	List<PlanDto> list2=new ArrayList<PlanDto>();
	for(Plan p : list)
	{
		PlanDto pd=new PlanDto();
		pd.setPlanId(p.getPlanId());
		pd.setPlanName(p.getPlanName());
		pd.setTenure(p.getTenure());
		list2.add(pd);
	}
	return list2;
}
public PlanDto getSpecificPlan(Long planId) {
Optional<Plan> p=rep.findById(planId);
Plan pp=p.get();
PlanDto dto=new PlanDto();
 dto.setPlanId(pp.getPlanId());
 dto.setPlanName(pp.getPlanName());
 dto.setTenure(pp.getTenure());

return dto;

}
}
