# scriptLauncher

## Overview

`scriptLauncher` is a small project I’ve been tinkering with—a fork of the excellent [Olauncher](https://github.com/tanujnotes/Olauncher) (originally by tanujnotes), building on a [fork by Outplayed8713](https://github.com/Outplayed8713/Olauncher) that added website shortcuts. I cloned their work and added a feature I found useful: the ability to run bash scripts via Termux directly from the launcher UI.

I’m not a pro Android developer—just someone who enjoys messing with workflows. This is a modest addition to an already great minimal launcher.

## What It Does

- **Bash Script Execution**: Add scripts to display in the app drawer by placing them in `File(Environment.getExternalStorageDirectory(), "scripts")` (e.g., `/sdcard/scripts/`). They execute in Termux with a tap and persist as shortcuts, similar to apps or websites.  
- **Inherited Features**: Keeps Olauncher’s minimal vibe, including website shortcuts (via `*` prefix) and support for 12 home app slots (from Outplayed8713’s fork).  

## How to Use It

1. **Prerequisites**:  
   - Install [Termux](https://termux.com/) on your device.  
   - Grant Termux storage permissions by running `termux-setup-storage` in Termux.  

2. **Prepare Your Scripts**:  
   - Make your bash scripts executable with `chmod +x script.sh` in Termux.  
   - Move them to `/data/data/com.termux/files/home/olauncher_scripts/` (Note: Ensure this directory exists or create it with `mkdir -p /data/data/com.termux/files/home/olauncher_scripts/`).  

3. **Run Scripts**:  
   - Scripts placed in `/sdcard/scripts/` will appear in the app drawer. Tap to execute them via Termux.  
   - Shortcuts persist and can be managed like apps (e.g., long-press to rename or delete).  

### Example
```bash
#!/bin/bash
echo "Hello from scriptLauncher!" > /sdcard/output.txt
