package com.brainacad.module2.lesson19.mvc;

/**
 * Created by Alex on 12/11/2016.
 */
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getGroup());
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentName(String studentName) {
        model.setName(studentName);
    }

    public int getStudentGroup() {
        return model.getGroup();
    }

    public void setStudentGroup(int studentGroup) {
        model.setGroup(studentGroup);
    }

}
