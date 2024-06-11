package org.example.asm_java5_final.report;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ReportProduct implements Serializable {
    @Id
    public Long id;
    public String name;
    public Long count;
}
