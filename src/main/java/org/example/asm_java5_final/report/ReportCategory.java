package org.example.asm_java5_final.report;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class ReportCategory implements Serializable {
    @Id
    public String id;
    public String name;
    public Long qty;
}
