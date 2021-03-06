package com.lukekorth.auto_fi.models;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Settings {

    public static SharedPreferences getPrefs(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static boolean autoConnectToWifi(Context context) {
        return getPrefs(context).getBoolean("auto_connect_to_wifi", true);
    }

    public static boolean bypassCaptivePortals(Context context) {
        return getPrefs(context).getBoolean("bypass_captive_portals", true);
    }

    public static boolean autoConnectToVpn(Context context) {
        return getPrefs(context).getBoolean("auto_connect_to_vpn", true);
    }
}
