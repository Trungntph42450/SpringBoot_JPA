package org.example.asm_java5_final.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailInfo {
    private String from = "phucnhps19246@fpt.edu.vn", to, cc[], bcc[], subject, body;
    private List<File> attachments;

    public MailInfo(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }
}
