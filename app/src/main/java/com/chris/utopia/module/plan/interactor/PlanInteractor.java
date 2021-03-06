package com.chris.utopia.module.plan.interactor;

import com.chris.utopia.entity.Plan;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Chris on 2016/1/31.
 */
public interface PlanInteractor {
    void createOrUpdate(Plan plan) throws SQLException;
    List<Plan> findPlan(Plan plan) throws SQLException;
    Plan findPlanById(String id) throws SQLException;
    List<Plan> findWeekPlan(Plan plan) throws SQLException;
    void addPlan(List<Plan> plans) throws Exception;
    void deletePlan(Plan plan) throws SQLException;
}
