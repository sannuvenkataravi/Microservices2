package com.sathya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathya.entity.Plan;
@Repository
public interface PlanRepository extends JpaRepository<Plan,Long>
{

}
