package com.springpractice.app.studentSystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
public class AddStudentRequestDto {

    @NotBlank(message = "Name is Required.")
    @Size(min = 3, max = 30, message = "Name length is invalid. It must be in b/w 3-30 characters")
    private String name;

    @Email
    @NotBlank(message = "Email is Required.")
    private String email;
}

