ShortcutBadger: [![Maven Central](https://maven-badges.herokuapp.com/maven-central/me.leolin/ShortcutBadger/badge.svg)](https://maven-badges.herokuapp.com/maven-central/me.leolin/ShortcutBadger)
===================================

The ShortcutBadger makes your Android App show the count of unread messages as a badge on your App shortcut!

原开源项目地址: https://github.com/leolin310148/ShortcutBadger

# Supported launchers:<br/>

<table>
    <tr>
        <td width="130">
            <h3>Sony</h3>
            <br>
            <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_sony.png"/>
        </td>
        <td width="130">
            <h3>Samsung</h3>
            <br>
            <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_samsung.png"/>
        </td>
        <td width="130">
            <h3>LG</h3>
            <br>
            <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_lg.png"/>
        </td>
        <td width="130">
            <h3>HTC</h3>
            <br>
            <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_htc.png"/>
        </td>
    </tr>
    <tr>
        <td width="130">
            <h3>Xiaomi</h3>
            <br>
            <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_xiaomi.png"/>
            <br>
        </td>
        <td width="130">
            <h3>ASUS</h3>
            <br>
            <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_asus.png"/>
        </td>
        <td width="130">
            <h3>ADW</h3>
            <br>
            <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_adw.png"/>
        </td>
        <td width="130">
            <h3>APEX</h3>
            <br>
            <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_apex.png"/>
        </td>
    <tr>
        <td width="130">
            <h3>NOVA</h3>
            <br>
            <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_nova.png"/>
        </td>
        <td width="130">
            <h3>Huawei</h3>
            <br>
            (Not Fully Support)
            <br>
            <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_huawei.png"/>
            <br>
            (1.1.7+)
        </td>
        <td width="130">
            <h3>ZUK</h3>
            <br>
            <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_zuk.png"/>
            <br>
            (1.1.10+)
        </td>
        <td width="130">
            <h3>OPPO</h3>
            <br>
            (Not Fully Support)
            <br>
            <img src="screenshots/ss_oppo.png?raw=true"/>
            <br>
            (1.1.10+)
        </td>
    </tr>
    <tr>
        <td width="130">
            <h3>EverythingMe</h3>
            <br>
            <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_evme.png"/>
        </td>
        <td width="130">
            <h3>ZTE</h3>
            <br>
            <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_zte.png"/>
            <br>
            (1.1.17+)
        </td>
        <td width="260" colspan="2">
            <h3>KISS</h3>
            <br>
            <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_kiss.png"/>
            <br>
            (1.1.18+)
        </td>
    </tr>
    <tr>
        <td width="130">
            <h3>LaunchTime</h3>
            <br>
            <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_launchtime.png"/>
        </td>
        <td width="260" colspan="2">
                    <h3>Yandex Launcher</h3>
                    <br>
                    <img src="https://raw.github.com/leolin310148/ShortcutBadger/master/screenshots/ss_yandex.png"/>
                    <br>
                    (1.1.23+)
        </td>
    </tr>
</table>

* Nova launcher with TeslaUnread, Apex launcher, ADW Launcher provided by [notz](https://github.com/notz)
* Solid launcher provided by [MajeurAndroid](https://github.com/MajeurAndroid)
* KISS Launcher provided by [alexander255](https://github.com/alexander255)

## About Xiaomi devices
Xiaomi devices require extra setup with notifications, please read [wiki](https://github.com/leolin310148/ShortcutBadger/wiki/Xiaomi-Device-Support).

## IsBadgeWorking? 

A tool for displaying your device, launcher & android version and testing whether ShortcutBadger
works or not may be downloaded from

* Google Play [https://play.google.com/store/apps/details?id=me.leolin.isbadgeworking](https://play.google.com/store/apps/details?id=me.leolin.isbadgeworking)
* The GitHub repository [https://github.com/leolin310148/IsBadgeWorking.Android/releases](https://github.com/leolin310148/IsBadgeWorking.Android/releases)


USAGE
===================================
<br/>1. git克隆或者下载zip包

<br/>2. 子目录ShortcutBadger作为module导入到自己项目中

<br/>3. 对应用添加角标(注意: 添加角标要伴随着通知一起,通知在,角标在,通知不在,角标不在)

        //添加角标
        int badgeCount = 1;
        ShortcutBadger.applyCount(context, badgeCount);
        
        //发送通知
        startService(new Intent(MainActivity.this, BadgeIntentService.class).putExtra("badgeCount", badgeCount));

<br/>4. 手动清除应用角标

        ShortcutBadger.removeCount(context);
或者
​  

```
    ShortcutBadger.applyCount(context, 0);
```

<br/>

5.开启通知示例请看.\SampleApp\src\main\java\me\leolin\shortcutbadger\example\BadgeIntentService.java(要在AndroidManifest.xml注册服务)<br/>



## **测试说明**

<br/>

机型                  &nbsp;&nbsp;&nbsp;系统版本                            &nbsp;&nbsp;&nbsp;备注

三星s8+            &nbsp;&nbsp;&nbsp;Android9.0                         &nbsp;&nbsp;&nbsp;通过

乐视Max2         &nbsp;&nbsp;&nbsp;Android6.0               &nbsp;&nbsp;&nbsp;角标数字只显示为1

华为P9              &nbsp;&nbsp;&nbsp;Android8.0              &nbsp;&nbsp;&nbsp;通过,需要在AndroidManifest.xml申请权限

小米note4x       &nbsp;&nbsp;&nbsp;Android7.0                          &nbsp;&nbsp;&nbsp;通过

vivo/oppo          &nbsp;&nbsp;&nbsp;*                     &nbsp;&nbsp;&nbsp;不通过 , 需要联系官方申请白名单

<br/>


DEVELOP BY
===================================
[Leo Lin](https://github.com/leolin310148) - leolin310148@gmail.com


ABOUT Google Play Developer Term Violations
===================================
If you receive a message from Google containing something like this:<br/> 

        REASON FOR WARNING: Violation of section 4.4 of the Developer Distribution Agreement.

please use version 1.1.0+!



CHANGE LOG
==========

1.1.23:

* Added Yandex Launcher support. Fixed issue with incorrect default launcher resolve

1.1.22:

* Improve Oreo support (Thanks to [AlexStarc](https://github.com/AlexStarc))

1.1.20:

* Renamed default broadcast action; added Android Oreo support.

1.1.19:

* Fix multiple home package resolve issue.

1.1.18:

* Add Kill Launcher Support

1.1.17:

* Add ZTE Support

1.1.16:

* Improve Sony Launcher support.

1.1.15:

* Add EverythingLauncher Support.

1.1.14:

* Fix for specific class of Samsung devices: with android 5, but without support of DefaultBadger
* Remove Xiaomi from Badger and add Notification Support for Xiaomi devices.

1.1.13:

* Fix XiaomiBadger (tested with RedMi Note4)

1.1.12:

* Handling Samsung badger for old devices and new devices.
* Try to support newer Xiaomi (Not tested.)
* Try to support Vivo (Not tested.)

1.1.11:

* Add OPPO Launcher Support

1.1.10:

* Add ZUK Launcher Support

1.1.9:

* Add SamsungBadger back for more Samsung devices support.

1.1.8:

* Remove SolidBadger, now solid launcher will use default badger.

1.1.7:

* Add Huawei launcher support.

1.1.6:

* Add support for new Sony Launchers.

1.1.5:

* `applyCount` will return if the Broadcast has been sent successfully.

1.1.4:

* Changed `ShortcutBadger.setBadge(context, badgeCount)` to `ShortcutBadger.applyCount(context, badgeCount);`

1.1.3:

* Deprecate SamsungBadger and LGBadger, those devices can use DefaultBadger.

1.1.2:

* Add support for `com.miui.mihome2`

1.1.1:

* Add DefaultBadger because some launchers use android.intent.action.BADGE_COUNT_UPDATE to update count.
* Since the ShortcutBadgerException is helpless. So change api to set badge and never have to handle the exception again.

1.1.0:

* Remove Android Launcher support due to Google Play Developer Term Violation since 4.4.

1.0.10:

* Add Asus launcher support.

1.0.9:

* Add Xiaomi launcher support.


LICENSE
===================================
<br/>
​        
​        Copyright 2014 Leo Lin
​        
​        Licensed under the Apache License, Version 2.0 (the "License");
​        you may not use this file except in compliance with the License.
​        You may obtain a copy of the License at
​        
​            http://www.apache.org/licenses/LICENSE-2.0
​        
​        Unless required by applicable law or agreed to in writing, software
​        distributed under the License is distributed on an "AS IS" BASIS,
​        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
​        See the License for the specific language governing permissions and
​        limitations under the License.
<br/>
