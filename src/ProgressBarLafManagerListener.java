import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import com.intellij.openapi.application.ApplicationActivationListener;
import com.intellij.openapi.wm.IdeFrame;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ProgressBarLafManagerListener implements LafManagerListener, ApplicationActivationListener {

    public ProgressBarLafManagerListener() {
        updateProgressBarUI();
    }

    @Override
    public void lookAndFeelChanged(@NotNull LafManager lafManager) {
        updateProgressBarUI();
    }

    @Override
    public void applicationActivated(@NotNull IdeFrame ideFrame) {
        updateProgressBarUI();
    }

    private static void updateProgressBarUI() {
        // Guard against early initialization before UIManager is ready
        try {
            String uiClass = ProgressBarUi.class.getName();
            UIManager.put("ProgressBarUI", uiClass);
            UIManager.getDefaults().put(uiClass, ProgressBarUi.class);
        } catch (Exception e) {
            // Avoid crashing IDE startup if class not yet loaded
        }
    }
}
