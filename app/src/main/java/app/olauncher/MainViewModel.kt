package app.olauncher

import android.app.Application
import android.content.ComponentName
import android.content.Context
import android.content.pm.LauncherApps
import android.os.UserHandle
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.work.BackoffPolicy
import androidx.work.Constraints
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.NetworkType
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import app.olauncher.data.AppModel
import app.olauncher.data.Constants
import app.olauncher.data.Prefs
import app.olauncher.helper.SingleLiveEvent
import app.olauncher.helper.WallpaperWorker
import app.olauncher.helper.getAppsList
import app.olauncher.helper.isOlauncherDefault
import app.olauncher.helper.showToast
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val appContext by lazy { application.applicationContext }
    private val prefs = Prefs(appContext)

    val firstOpen = MutableLiveData<Boolean>()
    val refreshHome = MutableLiveData<Boolean>()
    val toggleDateTime = MutableLiveData<Unit>()
    val updateSwipeApps = MutableLiveData<Any>()
    val appList = MutableLiveData<List<AppModel>?>()
    val hiddenApps = MutableLiveData<List<AppModel>?>()
    val isOlauncherDefault = MutableLiveData<Boolean>()
    val launcherResetFailed = MutableLiveData<Boolean>()
    val homeAppAlignment = MutableLiveData<Int>()

    val showDialog = SingleLiveEvent<String>()
    val checkForMessages = SingleLiveEvent<Unit?>()
    val resetLauncherLiveData = SingleLiveEvent<Unit?>()

    fun selectedApp(appModel: AppModel, flag: Int) {
        when (flag) {
            Constants.FLAG_LAUNCH_APP -> {
                launchApp(appModel.appPackage, appModel.activityClassName, appModel.user)
            }
            Constants.FLAG_HIDDEN_APPS -> {
                launchApp(appModel.appPackage, appModel.activityClassName, appModel.user)
            }

            Constants.FLAG_SET_HOME_APP_1 -> {
                Log.d("Prefs", "selected app: $appModel")
                prefs.appName1 = appModel.appLabel
                prefs.appPackage1 = appModel.appPackage
                prefs.appUser1 = appModel.user.toString()
                prefs.appActivityClassName1 = appModel.activityClassName
                prefs.appUrl1 = appModel.url
                prefs.appBrowser1 = appModel.browser
                refreshHome(false)
            }

            Constants.FLAG_SET_HOME_APP_2 -> {
                prefs.appName2 = appModel.appLabel
                prefs.appPackage2 = appModel.appPackage
                prefs.appUser2 = appModel.user.toString()
                prefs.appActivityClassName2 = appModel.activityClassName
                prefs.appUrl2 = appModel.url
                prefs.appBrowser2 = appModel.browser
                refreshHome(false)
            }

            Constants.FLAG_SET_HOME_APP_3 -> {
                prefs.appName3 = appModel.appLabel
                prefs.appPackage3 = appModel.appPackage
                prefs.appUser3 = appModel.user.toString()
                prefs.appActivityClassName3 = appModel.activityClassName
                prefs.appUrl3 = appModel.url
                prefs.appBrowser3 = appModel.browser

                refreshHome(false)
            }

            Constants.FLAG_SET_HOME_APP_4 -> {
                prefs.appName4 = appModel.appLabel
                prefs.appPackage4 = appModel.appPackage
                prefs.appUser4 = appModel.user.toString()
                prefs.appActivityClassName4 = appModel.activityClassName
                prefs.appUrl4 = appModel.url
                prefs.appBrowser4 = appModel.browser
                refreshHome(false)
            }

            Constants.FLAG_SET_HOME_APP_5 -> {
                prefs.appName5 = appModel.appLabel
                prefs.appPackage5 = appModel.appPackage
                prefs.appUser5 = appModel.user.toString()
                prefs.appActivityClassName5 = appModel.activityClassName
                prefs.appUrl5 = appModel.url
                prefs.appBrowser5 = appModel.browser
                refreshHome(false)
            }

            Constants.FLAG_SET_HOME_APP_6 -> {
                prefs.appName6 = appModel.appLabel
                prefs.appPackage6 = appModel.appPackage
                prefs.appUser6 = appModel.user.toString()
                prefs.appActivityClassName6 = appModel.activityClassName
                prefs.appUrl6 = appModel.url
                prefs.appBrowser6 = appModel.browser
                refreshHome(false)
            }

            Constants.FLAG_SET_HOME_APP_7 -> {
                prefs.appName7 = appModel.appLabel
                prefs.appPackage7 = appModel.appPackage
                prefs.appUser7 = appModel.user.toString()
                prefs.appActivityClassName7 = appModel.activityClassName
                prefs.appUrl7 = appModel.url
                prefs.appBrowser7 = appModel.browser
                refreshHome(false)
            }

            Constants.FLAG_SET_HOME_APP_8 -> {
                prefs.appName8 = appModel.appLabel
                prefs.appPackage8 = appModel.appPackage
                prefs.appUser8 = appModel.user.toString()
                prefs.appActivityClassName8 = appModel.activityClassName
                prefs.appUrl8 = appModel.url
                prefs.appBrowser8 = appModel.browser
                refreshHome(false)
            }

            Constants.FLAG_SET_HOME_APP_9 -> {
                prefs.appName9 = appModel.appLabel
                prefs.appPackage9 = appModel.appPackage
                prefs.appUser9 = appModel.user.toString()
                prefs.appActivityClassName9 = appModel.activityClassName
                prefs.appUrl9 = appModel.url
                prefs.appBrowser9 = appModel.browser
                refreshHome(false)
            }

            Constants.FLAG_SET_HOME_APP_10 -> {
                prefs.appName10 = appModel.appLabel
                prefs.appPackage10 = appModel.appPackage
                prefs.appUser10 = appModel.user.toString()
                prefs.appActivityClassName10 = appModel.activityClassName
                prefs.appUrl10 = appModel.url
                prefs.appBrowser10 = appModel.browser
                refreshHome(false)
            }

            Constants.FLAG_SET_HOME_APP_11 -> {
                prefs.appName11 = appModel.appLabel
                prefs.appPackage11 = appModel.appPackage
                prefs.appUser11 = appModel.user.toString()
                prefs.appActivityClassName11 = appModel.activityClassName
                prefs.appUrl11 = appModel.url
                prefs.appBrowser11 = appModel.browser
                refreshHome(false)
            }

            Constants.FLAG_SET_HOME_APP_12 -> {
                prefs.appName12 = appModel.appLabel
                prefs.appPackage12 = appModel.appPackage
                prefs.appUser12 = appModel.user.toString()
                prefs.appActivityClassName12 = appModel.activityClassName
                prefs.appUrl12 = appModel.url
                prefs.appBrowser12 = appModel.browser
                refreshHome(false)
            }

            Constants.FLAG_SET_SWIPE_LEFT_APP -> {
                prefs.appNameSwipeLeft = appModel.appLabel
                prefs.appPackageSwipeLeft = appModel.appPackage
                prefs.appUserSwipeLeft = appModel.user.toString()
                prefs.appActivityClassNameSwipeLeft = appModel.activityClassName
                prefs.appUrlSwipeLeft = appModel.url
                prefs.appBrowserSwipeLeft = appModel.browser
                updateSwipeApps()
            }

            Constants.FLAG_SET_SWIPE_RIGHT_APP -> {
                prefs.appNameSwipeRight = appModel.appLabel
                prefs.appPackageSwipeRight = appModel.appPackage
                prefs.appUserSwipeRight = appModel.user.toString()
                prefs.appActivityClassNameRight = appModel.activityClassName
                prefs.appUrlSwipeRight = appModel.url
                prefs.appBrowserSwipeRight = appModel.browser
                updateSwipeApps()
            }

            Constants.FLAG_SET_CLOCK_APP -> {
                prefs.clockAppPackage = appModel.appPackage
                prefs.clockAppUser = appModel.user.toString()
                prefs.clockAppClassName = appModel.activityClassName
                prefs.clockAppUrl = appModel.url
                prefs.clockAppBrowser = appModel.browser
            }

            Constants.FLAG_SET_CALENDAR_APP -> {
                prefs.calendarAppPackage = appModel.appPackage
                prefs.calendarAppUser = appModel.user.toString()
                prefs.calendarAppClassName = appModel.activityClassName
                prefs.calendarAppUrl = appModel.url
                prefs.calendarAppBrowser = appModel.browser
            }
        }
    }

    fun firstOpen(value: Boolean) {
        firstOpen.postValue(value)
    }

    fun refreshHome(appCountUpdated: Boolean) {
        refreshHome.value = appCountUpdated
    }

    fun toggleDateTime() {
        toggleDateTime.postValue(Unit)
    }

    private fun updateSwipeApps() {
        updateSwipeApps.postValue(Unit)
    }

    private fun launchApp(packageName: String, activityClassName: String?, userHandle: UserHandle) {
        val launcher = appContext.getSystemService(Context.LAUNCHER_APPS_SERVICE) as LauncherApps
        val activityInfo = launcher.getActivityList(packageName, userHandle)
        Log.d("Prefs", "mainviewmodel entered launch app")
        val component = if (activityClassName.isNullOrBlank()) {
            // activityClassName will be null for hidden apps.
            when (activityInfo.size) {
                0 -> {
                    appContext.showToast(appContext.getString(R.string.app_not_found))
                    return
                }

                1 -> ComponentName(packageName, activityInfo[0].name)
                else -> ComponentName(packageName, activityInfo[activityInfo.size - 1].name)
            }
        } else {
            Log.d("Prefs", "entered component name")
            ComponentName(packageName, activityClassName)
        }

        try {
            Log.d("Prefs", "try launcher 1")
            launcher.startMainActivity(component, userHandle, null, null)
        } catch (e: SecurityException) {
            Log.d("Prefs", "er1 $e")
            try {
                Log.d("Prefs", "try launcher 2")
                launcher.startMainActivity(component, android.os.Process.myUserHandle(), null, null)
            } catch (e: Exception) {
                appContext.showToast(appContext.getString(R.string.unable_to_open_app))
            }
        } catch (e: Exception) {
            Log.d("Prefs", "er2 $e")
            appContext.showToast(appContext.getString(R.string.unable_to_open_app))
        }
    }

    fun getAppList(includeHiddenApps: Boolean = false) {
        viewModelScope.launch {
            appList.value = getAppsList(appContext, prefs, includeRegularApps = true, includeHiddenApps)
        }
    }

    fun getHiddenApps() {
        viewModelScope.launch {
            hiddenApps.value = getAppsList(appContext, prefs, includeRegularApps = false, includeHiddenApps = true)
        }
    }

    fun isOlauncherDefault() {
        isOlauncherDefault.value = isOlauncherDefault(appContext)
    }

//    fun resetDefaultLauncherApp(context: Context) {
//        resetDefaultLauncher(context)
//        launcherResetFailed.value = getDefaultLauncherPackage(appContext).contains(".")
//    }

    fun setWallpaperWorker() {
        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()
        val uploadWorkRequest = PeriodicWorkRequestBuilder<WallpaperWorker>(8, TimeUnit.HOURS)
            .setBackoffCriteria(BackoffPolicy.LINEAR, 1, TimeUnit.HOURS)
            .setConstraints(constraints)
            .build()
        WorkManager
            .getInstance(appContext)
            .enqueueUniquePeriodicWork(
                Constants.WALLPAPER_WORKER_NAME,
                ExistingPeriodicWorkPolicy.CANCEL_AND_REENQUEUE,
                uploadWorkRequest
            )
    }

    fun cancelWallpaperWorker() {
        WorkManager.getInstance(appContext).cancelUniqueWork(Constants.WALLPAPER_WORKER_NAME)
        prefs.dailyWallpaperUrl = ""
        prefs.dailyWallpaper = false
    }

    fun updateHomeAlignment(gravity: Int) {
        prefs.homeAlignment = gravity
        homeAppAlignment.value = prefs.homeAlignment
    }
}

