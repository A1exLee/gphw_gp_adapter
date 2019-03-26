package com.alexlee.gp.adapter.adaptee;

import com.alexlee.gp.adapter.adaptee.HuaweiAlert;

/**
 * 华为设备提供的告警api
 */
public class HuaweiAlertApi {

    public static HuaweiAlert popAlert() {
        HuaweiAlert huaweiAlert = new HuaweiAlert();
        huaweiAlert.setAlarmName("华为告警---交换机端口c下线");
        huaweiAlert.setSeverity(HuaweiAlert.HuaweiAlertSeverity.WARN);
        huaweiAlert.setDate("2019-03-26 21:19:01");
        return huaweiAlert;
    }

}
