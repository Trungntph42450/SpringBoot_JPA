package org.example.asm_java5_final.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Accounts")
@ToString
@Getter
@Setter
public class Account implements Serializable {
    @Id
    private String username;
    private String password;
    private String fullname;
    private String email;
    private String photo;
    private Boolean activated;
    @JsonIgnore
    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
//	@Column(name = "roledetails")
    private List<RoleDetail> roleDetails;
    @JsonIgnore
    @OneToMany(mappedBy = "account")
    private List<Order> orders;
}
