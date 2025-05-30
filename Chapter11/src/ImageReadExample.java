import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageReadExample {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("img/example.jpg")){
			BufferedImage image = ImageIO.read(fis);
			
			if(image !=null) {
				System.out.println("이미지 너비 : "+image.getWidth());
				System.out.println("이미지 높이 : "+image.getHeight());
			}else {
				System.out.println("이미지를 읽을 수 없습니다.");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
