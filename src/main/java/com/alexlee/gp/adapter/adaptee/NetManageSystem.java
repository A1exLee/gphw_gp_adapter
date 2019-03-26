package com.alexlee.gp.adapter.adaptee;

/**
 * 网管系统对接告警，输出用于展示的告警信息
 */
public class NetManageSystem {

    /**
     * 转换原始告警
     *
     * @return
     */
    public AlertVO convertAlert(HuaweiAlert huaweiAlert) {
        AlertVO alertVO = new AlertVO();
        alertVO.setAlertName(huaweiAlert.getAlarmName());
        alertVO.setOccurrtime(huaweiAlert.getDate());
        AlertVO.Serverity serverity;
        HuaweiAlert.HuaweiAlertSeverity huaweiSeverity = huaweiAlert.getSeverity();
        switch (huaweiSeverity) {
            case ERROR:
                serverity = AlertVO.Serverity.ERROR;
                break;
            case WARN:
                serverity = AlertVO.Serverity.WARN;
                break;
            case RECOVERY:
                serverity = AlertVO.Serverity.OK;
            default:
                serverity = AlertVO.Serverity.WARN;
        }
        alertVO.setSeverity(serverity);
        return alertVO;
    }


}
