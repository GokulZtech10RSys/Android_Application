package com.example.android.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.android.Entity.QRCodeEntity;
import com.example.android.Service.QRCodeService;
import com.google.zxing.WriterException;

@RestController
@RequestMapping("/v6/api")
public class QRCodeController {

	
	@Autowired
    private QRCodeService qrCodeService;


    @PostMapping(value = "/generate", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] generateAndSaveQRCode(@RequestBody QRCodeEntity qrCodeEntity) throws WriterException, IOException {
        QRCodeEntity createdEntity = qrCodeService.createQRCode(qrCodeEntity);
        String content = createdEntity.getId().toString(); // Use the ID as the content for the QR code
        return qrCodeService.generateQRCode(content);
    }
    
    
    
    
}