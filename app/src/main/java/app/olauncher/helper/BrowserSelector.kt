package app.olauncher.helper
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AlertDialog

class BrowserSelector(private val context: Context) {

    fun showBrowserSelectionDialog(url: String, callback: (String) -> Unit) {
        val browsers = getBrowsers()
        val browserNames = browsers.map { it.first }.toTypedArray()

        AlertDialog.Builder(context)
            .setTitle("Open with")
            .setItems(browserNames) { _, which ->
                val selectedPackage = browsers[which].second
                callback(selectedPackage)
                openUrlInBrowser(url, selectedPackage)
            }
            .setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    private fun getBrowsers(): List<Pair<String, String>> {
        val browsers = mutableListOf<Pair<String, String>>()
        browsers.add(Pair("Default Browser", ""))

        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.example.com"))
        val resolveInfoList = context.packageManager.queryIntentActivities(browserIntent, PackageManager.MATCH_ALL)

        for (resolveInfo in resolveInfoList) {
            val activityInfo = resolveInfo.activityInfo
            val packageName = activityInfo.packageName
            if (packageName != context.packageName) {
                val appName = activityInfo.loadLabel(context.packageManager).toString()
                browsers.add(Pair(appName, packageName))
            }
        }

        return browsers.distinctBy { it.second }
    }

    private fun openUrlInBrowser(url: String, packageName: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        if (packageName.isNotEmpty()) {
            intent.setPackage(packageName)
        }
        context.startActivity(intent)
    }
}
