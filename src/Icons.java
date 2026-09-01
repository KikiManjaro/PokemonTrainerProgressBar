import javax.swing.*;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Icons {

    private static final Logger LOG = Logger.getLogger(Icons.class.getName());

    private static ImageIcon load(String path, String description) {
        URL url = Icons.class.getResource(path);
        if (url == null) {
            LOG.log(Level.WARNING, "Missing resource: {0}", path);
            // Return a 1x1 transparent placeholder instead of NPE
            return new ImageIcon(new byte[0], description);
        }
        return new ImageIcon(url, description);
    }

    public static final ImageIcon TRAINER = load("/Trainer.gif", "Trainer");
    public static final ImageIcon RTRAINER = load("/RTrainer.gif", "Trainer (reverse)");
    public static final ImageIcon WTRAINER = load("/WalkingTrainer.gif", "Walking Trainer");
    public static final ImageIcon PIKACHU = load("/Pikachu.gif", "Pikachu");

    private Icons() {}
}
