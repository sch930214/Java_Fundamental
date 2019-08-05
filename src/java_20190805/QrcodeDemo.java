package java_20190805;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QrcodeDemo {
	public static void main(String[] args) {
		QRCodeWriter writer = new QRCodeWriter();
		try {								//웹사이트											//크기조절
			BitMatrix qrCode = writer.encode("http://www.naver.com", BarcodeFormat.QR_CODE, 300, 300);
			BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(qrCode);
			File f = new File("c:\\dev\\test\\qrcode.png"); //경로 변경
			boolean isSuccess = ImageIO.write(qrImage,"PNG",f);

		} catch (WriterException e) {
			e.printStackTrace();
		
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
