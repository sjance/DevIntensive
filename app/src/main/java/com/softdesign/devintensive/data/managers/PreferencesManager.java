package com.softdesign.devintensive.data.managers;


import android.content.SharedPreferences;
import android.net.Uri;

import com.softdesign.devintensive.utils.ConstantManager;
import com.softdesign.devintensive.utils.DevintensiveApplication;

import java.util.ArrayList;
import java.util.List;

public class PreferencesManager {


    private SharedPreferences mSharedPreferences;

    private static final String[] USER_FIELDS = {ConstantManager.USER_PHONE_KEY, ConstantManager.USER_MAIL_KEY,
                                                 ConstantManager.USER_VK_KEY, ConstantManager.USER_GIT_KEY, ConstantManager.USER_ABOUT_KEY};


    public PreferencesManager() {
        this.mSharedPreferences = DevintensiveApplication.getSharedPreferences();
    }

    // Реализация сохранения данных введенных пользователем
    public void saveUserProfileData(List<String> userFields) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();

        for (int i = 0; i < USER_FIELDS.length; i++ ) {
            editor.putString(USER_FIELDS[i], userFields.get(i));
        }
        editor.apply();
    }

    // Загрузка данных введенных пользователем
    public List<String> loadUserProfileData() {
        List<String> userFields = new ArrayList<>();
        userFields.add(mSharedPreferences.getString(ConstantManager.USER_PHONE_KEY, "null"));
        userFields.add(mSharedPreferences.getString(ConstantManager.USER_MAIL_KEY, "null"));
        userFields.add(mSharedPreferences.getString(ConstantManager.USER_VK_KEY, "null"));
        userFields.add(mSharedPreferences.getString(ConstantManager.USER_GIT_KEY, "null"));
        userFields.add(mSharedPreferences.getString(ConstantManager.USER_ABOUT_KEY, "null"));
        return userFields;
    }

    // Сохранение фотографии профиля
    public void saveUserPhoto(Uri uri) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(ConstantManager.USER_PHOTO_KEY, uri.toString());
        editor.apply();
    }

    // Загрузка фотографии профиля
    public Uri loadUserPhoto() {
        return Uri.parse(mSharedPreferences.getString(ConstantManager.USER_PHOTO_KEY, "android.resource://com.softdesign.devintensive/drawable/user_bg"));
    }
}
