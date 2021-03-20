package com.tomek.stream.portfolio;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class  Main {
    private static CharSequence date;

    public static void main(String[] args) {
        User developer1 = new User("developer1", "Real Developer");
        User developer0 = new User("developer0", "Creator Developer");
        User developer2 = new User("developer2", "Notreal Developer");

        Task task1 = new Task("Task number 1",
                "description of task 1",
                developer1,
                developer0,
                LocalDate.now().minusDays(20),
                LocalDate.now());
        Task task2 = new Task("Task number 2",
                "description of task 2",
                developer2,
                developer1,
                LocalDate.now().minusDays(4),
                LocalDate.now());
        Task task3 = new Task("Task number 3",
                "description of task 3",
                developer0,
                developer1,
                LocalDate.now().minusDays(15),
                LocalDate.now());
        Task task4 = new Task("Task number 4",
                "description of task 4",
                developer1,
                developer0,
                LocalDate.now().minusDays(4),
                LocalDate.now().minusDays(1));
        Task task5 = new Task("Task number 5",
                "description of task 5",
                developer1,
                developer0,
                LocalDate.now().minusDays(4),
                LocalDate.now());
        Task task6 = new Task("Task number 6",
                "description of task 6",
                developer1,
                developer0,
                LocalDate.now().minusDays(10),
                LocalDate.now().minusDays(1));

        TaskList taskListToDo = new TaskList("Task list TODO");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task2);
        TaskList taskListInProgress  = new TaskList("Task List IN PROGRESS");
        taskListInProgress.addTask(task3);
        taskListInProgress.addTask(task4);
        TaskList taskListDone = new TaskList("Task List DONE");
        taskListDone.addTask(task5);
        taskListDone.addTask(task6);

        Board board = new Board("Task Board");
        board.addTaskList(taskListDone);
        board.addTaskList(taskListInProgress);
        board.addTaskList(taskListToDo);

        System.out.println(board);
        System.out.println("Zadanie pirwsze: Wyszukiwanie zadań użytkownika...");
        board.getTaskLists().stream()
                .map(TaskList::getTasks)
                .flatMap(tasks -> tasks.stream())
                .filter(task -> task.getAssignedUser().getUsername().equals("developer1"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Wyszukiwanie przetreminowanych zadań...");
        board.getTaskLists().stream()
                .map(TaskList::getTasks)
                .flatMap(tasks -> tasks.stream())
                .filter(task ->task.getDeadline().isBefore(LocalDate.now()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("*********************************");
       long board1 = board.getTaskLists().stream()
                .map(TaskList::getTasks)
                .flatMap(tasks -> tasks.stream())
                .map(task -> task.getCreated())
                .filter(localDate -> localDate.isAfter(LocalDate.now().minusDays(10)))
                .count();
        System.out.println(board1);
//                .collect(Collectors.toList())
//
//                .forEach(System.out::println);
        System.out.println("##########################");

        LocalDate date1
                = LocalDate.parse(date);
        LocalDate date = LocalDate.now();
        System.out.println(date);


    }
}
