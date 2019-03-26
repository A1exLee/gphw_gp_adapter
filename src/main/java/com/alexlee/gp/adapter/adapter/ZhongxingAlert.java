package com.alexlee.gp.adapter.adapter;

/**
 * 中兴告警对象
 */
public class ZhongxingAlert {
    private String alertName;
    private Long occurrtime;
    private ZhongxinAlertSeverity severity;

    public Long getOccurrtime() {
        return occurrtime;
    }

    public void setOccurrtime(Long occurrtime) {
        this.occurrtime = occurrtime;
    }

    public ZhongxinAlertSeverity getSeverity() {
        return severity;
    }

    public void setSeverity(ZhongxinAlertSeverity severity) {
        this.severity = severity;
    }

    public String getAlertName() {
        return alertName;
    }

    public void setAlertName(String alertName) {
        this.alertName = alertName;
    }

    public enum ZhongxinAlertSeverity {
        /**
         * 错误
         */
        ERROR(1),
        /**
         * 警告
         */
        WARN(2),
        /**
         * 恢复
         */
        RECOVERY(3);
        private int serverity;

        private ZhongxinAlertSeverity(int serverity) {
            this.serverity = serverity;
        }
    }

}
