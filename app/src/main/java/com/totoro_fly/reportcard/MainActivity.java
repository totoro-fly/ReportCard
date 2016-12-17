package com.totoro_fly.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.activity_main_list_view)
    ListView activityMainListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ArrayList<ReportCard> reportCards=new ArrayList<ReportCard>();
        reportCards.add(new ReportCard("近代史纲要","A"));
        reportCards.add(new ReportCard("思想道德与法律基础","B"));
        reportCards.add(new ReportCard("英语","A"));
        reportCards.add(new ReportCard("基础体育","A"));
        reportCards.add(new ReportCard("C语言程序设计","B"));
        reportCards.add(new ReportCard("单变量微积分","C"));
        reportCards.add(new ReportCard("线性代数","C"));
        reportCards.add(new ReportCard("马克思主义基本原理","C"));
        reportCards.add(new ReportCard("力学与热力学","A"));
        reportCards.add(new ReportCard("大学物理-基础实验","A"));
        reportCards.add(new ReportCard("多变量微积分","B"));
        reportCards.add(new ReportCard("电路基本理论","A"));
        reportCards.add(new ReportCard("代数结构","B"));
        reportCards.add(new ReportCard("电磁学","C"));
        reportCards.add(new ReportCard("复变函数","A"));
        reportCards.add(new ReportCard("数据结构","B"));
        reportCards.add(new ReportCard("图论","C"));
        reportCards.add(new ReportCard("计算机导论","A"));
        reportCards.add(new ReportCard("光学与原子物理","B"));
        reportCards.add(new ReportCard("概率论与数理统计","C"));
        reportCards.add(new ReportCard("模拟与数字电路","A"));
        reportCards.add(new ReportCard("数理逻辑","B"));
        reportCards.add(new ReportCard("随机过程","A"));
        reportCards.add(new ReportCard("计算机网络","C"));
        reportCards.add(new ReportCard("计算机组成原理","B"));
        reportCards.add(new ReportCard("操作系统原理与设计","C"));
        reportCards.add(new ReportCard("计算机组成原理","B"));
        reportCards.add(new ReportCard("数据库系统与应用","B"));
        reportCards.add(new ReportCard("编译原理","A"));
        reportCards.add(new ReportCard("并行计算","C"));
        reportCards.add(new ReportCard("软件工程","B"));
        reportCards.add(new ReportCard("数字图像处理","B"));
        reportCards.add(new ReportCard("计算机与网络安全","A"));
        reportCards.add(new ReportCard("多媒体技术","A"));
        reportCards.add(new ReportCard("计算机体系结构","A"));
        reportCards.add(new ReportCard("计算机图形学","B"));
        reportCards.add(new ReportCard("网络数据通讯","C"));
        reportCards.add(new ReportCard("CPU设计与测试","B"));
        reportCards.add(new ReportCard("自动机理论与计算导论","A"));
        reportCards.add(new ReportCard("人工智能基础","B"));
        reportCards.add(new ReportCard("计算机控制基础","A"));
        reportCards.add(new ReportCard("面向对象程序设计语言","A"));
        reportCards.add(new ReportCard("数字信号处理基础","C"));
        reportCards.add(new ReportCard("统筹学基础","C"));
        reportCards.add(new ReportCard("电子系统设计","B"));
        reportCards.add(new ReportCard("JAVA语言程序设计","A"));
        ReportCardAdapter reportCardAdapter=new ReportCardAdapter(this,reportCards);
        activityMainListView.setAdapter(reportCardAdapter);
    }
}
