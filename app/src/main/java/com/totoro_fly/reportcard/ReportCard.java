package com.totoro_fly.reportcard;

/**
 * Created by totoro-fly on 2016/12/17.
 */

public class ReportCard {
    private String subject;
    private String score;

    public ReportCard(String subject, String score) {
        this.subject = subject;
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
