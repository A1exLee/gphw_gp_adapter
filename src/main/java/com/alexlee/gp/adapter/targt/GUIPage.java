package com.alexlee.gp.adapter.targt;

import com.alexlee.gp.adapter.adaptee.AlertVO;
import com.alexlee.gp.adapter.adaptee.HuaweiAlertApi;
import com.alexlee.gp.adapter.adaptee.NetManageSystem;
import com.alexlee.gp.adapter.adapter.ZhongxingAlertAdapter;
import com.alexlee.gp.adapter.adapter.ZhongxingAlertApi;

public class GUIPage {
    public static void showAlert(AlertVO alertVO) {
        System.out.println("收到告警：" + alertVO.getAlertName());
        System.out.println("告警级别：" + alertVO.getSeverity().getSeverity());
        System.out.println("告警事件：" + alertVO.getOccurrtime());
    }

//    旧代码只对接华为的告警并做格式化展示
//    新增告警适配器，可同时适配两个厂商告警

    public static void main(String[] args) {
        NetManageSystem netManageSystem=new NetManageSystem();
        showAlert(netManageSystem.convertAlert(HuaweiAlertApi.popAlert()));

        ZhongxingAlertAdapter adapter=new ZhongxingAlertAdapter();
        adapter.convertAlert(HuaweiAlertApi.popAlert());
        showAlert(adapter.convertZhongxingAlert(ZhongxingAlertApi.popAlert()));
    }
}
