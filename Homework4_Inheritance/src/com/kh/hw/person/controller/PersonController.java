package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.*;

public class PersonController {

	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	public int[] personCount() {
		int[] count = new int[2];
		count[0] = 0;
		for (Student a : s) {
			if (a != null) {
				count[0]++;
			}
		}
		count[1] = 0;
		for (Employee b : e) {
			if (b != null) {
				count[1]++;
			}
		}
		return count;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}

	public Student[] printStudent() {
		return s;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for (int i = 0; i < e.length; i++) {
			if (e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
	}

	public Employee[] printEmployee() {
		return e;
	}
}
