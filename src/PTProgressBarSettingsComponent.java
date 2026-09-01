import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBRadioButton;
import com.intellij.util.ui.FormBuilder;
import com.intellij.util.ui.UIUtil;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PTProgressBarSettingsComponent {

    private final JPanel configMainPanel;
    private final List<JBRadioButton> characterRadioButtons = new ArrayList<>();

    public PTProgressBarSettingsComponent() {
        JBLabel title = new JBLabel("Choose your trainer:", UIUtil.ComponentStyle.REGULAR);
        ButtonGroup group = new ButtonGroup();
        FormBuilder builder = FormBuilder.createFormBuilder().addComponent(title);
        for (PTCharacter character : PTCharacter.values()) {
            JBRadioButton radio = new JBRadioButton(character.getDisplayName());
            radio.setActionCommand(character.name());
            group.add(radio);
            characterRadioButtons.add(radio);
            builder.addLabeledComponent(new JLabel(character.getIcon()), radio);
        }
        configMainPanel = builder.addComponentFillVertically(new JPanel(), 0).getPanel();
    }

    public JComponent getPreferredFocusedComponent() {
        return characterRadioButtons.isEmpty() ? null : characterRadioButtons.get(0);
    }

    public JPanel getPanel() {
        return configMainPanel;
    }

    @NotNull
    public PTCharacter getChosenCharacter() {
        for (JBRadioButton rb : characterRadioButtons) {
            if (rb.isSelected()) {
                try {
                    return PTCharacter.valueOf(rb.getActionCommand());
                } catch (IllegalArgumentException ignored) {
                }
            }
        }
        return PTCharacter.TRAINER;
    }

    public void setChosenCharacter(@NotNull PTCharacter character) {
        for (JBRadioButton rb : characterRadioButtons) {
            rb.setSelected(character.name().equals(rb.getActionCommand()));
        }
    }
}
