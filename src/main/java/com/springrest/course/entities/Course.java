package com.springrest.course.entities;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private long id;
    private String title;
    private String description;
}
