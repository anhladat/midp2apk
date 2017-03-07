package com.netmite.andme.launcher.application;

import android.os.Bundle;
import com.netmite.andme.launcher.Launcher2;

public class MainMIDlet
  extends Launcher2
{
  public void onCreate(Bundle paramBundle)
  {
    this.launchinpackageprocess = false;
    setParameter("launcher_midleturl", "/data/test/2.0/upload/application.jad");
    setParameter("launcherpackagename", "com.netmite.andme.launcher.application");
    setParameter("launcherclassname", "MainMIDlet");
    setMidletInfo("http://www.netmite.com/android/srv/2.0/upload/application.jad", 1, "AppName", "/icon.png", "MainMIDlet");
    super.onCreate(paramBundle);
  }
}
