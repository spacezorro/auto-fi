# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to the default
# flags. You can edit the include path and order by changing the
# proguardFiles directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
-keepclassmembers class com.lukekorth.auto_fi.webview.JavascriptLoggingInterface {
   public *;
}
