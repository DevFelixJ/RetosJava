/*
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
 * - Url de ejemplo: https://raw.githubusercontent.com/mouredev/
 *   mouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
 *   imagen de 1920*1080px.
 */
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class AspectRatio {
    public static void main(String[] args) {
        imageRatio();
    }

    private static void imageRatio(){
        String imageURL = "https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png";

        try {
            URL url = new URL(imageURL);
            BufferedImage image = ImageIO.read(url);

            int width = image.getWidth();
            int height = image.getHeight();

            double aspectRatio = (double) width / height;
            System.out.println("Direccion imagen: " + imageURL);
            System.out.println("Ancho imagen: " + width);
            System.out.println("Altura imagen: " + height);
            System.out.println("Aspect Ratio: " + aspectRatio);
        } catch (IOException e) {
            System.err.println("Error al cargar imagen: " + e.getMessage());
        }
    }
}
