package org.example.asm_java5_final.report;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ReportCost implements Serializable {
    @Id
    public Date date;
    public Long sumOrder;
    public Double cost;
}
