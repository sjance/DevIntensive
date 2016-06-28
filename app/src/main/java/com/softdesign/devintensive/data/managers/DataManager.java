package com.softdesign.devintensive.data.managers;


public class DataManager {
    private static DataManager INSTANCE = null;
    private PreferencesManager mPreferenceManager;


    public DataManager() {
        this.mPreferenceManager = new PreferencesManager();
    }

    public static DataManager getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    public PreferencesManager getPreferenceManager() {
        return mPreferenceManager;
    }
}
