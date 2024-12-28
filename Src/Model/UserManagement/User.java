package Model.UserManagement;
import java.util.ArrayList;
import java.util.List;



import Model.WorkoutManagement.Workout4Plan;
import Model.WorkoutManagement.Workout4Record;

import java.util.List;

public abstract class User extends Observer{
    private int id;
    private String name;
    private int age;
    private List<Workout4Plan> workoutplan;
    private List<Workout4Record> workoutrecord;


    public User(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
        // Inizializzo le liste
        this.workoutplan = new ArrayList<>();
        this.workoutrecord = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Workout4Plan> getWorkoutplan() {
        return workoutplan;
    }

    public void setWorkoutplan(List<Workout4Plan> workoutplan) {
        this.workoutplan = workoutplan;
    }

    public List<Workout4Record> getWorkoutrecord() {
        return workoutrecord;
    }

    public void setWorkoutrecord(List<Workout4Record> workoutrecord) {
        this.workoutrecord = workoutrecord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
