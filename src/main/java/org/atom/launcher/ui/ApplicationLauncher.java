package org.atom.launcher.ui;

import com.apple.eawt.*;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: abey.tom
 * Date: 7/14/13
 * Time: 6:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationLauncher {
    public static void main(String[] args) throws Exception {
        osxSetup();
        final Launcher dialog = new Launcher(new javax.swing.JFrame(), true);
        Application macApplication = Application.getApplication();
        macApplication.setPreferencesHandler(new PreferencesHandler() {
            @Override
            public void handlePreferences(AppEvent.PreferencesEvent preferencesEvent) {
                dialog.new PreferenceAction().actionPerformed(null);
            }
        });
        macApplication.setQuitHandler(new QuitHandler() {
            @Override
            public void handleQuitRequestWith(AppEvent.QuitEvent quitEvent, QuitResponse quitResponse) {
                System.out.println("Quit");
            }

        });
        macApplication.setQuitStrategy(QuitStrategy.SYSTEM_EXIT_0);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
        });
    }

    private static void osxSetup() throws Exception {
        if(isOSX()){
            System.setProperty("apple.laf.useScreenMenuBar", "true");
            System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Launcher");
        }
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }

    public static boolean isOSX() {
        String osName = System.getProperty("os.name");
        return osName.contains("OS X");
    }
}
