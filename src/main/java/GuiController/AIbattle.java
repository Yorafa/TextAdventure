package GuiController;

import java.util.Random;

public class AIbattle {
    public static boolean isAttack(){
        Random random = new Random();
        return random.nextBoolean();
    }
}
