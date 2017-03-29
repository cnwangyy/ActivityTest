package activitytest.example.com.activitytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private List<ListView_item> listView = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        initListview_item();
        ListViewItemAdapter adapter = new ListViewItemAdapter(SecondActivity.this,
                R.layout.listview_item_layout, listView);
        final ListView listview = (ListView) findViewById(R.id.list_view);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListView_item listVIew_item = listView.get(position);
                Toast.makeText(SecondActivity.this, listVIew_item.getName(), Toast.LENGTH_SHORT).show();

            }
        });
    }
//        Intent intent1 = getIntent();
//        String a = intent1.getStringExtra("data");
//        Log.d("SecondActivity",a);

//        Button button2 = (Button) findViewById(R.id.button_2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent2 = new Intent();
//                intent2.putExtra("data","这是用Intent返回的数据");
//                setResult(RESULT_OK, intent2);
//                finish();
//            }
//        });



    private void initListview_item() {
        for(int i = 0; i < 3; i++)
        {
            ListView_item cjc = new ListView_item("陈锦宸", R.drawable.cjc);
            listView.add(cjc);
            ListView_item cyz = new ListView_item("陈彦佐", R.drawable.cyz);
            listView.add(cyz);
            ListView_item ljm = new ListView_item("刘嘉铭", R.drawable.ljm);
            listView.add(ljm);
            ListView_item myzb = new ListView_item("马虞之博", R.drawable.myzb);
            listView.add(myzb);
            ListView_item ssc = new ListView_item("沈圣超", R.drawable.ssc);
            listView.add(ssc);
            ListView_item wy = new ListView_item("王勇", R.drawable.wy);
            listView.add(wy);
        }
    }
}
