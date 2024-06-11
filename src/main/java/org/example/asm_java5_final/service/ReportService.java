package org.example.asm_java5_final.service;

import org.example.asm_java5_final.report.ReportCost;
import org.example.asm_java5_final.report.ReportProduct;

import java.util.List;

public interface ReportService {
    List<ReportCost> reportCostInMonth(Integer month);
    List<ReportProduct> reportProductInMonth(Integer month);
}
