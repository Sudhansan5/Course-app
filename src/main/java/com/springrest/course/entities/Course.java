package com.springrest.course.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    private long id;
    private String title;
    private String description;
}
