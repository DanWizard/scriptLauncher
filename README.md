# scriptLauncher

## Repository files navigation

![Olauncher](https://github.com/Outplayed8713/Olauncher/raw/master/app/src/main/res/mipmap-xxhdpi/ic_launcher.png)

# Fork of Olauncher

`scriptLauncher` is a fork of [Olauncher](https://github.com/Outplayed8713/Olauncher), a minimal Android launcher designed to reduce screen time with daily wallpapers. This fork extends the functionality by adding support for executing bash scripts directly from the launcher UI, building on the existing features of website shortcuts and an increased number of home apps.

## Added Features

1. **Bash Script Execution**  
   - Added the ability to display and execute bash scripts as app-like shortcuts in the launcher UI.  
   - Scripts are executed via Termux with a single tap, assuming Termux is installed and permissions are configured.  
2. **Website Shortcuts** (Inherited from upstream fork)  
   - Create shortcuts to websites by typing `*` followed by a URL in the app drawer search.  
3. **Increased Number of Home Apps from 8 to 12** (Inherited from upstream fork)  

## Technical Changes

- **Gradle Configuration Updates** (`gradle.properties`):  
  - Added `android.defaults.buildfeatures.buildconfig=true` to enable BuildConfig generation.  
  - Set `android.nonTransitiveRClass=false` to use transitive R class references.  
  - Set `android.nonFinalResIds=false` to keep resource IDs as final.  
- **Updated Gradle Wrapper Scripts** (`gradlew` and `gradlew.bat`):  
  - Replaced the basic `gradlew` script with a more robust, POSIX-compliant version from Gradle, including better symlink handling, JVM options, and error reporting.  
  - Updated `gradlew.bat` for Windows with improved path resolution, default JVM options (`-Xmx64m -Xms64m`), and error handling.  
- **Project Structure**:  
  - Added `.gradle` and `.idea` directories (indicating local build and IDE setup).  
  - Added `local.properties` (likely for local SDK configuration, not tracked in git).  

## Usage

### Adding Website Shortcuts
- In the app drawer search, type a URL preceded by an asterisk (e.g., `* https://example.com/`) and press enter.  
- The website opens in your default browser, and a shortcut is added to the app drawer.  
- Long-press the shortcut to rename, delete, or hide it. Use the info button to choose a specific browser.  
- Assign website shortcuts to home screen slots, clock/calendar shortcuts, or swipe gestures.

### Adding and Running Bash Scripts
- **Setup**:  
  - Install [Termux](https://termux.com/) on your device.  
  - Grant Termux storage permissions by running `termux-setup-storage` in Termux.  
  - Place your bash scripts in a Termux-accessible directory (e.g., `/sdcard/scripts/`).  
  - Make scripts executable with `chmod +x <script_name>` in Termux.  
- **Adding a Script**:  
  - In the app drawer search, type the script name or path preceded by a `#` (e.g., `# myscript.sh` or `# /sdcard/scripts/myscript.sh`) and press enter.  
  - The script executes immediately in Termux, and a shortcut is added to the app drawer.  
- **Managing Scripts**:  
  - Long-press the script shortcut to rename, delete, or move it to hidden apps.  
  - Assign scripts to home screen slots or swipe gestures, similar to apps or website shortcuts. The script will execute in Termux 
