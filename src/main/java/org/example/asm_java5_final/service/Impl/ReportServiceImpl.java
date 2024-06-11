package org.example.asm_java5_final.service.Impl;

import org.example.asm_java5_final.report.ReportCost;
import org.example.asm_java5_final.report.ReportProduct;
import org.example.asm_java5_final.repository.ReportCostRepo;
import org.example.asm_java5_final.repository.ReportProductRepo;
import org.example.asm_java5_final.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    ReportCostRepo rpcRepo;
    @Autowired
    ReportProductRepo rprRepo;

    @Override
    public List<ReportCost> reportCostInMonth(Integer month) {
        List<ReportCost> lst = rpcRepo.reportCost(month);
        return lst;
    }
    @Override
    public List<ReportProduct> reportProductInMonth(Integer month) {
        List<ReportProduct> lst = rprRepo.reportProduct(month);
        return lst;
    }
}
