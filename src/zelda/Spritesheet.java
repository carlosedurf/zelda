package zelda;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
    public static BufferedImage spritesheet;
    public static BufferedImage[] playerFront;
    public static BufferedImage[] enemyFront;
    public static BufferedImage tileWall;

    public Spritesheet() {
        try {
            spritesheet = ImageIO.read(getClass().getResource("/res/spritesheet.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        playerFront = new BufferedImage[2];
        playerFront[0] = Spritesheet.getSprite(0, 11, 16, 16);
        playerFront[1] = Spritesheet.getSprite(16, 11, 16, 16);
        enemyFront = new BufferedImage[2];
        enemyFront[0] = Spritesheet.getSprite(75, 240, 16, 16);
        enemyFront[1] = Spritesheet.getSprite(223, 241, 16, 16);
        tileWall = Spritesheet.getSprite(307, 154, 16, 16);
    }
    // 75, 240

    public static BufferedImage getSprite(int x, int y, int width, int height) {
        return spritesheet.getSubimage(x, y, width, height);
    }
}
