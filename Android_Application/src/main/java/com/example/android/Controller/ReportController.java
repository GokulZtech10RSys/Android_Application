package com.example.android.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.android.Entity.Report;
import com.example.android.Service.ReportService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ReportController {
	
	@Autowired
	private ReportService reportService;
	
	@GetMapping("/excel")
	public void generateExcelReport(HttpServletResponse response) throws Exception{
		
		response.setContentType("application/octet-stream");
		
		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=courses.xls";

		response.setHeader(headerKey, headerValue);
		
		reportService.generateExcel(response);
		
		response.flushBuffer();
	}
	
	
	
	@GetMapping("/pdf")
	public void generatePdfReport(HttpServletResponse response) throws Exception{
		
		response.setContentType("application/pdf");

		
		String pdfheaderKey = "Content-Disposition";
		String pdfheaderValue = "attachment;filename=courses.pdf";

		response.setHeader(pdfheaderKey, pdfheaderValue);
		
		reportService.generatePdf(response);
		
		response.flushBuffer();
	}
	
	
	
	@PostMapping("/save")
    public ResponseEntity<Report> createCourse(@RequestBody Report course) {
        Report savedCourse = reportService.saveCourse(course);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCourse);
    }
	
	
	
	
	
	
	
	
	
	

}
