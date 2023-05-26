package com.karabiyik.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class TeacherDto {
    private int teacherId;
    @NotEmpty(message = "ad soyad alanını boş bırakamazsınız")
    @Size(min = 1, max = 255)
    private String teacherNameSurname;
    @NotEmpty(message = "email alanını boş bırakamazsınız")
    @Email(message = "uygun formatta email giriniz")
    private String teacherEmail;
    @NotEmpty(message = "şifre alanını boş bırakamazsınız")
    //@Min(value = 6, message = "minumum 6 karakterden oluşmalıdır")
    @Size(min = 6, max = 16, message = "şifre en az 6 en fazla 16 karakter içermelidir")
    private String teacherPassword;

}
