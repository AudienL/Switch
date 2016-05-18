# Switch

官方的Switch不是我想要的效果，所以自定义了这个Switch。

## 效果图：

![效果图](https://github.com/AudienL/Switch/blob/master/doc/demo.gif?raw=true)

## 使用：

### 一、在 project 根目录的 build.gradle 中添加：

```groovy
allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
```

### 二、在 module 根目录的 build.gradle 中添加：

其中最后版本在 release 中查看，如：1.0
```groovy
dependencies {
    compile 'com.github.AudienL:Switch:最后版本'
}
```

### 三、使用

布局文件：
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
              xmlns:app="http://schemas.android.com/apk/res-auto"
              android:layout_width="match_parent"
              android:layout_height="match_parent"
              android:background="@android:color/holo_orange_dark"
              android:orientation="vertical"
              android:padding="10dp">

    <!-- 默认 -->
    <com.audienl.switchlibrary.Switch
        android:id="@+id/my_switch"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

    <!-- 自定义 -->
    <com.audienl.switchlibrary.Switch
        android:layout_width="200dp"
        android:layout_height="50dp"
        android:layout_marginTop="30dp"
        app:switch_back_color="@android:color/holo_purple"
        app:switch_circle_color="@android:color/holo_red_light"
        app:switch_main_color="@android:color/holo_blue_dark"/>
</LinearLayout>
```

代码：
```java
package com.audienl.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.audienl.switchlibrary.Switch;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private Switch mSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSwitch = (Switch) findViewById(R.id.my_switch);

        // 设置监听器
        mSwitch.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(boolean isChecked) {
                Log.i(TAG, "onCheckedChanged: is_checked=" + isChecked);
            }
        });

        // 设置选中状态
        mSwitch.setChecked(true);
    }
}
```