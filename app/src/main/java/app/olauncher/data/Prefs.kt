package app.olauncher.data

import android.content.Context
import android.content.SharedPreferences
import android.view.Gravity
import androidx.appcompat.app.AppCompatDelegate
import android.util.Log
import java.io.File
import android.os.Environment

fun loadScriptsIntoPrefs(): MutableList<Array<String>> {
    val scriptList = mutableListOf<Array<String>>()
    Log.d("Prefs", "entered func")
    val scriptsDir = File(Environment.getExternalStorageDirectory(), "scripts")
    Log.d("Prefs", "scriptsDir: $scriptsDir")
    Log.d("Prefs", "scriptsDir.exists(): ${scriptsDir.exists()}")
    Log.d("Prefs", "scriptsDir.isDirectory: ${scriptsDir.isDirectory}")
    if (scriptsDir.exists() && scriptsDir.isDirectory) {

        scriptsDir.listFiles()?.forEach { item -> run {
            val path = item.absolutePath
            val name = item.name
            val scriptInfo = arrayOf(path,name)
            scriptList.add(scriptInfo)
        } }
        Log.d("Prefs", "scriptlist: ${scriptList[0][1]}")

    }
    return scriptList
}

class Prefs(context: Context) {
    private val PREFS_FILENAME = "app.olauncher"

    private val FIRST_OPEN = "FIRST_OPEN"
    private val FIRST_OPEN_TIME = "FIRST_OPEN_TIME"
    private val FIRST_SETTINGS_OPEN = "FIRST_SETTINGS_OPEN"
    private val FIRST_HIDE = "FIRST_HIDE"
    private val USER_STATE = "USER_STATE"
    private val LOCK_MODE = "LOCK_MODE"
    private val HOME_APPS_NUM = "HOME_APPS_NUM"
    private val AUTO_SHOW_KEYBOARD = "AUTO_SHOW_KEYBOARD"
    private val KEYBOARD_MESSAGE = "KEYBOARD_MESSAGE"
    private val DAILY_WALLPAPER = "DAILY_WALLPAPER"
    private val DAILY_WALLPAPER_URL = "DAILY_WALLPAPER_URL"
    private val WALLPAPER_UPDATED_DAY = "WALLPAPER_UPDATED_DAY"
    private val HOME_ALIGNMENT = "HOME_ALIGNMENT"
    private val HOME_BOTTOM_ALIGNMENT = "HOME_BOTTOM_ALIGNMENT"
    private val APP_LABEL_ALIGNMENT = "APP_LABEL_ALIGNMENT"
    private val STATUS_BAR = "STATUS_BAR"
    private val DATE_TIME_VISIBILITY = "DATE_TIME_VISIBILITY"
    private val SWIPE_LEFT_ENABLED = "SWIPE_LEFT_ENABLED"
    private val SWIPE_RIGHT_ENABLED = "SWIPE_RIGHT_ENABLED"
    private val SCREEN_TIMEOUT = "SCREEN_TIMEOUT"
    private val HIDDEN_APPS = "HIDDEN_APPS"
    private val HIDDEN_APPS_UPDATED = "HIDDEN_APPS_UPDATED"
    private val SHOW_HINT_COUNTER = "SHOW_HINT_COUNTER"
    private val APP_THEME = "APP_THEME"
    private val ABOUT_CLICKED = "ABOUT_CLICKED"
    private val RATE_CLICKED = "RATE_CLICKED"
    private val SHARE_SHOWN_TIME = "SHARE_SHOWN_TIME"
    private val SWIPE_DOWN_ACTION = "SWIPE_DOWN_ACTION"
    private val TEXT_SIZE_SCALE = "TEXT_SIZE_SCALE"
    private val HIDE_DIGITAL_WELLBEING = "HIDE_DIGITAL_WELLBEING"

    private val APP_NAME_1 = "APP_NAME_1"
    private val APP_NAME_2 = "APP_NAME_2"
    private val APP_NAME_3 = "APP_NAME_3"
    private val APP_NAME_4 = "APP_NAME_4"
    private val APP_NAME_5 = "APP_NAME_5"
    private val APP_NAME_6 = "APP_NAME_6"
    private val APP_NAME_7 = "APP_NAME_7"
    private val APP_NAME_8 = "APP_NAME_8"
    private val APP_NAME_9 = "APP_NAME_9"
    private val APP_NAME_10 = "APP_NAME_10"
    private val APP_NAME_11 = "APP_NAME_11"
    private val APP_NAME_12 = "APP_NAME_12"
    private val APP_PACKAGE_1 = "APP_PACKAGE_1"
    private val APP_PACKAGE_2 = "APP_PACKAGE_2"
    private val APP_PACKAGE_3 = "APP_PACKAGE_3"
    private val APP_PACKAGE_4 = "APP_PACKAGE_4"
    private val APP_PACKAGE_5 = "APP_PACKAGE_5"
    private val APP_PACKAGE_6 = "APP_PACKAGE_6"
    private val APP_PACKAGE_7 = "APP_PACKAGE_7"
    private val APP_PACKAGE_8 = "APP_PACKAGE_8"
    private val APP_PACKAGE_9 = "APP_PACKAGE_9"
    private val APP_PACKAGE_10 = "APP_PACKAGE_10"
    private val APP_PACKAGE_11 = "APP_PACKAGE_11"
    private val APP_PACKAGE_12 = "APP_PACKAGE_12"
    private val APP_ACTIVITY_CLASS_NAME_1 = "APP_ACTIVITY_CLASS_NAME_1"
    private val APP_ACTIVITY_CLASS_NAME_2 = "APP_ACTIVITY_CLASS_NAME_2"
    private val APP_ACTIVITY_CLASS_NAME_3 = "APP_ACTIVITY_CLASS_NAME_3"
    private val APP_ACTIVITY_CLASS_NAME_4 = "APP_ACTIVITY_CLASS_NAME_4"
    private val APP_ACTIVITY_CLASS_NAME_5 = "APP_ACTIVITY_CLASS_NAME_5"
    private val APP_ACTIVITY_CLASS_NAME_6 = "APP_ACTIVITY_CLASS_NAME_6"
    private val APP_ACTIVITY_CLASS_NAME_7 = "APP_ACTIVITY_CLASS_NAME_7"
    private val APP_ACTIVITY_CLASS_NAME_8 = "APP_ACTIVITY_CLASS_NAME_8"
    private val APP_ACTIVITY_CLASS_NAME_9 = "APP_ACTIVITY_CLASS_NAME_9"
    private val APP_ACTIVITY_CLASS_NAME_10 = "APP_ACTIVITY_CLASS_NAME_10"
    private val APP_ACTIVITY_CLASS_NAME_11 = "APP_ACTIVITY_CLASS_NAME_11"
    private val APP_ACTIVITY_CLASS_NAME_12 = "APP_ACTIVITY_CLASS_NAME_12"
    private val APP_USER_1 = "APP_USER_1"
    private val APP_USER_2 = "APP_USER_2"
    private val APP_USER_3 = "APP_USER_3"
    private val APP_USER_4 = "APP_USER_4"
    private val APP_USER_5 = "APP_USER_5"
    private val APP_USER_6 = "APP_USER_6"
    private val APP_USER_7 = "APP_USER_7"
    private val APP_USER_8 = "APP_USER_8"
    private val APP_USER_9 = "APP_USER_9"
    private val APP_USER_10 = "APP_USER_10"
    private val APP_USER_11 = "APP_USER_11"
    private val APP_USER_12 = "APP_USER_12"
    private val APP_URL_1 = "APP_URL_1"
    private val APP_URL_2 = "APP_URL_2"
    private val APP_URL_3 = "APP_URL_3"
    private val APP_URL_4 = "APP_URL_4"
    private val APP_URL_5 = "APP_URL_5"
    private val APP_URL_6 = "APP_URL_6"
    private val APP_URL_7 = "APP_URL_7"
    private val APP_URL_8 = "APP_URL_8"
    private val APP_URL_9 = "APP_URL_9"
    private val APP_URL_10 = "APP_URL_10"
    private val APP_URL_11 = "APP_URL_11"
    private val APP_URL_12 = "APP_URL_12"
    private val APP_BROWSER_1 = "APP_BROWSER_1"
    private val APP_BROWSER_2 = "APP_BROWSER_2"
    private val APP_BROWSER_3 = "APP_BROWSER_3"
    private val APP_BROWSER_4 = "APP_BROWSER_4"
    private val APP_BROWSER_5 = "APP_BROWSER_5"
    private val APP_BROWSER_6 = "APP_BROWSER_6"
    private val APP_BROWSER_7 = "APP_BROWSER_7"
    private val APP_BROWSER_8 = "APP_BROWSER_8"
    private val APP_BROWSER_9 = "APP_BROWSER_9"
    private val APP_BROWSER_10 = "APP_BROWSER_10"
    private val APP_BROWSER_11 = "APP_BROWSER_11"
    private val APP_BROWSER_12 = "APP_BROWSER_12"

    private val APP_NAME_SWIPE_LEFT = "APP_NAME_SWIPE_LEFT"
    private val APP_NAME_SWIPE_RIGHT = "APP_NAME_SWIPE_RIGHT"
    private val APP_PACKAGE_SWIPE_LEFT = "APP_PACKAGE_SWIPE_LEFT"
    private val APP_PACKAGE_SWIPE_RIGHT = "APP_PACKAGE_SWIPE_RIGHT"
    private val APP_ACTIVITY_CLASS_NAME_SWIPE_LEFT = "APP_ACTIVITY_CLASS_NAME_SWIPE_LEFT"
    private val APP_ACTIVITY_CLASS_NAME_SWIPE_RIGHT = "APP_ACTIVITY_CLASS_NAME_SWIPE_RIGHT"
    private val APP_USER_SWIPE_LEFT = "APP_USER_SWIPE_LEFT"
    private val APP_USER_SWIPE_RIGHT = "APP_USER_SWIPE_RIGHT"
    private val APP_URL_SWIPE_LEFT = "APP_URL_SWIPE_LEFT"
    private val APP_URL_SWIPE_RIGHT = "APP_URL_SWIPE_RIGHT"
    private val APP_BROWSER_SWIPE_LEFT = "APP_BROWSER_SWIPE_LEFT"
    private val APP_BROWSER_SWIPE_RIGHT = "APP_BROWSER_SWIPE_RIGHT"
    private val CLOCK_APP_PACKAGE = "CLOCK_APP_PACKAGE"
    private val CLOCK_APP_USER = "CLOCK_APP_USER"
    private val CLOCK_APP_CLASS_NAME = "CLOCK_APP_CLASS_NAME"
    private val CLOCK_APP_URL = "CLOCK_APP_URL"
    private val CLOCK_APP_BROWSER = "CLOCK_APP_BROWSER"
    private val CALENDAR_APP_PACKAGE = "CALENDAR_APP_PACKAGE"
    private val CALENDAR_APP_USER = "CALENDAR_APP_USER"
    private val CALENDAR_APP_CLASS_NAME = "CALENDAR_APP_CLASS_NAME"
    private val CALENDAR_APP_URL = "CALENDAR_APP_URL"
    private val CALENDAR_APP_BROWSER = "CALENDAR_APP_BROWSER"

    private val WEBSITES = "WEBSITES"
    private val SCRIPTS = "SCRIPTS"


    private val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, 0);

    var firstOpen: Boolean
        get() = prefs.getBoolean(FIRST_OPEN, true)
        set(value) = prefs.edit().putBoolean(FIRST_OPEN, value).apply()

    var firstOpenTime: Long
        get() = prefs.getLong(FIRST_OPEN_TIME, 0L)
        set(value) = prefs.edit().putLong(FIRST_OPEN_TIME, value).apply()

    var firstSettingsOpen: Boolean
        get() = prefs.getBoolean(FIRST_SETTINGS_OPEN, true)
        set(value) = prefs.edit().putBoolean(FIRST_SETTINGS_OPEN, value).apply()

    var firstHide: Boolean
        get() = prefs.getBoolean(FIRST_HIDE, true)
        set(value) = prefs.edit().putBoolean(FIRST_HIDE, value).apply()

    var userState: String
        get() = prefs.getString(USER_STATE, Constants.UserState.START).toString()
        set(value) = prefs.edit().putString(USER_STATE, value).apply()

    var lockModeOn: Boolean
        get() = prefs.getBoolean(LOCK_MODE, false)
        set(value) = prefs.edit().putBoolean(LOCK_MODE, value).apply()

    var autoShowKeyboard: Boolean
        get() = prefs.getBoolean(AUTO_SHOW_KEYBOARD, true)
        set(value) = prefs.edit().putBoolean(AUTO_SHOW_KEYBOARD, value).apply()

    var keyboardMessageShown: Boolean
        get() = prefs.getBoolean(KEYBOARD_MESSAGE, false)
        set(value) = prefs.edit().putBoolean(KEYBOARD_MESSAGE, value).apply()

    var dailyWallpaper: Boolean
        get() = prefs.getBoolean(DAILY_WALLPAPER, false)
        set(value) = prefs.edit().putBoolean(DAILY_WALLPAPER, value).apply()

    var dailyWallpaperUrl: String
        get() = prefs.getString(DAILY_WALLPAPER_URL, "").toString()
        set(value) = prefs.edit().putString(DAILY_WALLPAPER_URL, value).apply()

    var homeAppsNum: Int
        get() = prefs.getInt(HOME_APPS_NUM, 4)
        set(value) = prefs.edit().putInt(HOME_APPS_NUM, value).apply()

    var homeAlignment: Int
        get() = prefs.getInt(HOME_ALIGNMENT, Gravity.START)
        set(value) = prefs.edit().putInt(HOME_ALIGNMENT, value).apply()

    var homeBottomAlignment: Boolean
        get() = prefs.getBoolean(HOME_BOTTOM_ALIGNMENT, false)
        set(value) = prefs.edit().putBoolean(HOME_BOTTOM_ALIGNMENT, value).apply()

    var appLabelAlignment: Int
        get() = prefs.getInt(APP_LABEL_ALIGNMENT, Gravity.START)
        set(value) = prefs.edit().putInt(APP_LABEL_ALIGNMENT, value).apply()

    var showStatusBar: Boolean
        get() = prefs.getBoolean(STATUS_BAR, false)
        set(value) = prefs.edit().putBoolean(STATUS_BAR, value).apply()

    var dateTimeVisibility: Int
        get() = prefs.getInt(DATE_TIME_VISIBILITY, Constants.DateTime.ON)
        set(value) = prefs.edit().putInt(DATE_TIME_VISIBILITY, value).apply()

    var swipeLeftEnabled: Boolean
        get() = prefs.getBoolean(SWIPE_LEFT_ENABLED, true)
        set(value) = prefs.edit().putBoolean(SWIPE_LEFT_ENABLED, value).apply()

    var swipeRightEnabled: Boolean
        get() = prefs.getBoolean(SWIPE_RIGHT_ENABLED, true)
        set(value) = prefs.edit().putBoolean(SWIPE_RIGHT_ENABLED, value).apply()

    var appTheme: Int
        get() = prefs.getInt(APP_THEME, AppCompatDelegate.MODE_NIGHT_YES)
        set(value) = prefs.edit().putInt(APP_THEME, value).apply()

    var textSizeScale: Float
        get() = prefs.getFloat(TEXT_SIZE_SCALE, 1.0f)
        set(value) = prefs.edit().putFloat(TEXT_SIZE_SCALE, value).apply()

    var hideDigitalWellbeing: Boolean
        get() = prefs.getBoolean(HIDE_DIGITAL_WELLBEING, false)
        set(value) = prefs.edit().putBoolean(HIDE_DIGITAL_WELLBEING, value).apply()

    var screenTimeout: Int
        get() = prefs.getInt(SCREEN_TIMEOUT, 30000) // Default: 30 seconds
        set(value) = prefs.edit().putInt(SCREEN_TIMEOUT, value).apply()

    var hiddenApps: MutableSet<String>
        get() = prefs.getStringSet(HIDDEN_APPS, mutableSetOf()) as MutableSet<String>
        set(value) = prefs.edit().putStringSet(HIDDEN_APPS, value).apply()

    var hiddenAppsUpdated: Boolean
        get() = prefs.getBoolean(HIDDEN_APPS_UPDATED, false)
        set(value) = prefs.edit().putBoolean(HIDDEN_APPS_UPDATED, value).apply()

    var toShowHintCounter: Int
        get() = prefs.getInt(SHOW_HINT_COUNTER, 1)
        set(value) = prefs.edit().putInt(SHOW_HINT_COUNTER, value).apply()

    var aboutClicked: Boolean
        get() = prefs.getBoolean(ABOUT_CLICKED, false)
        set(value) = prefs.edit().putBoolean(ABOUT_CLICKED, value).apply()

    var rateClicked: Boolean
        get() = prefs.getBoolean(RATE_CLICKED, false)
        set(value) = prefs.edit().putBoolean(RATE_CLICKED, value).apply()

    var shareShownTime: Long
        get() = prefs.getLong(SHARE_SHOWN_TIME, 0L)
        set(value) = prefs.edit().putLong(SHARE_SHOWN_TIME, value).apply()

    var swipeDownAction: Int
        get() = prefs.getInt(SWIPE_DOWN_ACTION, Constants.SwipeDownAction.NOTIFICATIONS)
        set(value) = prefs.edit().putInt(SWIPE_DOWN_ACTION, value).apply()

    var appName1: String
        get() = prefs.getString(APP_NAME_1, "").toString()
        set(value) = prefs.edit().putString(APP_NAME_1, value).apply()

    var appName2: String
        get() = prefs.getString(APP_NAME_2, "").toString()
        set(value) = prefs.edit().putString(APP_NAME_2, value).apply()

    var appName3: String
        get() = prefs.getString(APP_NAME_3, "").toString()
        set(value) = prefs.edit().putString(APP_NAME_3, value).apply()

    var appName4: String
        get() = prefs.getString(APP_NAME_4, "").toString()
        set(value) = prefs.edit().putString(APP_NAME_4, value).apply()

    var appName5: String
        get() = prefs.getString(APP_NAME_5, "").toString()
        set(value) = prefs.edit().putString(APP_NAME_5, value).apply()

    var appName6: String
        get() = prefs.getString(APP_NAME_6, "").toString()
        set(value) = prefs.edit().putString(APP_NAME_6, value).apply()

    var appName7: String
        get() = prefs.getString(APP_NAME_7, "").toString()
        set(value) = prefs.edit().putString(APP_NAME_7, value).apply()

    var appName8: String
        get() = prefs.getString(APP_NAME_8, "").toString()
        set(value) = prefs.edit().putString(APP_NAME_8, value).apply()

    var appName9: String
        get() = prefs.getString(APP_NAME_9, "").toString()
        set(value) = prefs.edit().putString(APP_NAME_9, value).apply()

    var appName10: String
        get() = prefs.getString(APP_NAME_10, "").toString()
        set(value) = prefs.edit().putString(APP_NAME_10, value).apply()

    var appName11: String
        get() = prefs.getString(APP_NAME_11, "").toString()
        set(value) = prefs.edit().putString(APP_NAME_11, value).apply()

    var appName12: String
        get() = prefs.getString(APP_NAME_12, "").toString()
        set(value) = prefs.edit().putString(APP_NAME_12, value).apply()

    var appPackage1: String
        get() = prefs.getString(APP_PACKAGE_1, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_1, value).apply()

    var appPackage2: String
        get() = prefs.getString(APP_PACKAGE_2, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_2, value).apply()

    var appPackage3: String
        get() = prefs.getString(APP_PACKAGE_3, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_3, value).apply()

    var appPackage4: String
        get() = prefs.getString(APP_PACKAGE_4, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_4, value).apply()

    var appPackage5: String
        get() = prefs.getString(APP_PACKAGE_5, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_5, value).apply()

    var appPackage6: String
        get() = prefs.getString(APP_PACKAGE_6, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_6, value).apply()

    var appPackage7: String
        get() = prefs.getString(APP_PACKAGE_7, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_7, value).apply()

    var appPackage8: String
        get() = prefs.getString(APP_PACKAGE_8, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_8, value).apply()

    var appPackage9: String
        get() = prefs.getString(APP_PACKAGE_9, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_9, value).apply()

    var appPackage10: String
        get() = prefs.getString(APP_PACKAGE_10, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_10, value).apply()

    var appPackage11: String
        get() = prefs.getString(APP_PACKAGE_11, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_11, value).apply()

    var appPackage12: String
        get() = prefs.getString(APP_PACKAGE_12, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_12, value).apply()

    var appActivityClassName1: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_1, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_1, value).apply()

    var appActivityClassName2: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_2, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_2, value).apply()

    var appActivityClassName3: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_3, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_3, value).apply()

    var appActivityClassName4: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_4, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_4, value).apply()

    var appActivityClassName5: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_5, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_5, value).apply()

    var appActivityClassName6: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_6, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_6, value).apply()

    var appActivityClassName7: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_7, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_7, value).apply()

    var appActivityClassName8: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_8, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_8, value).apply()

    var appActivityClassName9: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_9, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_9, value).apply()

    var appActivityClassName10: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_10, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_10, value).apply()

    var appActivityClassName11: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_11, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_11, value).apply()

    var appActivityClassName12: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_12, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_12, value).apply()

    var appUser1: String
        get() = prefs.getString(APP_USER_1, "").toString()
        set(value) = prefs.edit().putString(APP_USER_1, value).apply()

    var appUser2: String
        get() = prefs.getString(APP_USER_2, "").toString()
        set(value) = prefs.edit().putString(APP_USER_2, value).apply()

    var appUser3: String
        get() = prefs.getString(APP_USER_3, "").toString()
        set(value) = prefs.edit().putString(APP_USER_3, value).apply()

    var appUser4: String
        get() = prefs.getString(APP_USER_4, "").toString()
        set(value) = prefs.edit().putString(APP_USER_4, value).apply()

    var appUser5: String
        get() = prefs.getString(APP_USER_5, "").toString()
        set(value) = prefs.edit().putString(APP_USER_5, value).apply()

    var appUser6: String
        get() = prefs.getString(APP_USER_6, "").toString()
        set(value) = prefs.edit().putString(APP_USER_6, value).apply()

    var appUser7: String
        get() = prefs.getString(APP_USER_7, "").toString()
        set(value) = prefs.edit().putString(APP_USER_7, value).apply()

    var appUser8: String
        get() = prefs.getString(APP_USER_8, "").toString()
        set(value) = prefs.edit().putString(APP_USER_8, value).apply()

    var appUser9: String
        get() = prefs.getString(APP_USER_9, "").toString()
        set(value) = prefs.edit().putString(APP_USER_9, value).apply()

    var appUser10: String
        get() = prefs.getString(APP_USER_10, "").toString()
        set(value) = prefs.edit().putString(APP_USER_10, value).apply()

    var appUser11: String
        get() = prefs.getString(APP_USER_11, "").toString()
        set(value) = prefs.edit().putString(APP_USER_11, value).apply()

    var appUser12: String
        get() = prefs.getString(APP_USER_12, "").toString()
        set(value) = prefs.edit().putString(APP_USER_12, value).apply()

    var appUrl1: String
        get() = prefs.getString(APP_URL_1, "").toString()
        set(value) = prefs.edit().putString(APP_URL_1, value).apply()

    var appUrl2: String
        get() = prefs.getString(APP_URL_2, "").toString()
        set(value) = prefs.edit().putString(APP_URL_2, value).apply()

    var appUrl3: String
        get() = prefs.getString(APP_URL_3, "").toString()
        set(value) = prefs.edit().putString(APP_URL_3, value).apply()

    var appUrl4: String
        get() = prefs.getString(APP_URL_4, "").toString()
        set(value) = prefs.edit().putString(APP_URL_4, value).apply()

    var appUrl5: String
        get() = prefs.getString(APP_URL_5, "").toString()
        set(value) = prefs.edit().putString(APP_URL_5, value).apply()

    var appUrl6: String
        get() = prefs.getString(APP_URL_6, "").toString()
        set(value) = prefs.edit().putString(APP_URL_6, value).apply()

    var appUrl7: String
        get() = prefs.getString(APP_URL_7, "").toString()
        set(value) = prefs.edit().putString(APP_URL_7, value).apply()

    var appUrl8: String
        get() = prefs.getString(APP_URL_8, "").toString()
        set(value) = prefs.edit().putString(APP_URL_8, value).apply()

    var appUrl9: String
        get() = prefs.getString(APP_URL_9, "").toString()
        set(value) = prefs.edit().putString(APP_URL_9, value).apply()

    var appUrl10: String
        get() = prefs.getString(APP_URL_10, "").toString()
        set(value) = prefs.edit().putString(APP_URL_10, value).apply()

    var appUrl11: String
        get() = prefs.getString(APP_URL_11, "").toString()
        set(value) = prefs.edit().putString(APP_URL_11, value).apply()

    var appUrl12: String
        get() = prefs.getString(APP_URL_12, "").toString()
        set(value) = prefs.edit().putString(APP_URL_12, value).apply()

    var appBrowser1: String
        get() = prefs.getString(APP_BROWSER_1, "").toString()
        set(value) = prefs.edit().putString(APP_BROWSER_1, value).apply()

    var appBrowser2: String
        get() = prefs.getString(APP_BROWSER_2, "").toString()
        set(value) = prefs.edit().putString(APP_BROWSER_2, value).apply()

    var appBrowser3: String
        get() = prefs.getString(APP_BROWSER_3, "").toString()
        set(value) = prefs.edit().putString(APP_BROWSER_3, value).apply()

    var appBrowser4: String
        get() = prefs.getString(APP_BROWSER_4, "").toString()
        set(value) = prefs.edit().putString(APP_BROWSER_4, value).apply()

    var appBrowser5: String
        get() = prefs.getString(APP_BROWSER_5, "").toString()
        set(value) = prefs.edit().putString(APP_BROWSER_5, value).apply()

    var appBrowser6: String
        get() = prefs.getString(APP_BROWSER_6, "").toString()
        set(value) = prefs.edit().putString(APP_BROWSER_6, value).apply()

    var appBrowser7: String
        get() = prefs.getString(APP_BROWSER_7, "").toString()
        set(value) = prefs.edit().putString(APP_BROWSER_7, value).apply()

    var appBrowser8: String
        get() = prefs.getString(APP_BROWSER_8, "").toString()
        set(value) = prefs.edit().putString(APP_BROWSER_8, value).apply()

    var appBrowser9: String
        get() = prefs.getString(APP_BROWSER_9, "").toString()
        set(value) = prefs.edit().putString(APP_BROWSER_9, value).apply()

    var appBrowser10: String
        get() = prefs.getString(APP_BROWSER_10, "").toString()
        set(value) = prefs.edit().putString(APP_BROWSER_10, value).apply()

    var appBrowser11: String
        get() = prefs.getString(APP_BROWSER_11, "").toString()
        set(value) = prefs.edit().putString(APP_BROWSER_11, value).apply()

    var appBrowser12: String
        get() = prefs.getString(APP_BROWSER_12, "").toString()
        set(value) = prefs.edit().putString(APP_BROWSER_12, value).apply()

    var appNameSwipeLeft: String
        get() = prefs.getString(APP_NAME_SWIPE_LEFT, "Camera").toString()
        set(value) = prefs.edit().putString(APP_NAME_SWIPE_LEFT, value).apply()

    var appNameSwipeRight: String
        get() = prefs.getString(APP_NAME_SWIPE_RIGHT, "Phone").toString()
        set(value) = prefs.edit().putString(APP_NAME_SWIPE_RIGHT, value).apply()

    var appPackageSwipeLeft: String
        get() = prefs.getString(APP_PACKAGE_SWIPE_LEFT, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_SWIPE_LEFT, value).apply()

    var appActivityClassNameSwipeLeft: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_SWIPE_LEFT, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_SWIPE_LEFT, value).apply()

    var appPackageSwipeRight: String
        get() = prefs.getString(APP_PACKAGE_SWIPE_RIGHT, "").toString()
        set(value) = prefs.edit().putString(APP_PACKAGE_SWIPE_RIGHT, value).apply()

    var appActivityClassNameRight: String?
        get() = prefs.getString(APP_ACTIVITY_CLASS_NAME_SWIPE_RIGHT, "").toString()
        set(value) = prefs.edit().putString(APP_ACTIVITY_CLASS_NAME_SWIPE_RIGHT, value).apply()

    var appUserSwipeLeft: String
        get() = prefs.getString(APP_USER_SWIPE_LEFT, "").toString()
        set(value) = prefs.edit().putString(APP_USER_SWIPE_LEFT, value).apply()

    var appUserSwipeRight: String
        get() = prefs.getString(APP_USER_SWIPE_RIGHT, "").toString()
        set(value) = prefs.edit().putString(APP_USER_SWIPE_RIGHT, value).apply()

    var appUrlSwipeLeft : String
        get() = prefs.getString(APP_URL_SWIPE_LEFT, "").toString()
        set(value) = prefs.edit().putString(APP_URL_SWIPE_LEFT, value).apply()
    var appUrlSwipeRight : String
        get() = prefs.getString(APP_URL_SWIPE_RIGHT, "").toString()
        set(value) = prefs.edit().putString(APP_URL_SWIPE_RIGHT, value).apply()

    var appBrowserSwipeLeft : String
        get() = prefs.getString(APP_BROWSER_SWIPE_LEFT, "").toString()
        set(value) = prefs.edit().putString(APP_BROWSER_SWIPE_LEFT, value).apply()
    var appBrowserSwipeRight : String
        get() = prefs.getString(APP_BROWSER_SWIPE_RIGHT, "").toString()
        set(value) = prefs.edit().putString(APP_BROWSER_SWIPE_RIGHT, value).apply()

    var clockAppPackage: String
        get() = prefs.getString(CLOCK_APP_PACKAGE, "").toString()
        set(value) = prefs.edit().putString(CLOCK_APP_PACKAGE, value).apply()

    var clockAppUser: String
        get() = prefs.getString(CLOCK_APP_USER, "").toString()
        set(value) = prefs.edit().putString(CLOCK_APP_USER, value).apply()

    var clockAppClassName: String?
        get() = prefs.getString(CLOCK_APP_CLASS_NAME, "").toString()
        set(value) = prefs.edit().putString(CLOCK_APP_CLASS_NAME, value).apply()

    var clockAppUrl: String
        get() = prefs.getString(CLOCK_APP_URL, "").toString()
        set(value) = prefs.edit().putString(CLOCK_APP_URL, value).apply()

    var clockAppBrowser: String
        get() = prefs.getString(CLOCK_APP_BROWSER, "").toString()
        set(value) = prefs.edit().putString(CLOCK_APP_BROWSER, value).apply()

    var calendarAppPackage: String
        get() = prefs.getString(CALENDAR_APP_PACKAGE, "").toString()
        set(value) = prefs.edit().putString(CALENDAR_APP_PACKAGE, value).apply()

    var calendarAppUser: String
        get() = prefs.getString(CALENDAR_APP_USER, "").toString()
        set(value) = prefs.edit().putString(CALENDAR_APP_USER, value).apply()

    var calendarAppClassName: String?
        get() = prefs.getString(CALENDAR_APP_CLASS_NAME, "").toString()
        set(value) = prefs.edit().putString(CALENDAR_APP_CLASS_NAME, value).apply()

    var calendarAppUrl: String
        get() = prefs.getString(CALENDAR_APP_URL, "").toString()
        set(value) = prefs.edit().putString(CALENDAR_APP_URL, value).apply()

    var calendarAppBrowser: String
        get() = prefs.getString(CALENDAR_APP_BROWSER, "").toString()
        set(value) = prefs.edit().putString(CALENDAR_APP_BROWSER, value).apply()

    var websites: MutableSet<String>
        get() = prefs.getStringSet(WEBSITES, mutableSetOf()) as MutableSet<String>
        set(value) = prefs.edit().putStringSet(WEBSITES, value).apply()

    var scripts: MutableSet<String>
        get() = prefs.getStringSet(SCRIPTS, mutableSetOf()) as MutableSet<String>
        set(value) = prefs.edit().putStringSet(SCRIPTS, value).apply()

    fun getAppName(location: Int): String {
        return when (location) {
            1 -> prefs.getString(APP_NAME_1, "").toString()
            2 -> prefs.getString(APP_NAME_2, "").toString()
            3 -> prefs.getString(APP_NAME_3, "").toString()
            4 -> prefs.getString(APP_NAME_4, "").toString()
            5 -> prefs.getString(APP_NAME_5, "").toString()
            6 -> prefs.getString(APP_NAME_6, "").toString()
            7 -> prefs.getString(APP_NAME_7, "").toString()
            8 -> prefs.getString(APP_NAME_8, "").toString()
            9 -> prefs.getString(APP_NAME_9, "").toString()
            10 -> prefs.getString(APP_NAME_10, "").toString()
            11 -> prefs.getString(APP_NAME_11, "").toString()
            12 -> prefs.getString(APP_NAME_12, "").toString()
            else -> ""
        }
    }

    fun getAppPackage(location: Int): String {
        return when (location) {
            1 -> prefs.getString(APP_PACKAGE_1, "").toString()
            2 -> prefs.getString(APP_PACKAGE_2, "").toString()
            3 -> prefs.getString(APP_PACKAGE_3, "").toString()
            4 -> prefs.getString(APP_PACKAGE_4, "").toString()
            5 -> prefs.getString(APP_PACKAGE_5, "").toString()
            6 -> prefs.getString(APP_PACKAGE_6, "").toString()
            7 -> prefs.getString(APP_PACKAGE_7, "").toString()
            8 -> prefs.getString(APP_PACKAGE_8, "").toString()
            9 -> prefs.getString(APP_PACKAGE_9, "").toString()
            10 -> prefs.getString(APP_PACKAGE_10, "").toString()
            11 -> prefs.getString(APP_PACKAGE_11, "").toString()
            12 -> prefs.getString(APP_PACKAGE_12, "").toString()
            else -> ""
        }
    }

    fun getAppActivityClassName(location: Int): String {
        return when (location) {
            1 -> prefs.getString(APP_ACTIVITY_CLASS_NAME_1, "").toString()
            2 -> prefs.getString(APP_ACTIVITY_CLASS_NAME_2, "").toString()
            3 -> prefs.getString(APP_ACTIVITY_CLASS_NAME_3, "").toString()
            4 -> prefs.getString(APP_ACTIVITY_CLASS_NAME_4, "").toString()
            5 -> prefs.getString(APP_ACTIVITY_CLASS_NAME_5, "").toString()
            6 -> prefs.getString(APP_ACTIVITY_CLASS_NAME_6, "").toString()
            7 -> prefs.getString(APP_ACTIVITY_CLASS_NAME_7, "").toString()
            8 -> prefs.getString(APP_ACTIVITY_CLASS_NAME_8, "").toString()
            9 -> prefs.getString(APP_ACTIVITY_CLASS_NAME_9, "").toString()
            10 -> prefs.getString(APP_ACTIVITY_CLASS_NAME_10, "").toString()
            11 -> prefs.getString(APP_ACTIVITY_CLASS_NAME_11, "").toString()
            12 -> prefs.getString(APP_ACTIVITY_CLASS_NAME_12, "").toString()
            else -> ""
        }
    }

    fun getAppUser(location: Int): String {
        return when (location) {
            1 -> prefs.getString(APP_USER_1, "").toString()
            2 -> prefs.getString(APP_USER_2, "").toString()
            3 -> prefs.getString(APP_USER_3, "").toString()
            4 -> prefs.getString(APP_USER_4, "").toString()
            5 -> prefs.getString(APP_USER_5, "").toString()
            6 -> prefs.getString(APP_USER_6, "").toString()
            7 -> prefs.getString(APP_USER_7, "").toString()
            8 -> prefs.getString(APP_USER_8, "").toString()
            9 -> prefs.getString(APP_USER_9, "").toString()
            10 -> prefs.getString(APP_USER_10, "").toString()
            11 -> prefs.getString(APP_USER_11, "").toString()
            12 -> prefs.getString(APP_USER_12, "").toString()
            else -> ""
        }
    }
    fun getAppUrl(location: Int): String {
        return when (location) {
            1 -> prefs.getString(APP_URL_1, "").toString()
            2 -> prefs.getString(APP_URL_2, "").toString()
            3 -> prefs.getString(APP_URL_3, "").toString()
            4 -> prefs.getString(APP_URL_4, "").toString()
            5 -> prefs.getString(APP_URL_5, "").toString()
            6 -> prefs.getString(APP_URL_6, "").toString()
            7 -> prefs.getString(APP_URL_7, "").toString()
            8 -> prefs.getString(APP_URL_8, "").toString()
            9 -> prefs.getString(APP_URL_9, "").toString()
            10 -> prefs.getString(APP_URL_10, "").toString()
            11 -> prefs.getString(APP_URL_11, "").toString()
            12 -> prefs.getString(APP_URL_12, "").toString()
            else -> ""
        }
    }
    fun getAppBrowser(location: Int): String {
        return when (location) {
            1 -> prefs.getString(APP_BROWSER_1, "").toString()
            2 -> prefs.getString(APP_BROWSER_2, "").toString()
            3 -> prefs.getString(APP_BROWSER_3, "").toString()
            4 -> prefs.getString(APP_BROWSER_4, "").toString()
            5 -> prefs.getString(APP_BROWSER_5, "").toString()
            6 -> prefs.getString(APP_BROWSER_6, "").toString()
            7 -> prefs.getString(APP_BROWSER_7, "").toString()
            8 -> prefs.getString(APP_BROWSER_8, "").toString()
            9 -> prefs.getString(APP_BROWSER_9, "").toString()
            10 -> prefs.getString(APP_BROWSER_10, "").toString()
            11 -> prefs.getString(APP_BROWSER_11, "").toString()
            12 -> prefs.getString(APP_BROWSER_12, "").toString()
            else -> ""
        }
    }
    fun getAppRenameLabel(appPackage: String): String = prefs.getString(appPackage, "").toString()

    fun setAppRenameLabel(appPackage: String, renameLabel: String) = prefs.edit().putString(appPackage, renameLabel).apply()

    fun getWebsiteRenameLabel(url: String?): String = prefs.getString(url, "").toString()
    fun setWebsiteRenameLabel(url: String?, renameLabel: String) = prefs.edit().putString(url, renameLabel).apply()

    fun getBrowserOption(url: String?): String = prefs.getString(url+"browser", "").toString()
    fun setBrowserOption(url: String?, browserPackage: String) = prefs.edit().putString(url+"browser", browserPackage).apply()


}

