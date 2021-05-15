package com.example.demo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class student {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	@NotBlank(message = "shd not be blank")
    @Size(min = 3,message = "heeyey")
	private String name;
	
	@NotBlank(message = "heil")
	private String semester;
}
