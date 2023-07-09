package com.example.android.Service;

import java.io.IOException;
import java.util.List;
import java.io.OutputStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.android.Entity.Report;
import com.example.android.Repository.reportRepository;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ReportService {

	@Autowired
	private reportRepository courseRepo;

	public void generateExcel(HttpServletResponse response) throws Exception {

		List<Report> courses = courseRepo.findAll();

		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Courses Info");
		HSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("FirstName");
		row.createCell(2).setCellValue("LastName");
		row.createCell(3).setCellValue("Price");
		row.createCell(4).setCellValue("Email");
		row.createCell(5).setCellValue("PhoneNumber");
		row.createCell(6).setCellValue("HouseNo");
		row.createCell(7).setCellValue("City");
		row.createCell(8).setCellValue("Address");

		int dataRowIndex = 1;

		for (Report course : courses) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(course.getCid());
			dataRow.createCell(1).setCellValue(course.getFirstName());
			dataRow.createCell(2).setCellValue(course.getLastName());
			dataRow.createCell(3).setCellValue(course.getPrice());
			dataRow.createCell(4).setCellValue(course.getEmail());
			dataRow.createCell(5).setCellValue(course.getPhoneNumber());
			dataRow.createCell(6).setCellValue(course.getHouseNo());
			dataRow.createCell(7).setCellValue(course.getCity());
			dataRow.createCell(8).setCellValue(course.getAddress());
			dataRowIndex++;
		}

		ServletOutputStream ops = response.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();

	}
	
	

	public void generatePdf(HttpServletResponse response) throws IOException {
	    List<Report> courses = courseRepo.findAll();

	    PDDocument document = new PDDocument();
	    PDPage page = new PDPage();
	    document.addPage(page);

	    try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
	        contentStream.setFont(PDType1Font.TIMES_BOLD, 12);
	        contentStream.setLeading(14.5f);

	        contentStream.beginText();
	        contentStream.newLineAtOffset(25, 700);
	        contentStream.showText("Courses Info");
	        contentStream.newLine();

	        contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

	        contentStream.showText("ID");
	        contentStream.newLine();
	        contentStream.showText("FirstName");
	        contentStream.newLine();
	        contentStream.showText("LastName");
	        contentStream.newLine();
	        contentStream.showText("Price");
	        contentStream.newLine();
	        contentStream.showText("Email");
	        contentStream.newLine();
	        contentStream.showText("PhoneNumber");
	        contentStream.newLine();
	        contentStream.showText("HouseNo");
	        contentStream.newLine();
	        contentStream.showText("City");
	        contentStream.newLine();
	        contentStream.showText("Address");
	        contentStream.newLine();

	        for (Report course : courses) {
	            contentStream.showText(String.valueOf(course.getCid()));
	            contentStream.newLine();
	            contentStream.showText(course.getFirstName());
	            contentStream.newLine();
	            contentStream.showText(course.getFirstName());
	            contentStream.newLine();
	            contentStream.showText(String.valueOf(course.getPrice()));
	            contentStream.newLine();
	            contentStream.showText(course.getEmail());
	            contentStream.newLine();
	            contentStream.showText(course.getPhoneNumber());
	            contentStream.newLine();
	            contentStream.showText(course.getHouseNo());
	            contentStream.newLine();
	            contentStream.showText(course.getCity());
	            contentStream.newLine();
	            contentStream.showText(course.getAddress());
	            contentStream.newLine();
	        }

	        contentStream.endText();
	    }

	    
	    try (OutputStream outputStream = response.getOutputStream()) {
	        document.save(outputStream);
	    }

	    document.close();
	}



	public Report saveCourse(Report course) {
        return courseRepo.save(course);
    }
	
	
	
	

}