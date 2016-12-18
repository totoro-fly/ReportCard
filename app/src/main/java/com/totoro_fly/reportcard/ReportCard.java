package com.totoro_fly.reportcard;

/**
 * Created by totoro-fly on 2016/12/17.
 */

public class ReportCard {
    private String mSubject;
    private String mSore;

    public ReportCard(String subject, String score) {
        this.mSubject = subject;
        this.mSore = score;
    }

    public String getSubject() {
        return mSubject;
    }

    public void setSubject(String subject) {
        this.mSubject = subject;
    }

    public String getScore() {
        return mSore;
    }

    public void setScore(String score) {
        this.mSore = score;
    }

    @Override
    public String toString() {
        return "ReportCard: Subject:"+ mSubject + ",Score" + mSore;
    }
}
