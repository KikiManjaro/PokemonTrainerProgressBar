import javax.swing.*;

public enum PTCharacter {

    TRAINER(Icons.TRAINER, "Trainer"),
    WALKING_TRAINER(Icons.WTRAINER, "Walking Trainer"),
    PIKACHU(Icons.PIKACHU, "Pikachu");

    private final ImageIcon icon;
    private final String displayName;

    PTCharacter(ImageIcon icon, String displayName) {
        this.icon = icon;
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public ImageIcon getIcon() {
        return icon;
    }
}
