package com.nandhini.project.expense_tracker.expense_app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ExpenseRepository extends JpaRepository<ExpenseTracker, Integer> {
    public List<ExpenseTracker> findByUsername(String name);
}
