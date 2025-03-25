# scriptLauncher

# Fork of Olauncher

`scriptLauncher` is a fork of [Olauncher](https://github.com/Outplayed8713/Olauncher), a minimal Android launcher designed to reduce screen time with daily wallpapers. This fork extends the functionality by adding support for executing bash scripts directly from the launcher UI, building on the existing features of website shortcuts and an increased number of home apps.

## Added Features

1. **Bash Script Execution**  
   - Added the ability to display and execute bash scripts as app-like shortcuts in the launcher UI.  
   - Scripts are executed via Termux with a single tap, assuming Termux is installed and permissions are configured.  

## Usage

### Adding and Running Bash Scripts
- **Setup**:  
  - Install [Termux](https://termux.com/) on your device.  
  - Grant Termux storage permissions by running `termux-setup-storage` in Termux.  
  - Place your bash scripts in a Termux-accessible directory (e.g., `/sdcard/scripts/`).  
  - Make scripts executable with `chmod +x <script_name>` in Termux.  
