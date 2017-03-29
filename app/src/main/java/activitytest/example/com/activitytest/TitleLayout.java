package activitytest.example.com.activitytest;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by WangYong on 2017-3-28.
 */

public class TitleLayout extends LinearLayout  {

    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title_layout,this);

        Button button_back = (Button) findViewById(R.id.button_back);
        Button button_edit = (Button) findViewById(R.id.button_edit);

        button_back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });

        button_edit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "点击了Edit按钮",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
