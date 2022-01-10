package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Schedule schedule = new Schedule();
        schedule.AddingSchedule();
        List<Person> scheduleList = schedule.getList();
        //System.out.println(scheduleList);

        //printing all the elements individually in scheduleList
        for(int i =0; i <scheduleList.size(); i++){
            Person scheduled = scheduleList.get(i);
            System.out.println(scheduled);
        }
//        //finding what chil does on monday
//        for(int i = 0; i < scheduleList.size(); i++){
//            if (scheduleList.get(i).day == "Monday" && scheduleList.get(i).name == "chil"){
//                Person scheduled = scheduleList.get(i);
//                System.out.println("On Monday, chil " + scheduled.activity + " at " + scheduled.time);
//            }
//        }
//
//        //finding what yun does on monday
//        for(int i = 0; i < scheduleList.size(); i++){
//            if (scheduleList.get(i).day == "Monday" && scheduleList.get(i).name == "yun"){
//                Person scheduled = scheduleList.get(i);
//                System.out.println("On Monday, yun " + scheduled.activity + " at " + scheduled.time);
//            }
//        }
//
//        //when does chil go to pharmacy?
//        for(int i = 0; i < scheduleList.size(); i++){
//            if (scheduleList.get(i).activity == "goes to pharmacy"){
//                Person specificActivity = scheduleList.get(i);
//                System.out.println(specificActivity.name + " " + specificActivity.activity + " at " + specificActivity.time + " on " + specificActivity.day);
//            }
//        }
//        //finding what chil does on Tuesday
//        for(int i = 0; i < scheduleList.size(); i++){
//            if (scheduleList.get(i).day == "Tuesday" && scheduleList.get(i).name == "chil"){
//                Person scheduled = scheduleList.get(i);
//                System.out.println("On Tuesday, chil " + scheduled.activity + " at " + scheduled.time);
//            }
//        }

    }

}
