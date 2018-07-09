package com.arshadapp.arshadlibrary;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;

public class SharedUtil {

    public static final String PREFS_NAME = "AppPrefsFile";

    private String USER_ID = "user_id";
	private String FIRST_NAME = "first_name";
    private String LAST_NAME = "last_name";
    private String EMAIL = "user_email";
    private String PROFILE_PICTURE = "profile_picture";
    private String FACEBOOK_ID = "facebook_id";
    private String GOOGLE_ID = "google_id";
    private String DOB = "user_birth_date";
    private String ZODIAC_ID = "zodiac_id";
    private String PROFILE_PHOTO = "profile_photo";

    private String APP_NAME = "app_name";
    private String APP_VERSION_DESCRIPTION = "app_version_description";
    private String APP_VERSION_NAME = "app_version_name";
    private String APP_VERSION_CODE = "app_version_code";
    private String APP_IS_COMPALSARY = "app_is_compalsary";
    private String APP_VERSION_DATE = "app_version_date";

    private String LOCK_SCREEN_DATA = "app_lock_screen_data";
    private String LOCK_SCREEN_DATA_DATE = "app_lock_screen__data_date";
    private String DAILY_HOROSCOPE_DATE = "daily_horoscope_date";

    private String IS_USER_SUBSCRIBE = "is_user_subscribe";
    private String SPLASH_RESPONSE = "splash_response";
    private String LOCK_SCREEN = "lock_screen";
    private String NOTIFICATIONS = "notifications";

    private Context context;
	
	public SharedUtil(Context context) {
		super();
		this.context = context;
	}

    public boolean clearShareUtils(){
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.clear();
        return editor.commit();
    }

    public boolean addDailyHoroscopeDate(boolean text){
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(DAILY_HOROSCOPE_DATE, text);
        return editor.commit();
    }

    public Boolean getDailyHoroscopeDate(){
        SharedPreferences pref = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        Boolean text = pref.getBoolean(DAILY_HOROSCOPE_DATE, false);
        return text;
    }

    /*public boolean addVersionName(String versionName){
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(VERSION_NAME, versionName);
        return editor.commit();
    }

    public String getVersionName(){
        SharedPreferences pref = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        String text = pref.getString(VERSION_NAME, "1.0");
        return text;
    }

    public boolean addVersionDescription(String text){
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(VERSION_DESCRIPTION, text);
        return editor.commit();
    }

    public String getVersionDescription(){
        SharedPreferences pref = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        String text = pref.getString(VERSION_DESCRIPTION, null);
        return text;
    }

    public boolean addAppVersionDate(String text){
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(APP_VERSION_DATE, text);
        return editor.commit();
    }

    public String getAppVersionDate(){
        SharedPreferences pref = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        String text = pref.getString(APP_VERSION_DATE, CalenderUtil.getCurrentDate());
        return text;
    }*/

    public boolean addISUserSubscribe(boolean status){
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(IS_USER_SUBSCRIBE, status);
        return editor.commit();
    }

    public Boolean isUserSubscribe(){
        SharedPreferences pref = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        boolean lockData = pref.getBoolean(IS_USER_SUBSCRIBE, false);
        return lockData;
    }

    public boolean addAppVersionDate(String text){
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(APP_VERSION_DATE, text);
        return editor.commit();
    }

    public String getAppVersionDate(){
        SharedPreferences pref = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        String text = pref.getString(APP_VERSION_DATE, "abc");
        return text;
    }

    public boolean addLockScreenData(String text){
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(LOCK_SCREEN_DATA, text);
        return editor.commit();
    }
    public boolean addLockScreenDataDate(String text){
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(LOCK_SCREEN_DATA_DATE, text);
        return editor.commit();
    }

    public boolean addProfilePhoto(String text){
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(PROFILE_PHOTO, text);
        return editor.commit();
    }

    public String getProfilePhoto(){
        SharedPreferences pref = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        String text = pref.getString(PROFILE_PHOTO, null);
        return text;
    }

    public boolean addSplashResponse(String text){
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(SPLASH_RESPONSE, text);
        return editor.commit();
    }

    public String getSplashResponse(){
        SharedPreferences pref = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        String text = pref.getString(SPLASH_RESPONSE, null);
        return text;
    }

    public boolean addLockScreen(boolean isChecked){
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(LOCK_SCREEN, isChecked);
        return editor.commit();
    }

    public Boolean getLockScreen(){
        SharedPreferences pref = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        boolean isChecked = pref.getBoolean(LOCK_SCREEN, false);
        return isChecked;
    }

    public String getLockScreenData(){
        SharedPreferences pref = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        String lockData = pref.getString(LOCK_SCREEN_DATA, null);
        return lockData;
    }

    public String getLockScreenDataDate(){
        SharedPreferences pref = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        String lockData = pref.getString(LOCK_SCREEN_DATA_DATE, null);
        return lockData;
    }

    public boolean addNotifications(boolean isChecked){
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(NOTIFICATIONS, isChecked);
        return editor.commit();
    }

    public Boolean getNotifications(){
        SharedPreferences pref = context.getSharedPreferences(PREFS_NAME, Activity.MODE_PRIVATE);
        boolean isChecked = pref.getBoolean(NOTIFICATIONS, true);
        return isChecked;
    }

}
