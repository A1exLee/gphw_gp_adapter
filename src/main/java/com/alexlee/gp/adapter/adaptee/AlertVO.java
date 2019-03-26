package com.alexlee.gp.adapter.adaptee;

/**
 * 综合网管系统用于展示的告警
 */
public class AlertVO {
    private String alertName;
    private String occurrtime;
    private Serverity severity;

    public String getAlertName() {
        return alertName;
    }

    public void setAlertName(String alertName) {
        this.alertName = alertName;
    }

    public String getOccurrtime() {
        return occurrtime;
    }

    public void setOccurrtime(String occurrtime) {
        this.occurrtime = occurrtime;
    }

    public Serverity getSeverity() {
        return severity;
    }

    public void setSeverity(Serverity severity) {
        this.severity = severity;
    }

    public enum Serverity {
        ERROR("严重"), WARN("警告"), OK("恢复");
        private String severity;
        Serverity(String severity) {
            this.severity = severity;
        }

        public String getSeverity() {
            return severity;
        }

        public void setSeverity(String severity) {
            this.severity = severity;
        }
    }
}
