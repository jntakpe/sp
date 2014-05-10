package com.github.jntakpe.sp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Entité représentant une tâche
 *
 * @author jntakpe
 */
@Entity
public class Task extends GenericDomain {

    @NotNull
    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    @OneToMany(mappedBy = "task")
    private Set<DailyConsuption> dailyConsuptions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<DailyConsuption> getDailyConsuptions() {
        return dailyConsuptions;
    }

    public void setDailyConsuptions(Set<DailyConsuption> dailyConsuptions) {
        this.dailyConsuptions = dailyConsuptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        return !(name != null ? !name.equals(task.name) : task.name != null);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                '}';
    }
}
