package com.akilanselvam.lifehack.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "lifehacks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LifeHack {
    @Id
    private String lhId;
    private String title;
    private String description;
    private String approval;
    private Date lhDate;
}
