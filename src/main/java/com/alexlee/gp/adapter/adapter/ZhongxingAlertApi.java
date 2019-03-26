package com.alexlee.gp.adapter.adapter;

/**
 * 华为设备提供的告警api
 */
public class ZhongxingAlertApi {

    public static ZhongxingAlert popAlert() {
        ZhongxingAlert alert = new ZhongxingAlert();
        alert.setAlertName("中兴告警----检测到ddos攻击");
        alert.setOccurrtime(System.currentTimeMillis());
        alert.setSeverity(ZhongxingAlert.ZhongxinAlertSeverity.ERROR);
        return alert;
    }

}
