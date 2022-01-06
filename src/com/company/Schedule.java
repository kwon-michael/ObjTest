package com.company;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    List<Person> personSchedule = new ArrayList<>();
    public void AddingSchedule(){
        //chil's monday
        personSchedule.add(new Person("chil", "starts work", "9am", "Monday"));
        personSchedule.add(new Person("chil", "has meeting", "10am","Monday"));
        personSchedule.add(new Person("chil", "ends meeting", "11am","Monday"));
        personSchedule.add(new Person("chil", "has lunch", "12pm","Monday"));
        personSchedule.add(new Person("chil", "ends work", "3:30pm","Monday"));
        personSchedule.add(new Person("chil", "goes to pharmacy", "6pm","Monday"));
        personSchedule.add(new Person("chil", "eats diner", "7pm","Monday"));
        personSchedule.add(new Person("chil", "goes to sleep", "9pm","Monday"));
        //yun's monday
        personSchedule.add(new Person("yun", "starts work", "9am","Monday"));
        personSchedule.add(new Person("yun", "eats lunch", "12pm","Monday"));
        personSchedule.add(new Person("yun", "ends work", "6pm","Monday"));
        personSchedule.add(new Person("yun", "does deliveries", "6:30pm","Monday"));
        personSchedule.add(new Person("yun", "eats dinner", "7pm","Monday"));
        personSchedule.add(new Person("yun", "workout", "8pm","Monday"));
        personSchedule.add(new Person("yun", "goes to sleep", "9pm","Monday"));

    }
    public List<Person> getList() {
        return personSchedule;
    }

}
