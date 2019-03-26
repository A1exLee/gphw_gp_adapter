package com.alexlee.gp.adapter.adaptee;

public class HuaweiAlert {
    private String alarmName;
    private String date;
    private HuaweiAlertSeverity severity;

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public HuaweiAlertSeverity getSeverity() {
        return severity;
    }

    public void setSeverity(HuaweiAlertSeverity severity) {
        this.severity = severity;
    }

    public enum HuaweiAlertSeverity {
        /**
         * 错误
         */
        ERROR("error"),
        /**
         * 警告
         */
        WARN("warn"),
        /**
         * 恢复
         */
        RECOVERY("recovery");
        private String serverity;

        private HuaweiAlertSeverity(String serverity) {
            this.serverity = serverity;
        }
    }


}
