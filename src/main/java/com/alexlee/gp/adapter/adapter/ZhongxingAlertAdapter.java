package com.alexlee.gp.adapter.adapter;

import com.alexlee.gp.adapter.adaptee.AlertVO;
import com.alexlee.gp.adapter.adaptee.NetManageSystem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ZhongxingAlertAdapter extends NetManageSystem {

    public AlertVO convertZhongxingAlert(ZhongxingAlert zhongxingAlert) {
        AlertVO alertVO = new AlertVO();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        alertVO.setOccurrtime(sdf.format(new Date(zhongxingAlert.getOccurrtime())));
        alertVO.setAlertName(zhongxingAlert.getAlertName());
        AlertVO.Serverity serverity;
        switch (zhongxingAlert.getSeverity()) {
            case RECOVERY:
                serverity = AlertVO.Serverity.OK;
                break;
            case ERROR:
                serverity = AlertVO.Serverity.ERROR;
                break;
            case WARN:
                serverity = AlertVO.Serverity.WARN;
                break;
            default:
                serverity = AlertVO.Serverity.WARN;
                break;
        }
        alertVO.setSeverity(serverity);
        return alertVO;


    }


}
