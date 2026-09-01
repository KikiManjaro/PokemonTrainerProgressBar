import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@State(
        name = "PTProgressBarSettingsState",
        storages = @Storage("PokemonTrainerProgressBarSettings.xml")
)
public class PTProgressBarSettingsState implements PersistentStateComponent<PTProgressBarSettingsState> {

    public String selectedCharacterName = PTCharacter.TRAINER.name();

    public PTCharacter getSelectedCharacter() {
        try {
            return PTCharacter.valueOf(selectedCharacterName);
        } catch (IllegalArgumentException e) {
            return PTCharacter.TRAINER;
        }
    }

    public void setSelectedCharacter(PTCharacter character) {
        this.selectedCharacterName = character.name();
    }

    public static PTProgressBarSettingsState getInstance() {
        return ApplicationManager.getApplication().getService(PTProgressBarSettingsState.class);
    }

    @Nullable
    @Override
    public PTProgressBarSettingsState getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull PTProgressBarSettingsState state) {
        XmlSerializerUtil.copyBean(state, this);
    }
}
