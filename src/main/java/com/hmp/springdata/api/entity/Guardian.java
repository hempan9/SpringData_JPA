package com.hmp.springdata.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

//Embed this data to student class
@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@AttributeOverrides(
        {
                @AttributeOverride(
                        name="name",
                column = @Column(name = "guardian_name")),
                @AttributeOverride(
                        name = "email",
                        column = @Column(name = "guardian_email")
                ),
                @AttributeOverride(name = "mobile",
                column = @Column(name = "guardian_mobile"))
        }
)
public class Guardian {
    private String name;
    private String email;
    private String mobile;
}
