package com.totoro_fly.reportcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by totoro-fly on 2016/12/17.
 */

public class ReportCardAdapter extends ArrayAdapter<ReportCard> {

    public ReportCardAdapter(Context context, ArrayList<ReportCard> reportCards) {
        super(context, 0, reportCards);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        ReportCard reportCard = getItem(position);
        TextView subject = (TextView) itemView.findViewById(R.id.subject_text_view);
        subject.setText(reportCard.getSubject());
        TextView score = (TextView) itemView.findViewById(R.id.score_text_view);
        score.setText(reportCard.getScore());
        return itemView;
    }
}
