package com.github.jntakpe.sp.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

/**
 * Consommation d'un {@link com.github.jntakpe.sp.domain.Employee} sur une {@link com.github.jntakpe.sp.domain.Task}
 * 
 * @author jntakpe
 */
@Entity
public class DailyConsuption extends GenericDomain {

    @ManyToOne(optional = false)
    private Employee employee;

    @ManyToOne(optional = false)
    private Task task;

    private LocalDate day;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DailyConsuption that = (DailyConsuption) o;

        return !(employee != null ? !employee.equals(that.employee) : that.employee != null) && !(task != null ? !task.equals(that.task)
                : that.task != null);

    }

    @Override
    public int hashCode() {
        int result = employee != null ? employee.hashCode() : 0;
        result = 31 * result + (task != null ? task.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EmployeeTask{" +
                "employee=" + employee +
                ", task=" + task +
                '}';
    }
}
