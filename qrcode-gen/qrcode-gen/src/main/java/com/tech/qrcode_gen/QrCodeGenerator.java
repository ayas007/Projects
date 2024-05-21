package com.tech.qrcode_gen;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;

/**
 * Hello world!
 *
 */
public class QrCodeGenerator

{

	private static String QRCODE_PATH = "C:\\Users\\ayass\\Desktop\\QRCODE-SERVER\\";

	public String writeQRCode(RequestQR  Request) throws Exception {
		String qrcode = QRCODE_PATH + Request.getUserName() + "-QRCODE.png";
		QRCodeWriter writer = new QRCodeWriter();
		BitMatrix bitMatrix = writer.encode(
				Request.getUserName() + "\n" + Request.getAccountNo() + "\n"
						+ Request.getAccountType() + "\n" + Request.getMobileNo(),
				BarcodeFormat.QR_CODE, 350, 350);
		Path path = FileSystems.getDefault().getPath(qrcode);
		MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
		return "QRCODE is generated successfully....";
	}

	public String readQRCode(String qrcodeImage) throws Exception {
		BufferedImage bufferedImage = ImageIO.read(new File(qrcodeImage));
		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
		Result result = new MultiFormatReader().decode(binaryBitmap);
		return result.getText();

	}

	public static void main(String[] args) throws Exception {
		QrCodeGenerator codeGenerator = new QrCodeGenerator();
		
		  System.out.println( codeGenerator.writeQRCode(new
		  RequestQR("Ayas", "8830090065", "Personal", "24564565467")));
		 
		//System.out.println(codeGenerator.readQRCode(QRCODE_PATH + "Ayas-QRCODE.png"));
	}

}
