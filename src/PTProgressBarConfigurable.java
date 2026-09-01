import com.intellij.openapi.options.Configurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PTProgressBarConfigurable implements Configurable {

    private PTProgressBarSettingsComponent mySettingsComponent;

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "Pokemon Trainer Progress Bar";
    }

    @Override
    public JComponent getPreferredFocusedComponent() {
        return mySettingsComponent != null ? mySettingsComponent.getPreferredFocusedComponent() : null;
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        mySettingsComponent = new PTProgressBarSettingsComponent();
        return mySettingsComponent.getPanel();
    }

    @Override
    public boolean isModified() {
        if (mySettingsComponent == null) return false;
        PTProgressBarSettingsState settings = PTProgressBarSettingsState.getInstance();
        return mySettingsComponent.getChosenCharacter() != settings.getSelectedCharacter();
    }

    @Override
    public void apply() {
        PTProgressBarSettingsState settings = PTProgressBarSettingsState.getInstance();
        settings.setSelectedCharacter(mySettingsComponent.getChosenCharacter());
    }

    @Override
    public void reset() {
        PTProgressBarSettingsState settings = PTProgressBarSettingsState.getInstance();
        mySettingsComponent.setChosenCharacter(settings.getSelectedCharacter());
    }

    @Override
    public void disposeUIResources() {
        mySettingsComponent = null;
    }
}
