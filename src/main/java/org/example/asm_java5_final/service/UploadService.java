package org.example.asm_java5_final.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

public interface UploadService {
    File save(MultipartFile file, String folder);
    void delete(String folder, String name);
    List<File> save(MultipartFile[] files, String folder);
}
