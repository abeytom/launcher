package org.atom.launcher.ui.osx;

import com.apple.eawt.AppEvent;
import com.apple.eawt.PreferencesHandler;

public class MyApplicationAdapter implements PreferencesHandler{

    @Override
    public void handlePreferences(AppEvent.PreferencesEvent preferencesEvent) {
        System.out.println("Prefrences called");
    }
}