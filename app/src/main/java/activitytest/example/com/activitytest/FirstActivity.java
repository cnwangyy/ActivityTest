package activitytest.example.com.activitytest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "你点击了添加", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "你点击了移除", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
            actionBar.hide();
        setContentView(R.layout.first_layout);

        Button button1 = (Button) findViewById(R.id.button_1);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.activitytest.ACTION_START");
                startActivity(intent);
//                DrogressDialog进度提示框
//                ProgressDialog progressDialog = new ProgressDialog(FirstActivity.this);
//                progressDialog.setTitle("进度提示框");
//                progressDialog.setMessage("正在加载。。。。。");
//                progressDialog.setCancelable(true);
//                progressDialog.show();

                /* dialog */
//                AlertDialog.Builder dialog = new AlertDialog.Builder(FirstActivity.this);
//                dialog.setTitle("对话框");
//                dialog.setMessage("这是一个对话框");
//                dialog.setCancelable(false);
//                dialog.setPositiveButton("确认", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//                dialog.setNegativeButton("取消", new DialogInterface.OnClickListener(){
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//                dialog.show();

//                Intent intent = new Intent("com.example.activitytest.ACTION_START");
//                intent.addCategory("com.example.activitytest.MY_CATEGORY");
//                intent.putExtra("data","这是从Intent传递的数据");
//                startActivityForResult(intent,1);
            }
        });

        //       Toast 提示框
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(FirstActivity.this, "你点击了按钮", Toast.LENGTH_LONG).show();
//            }
//        });
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        switch (requestCode){
//            case 1:
//                if(resultCode == RESULT_OK) {
////                    String returnedData = data.getStringExtra("data");
//                    Log.d("FirstActivity", data.getStringExtra("data"));
//                }
//                break;
//            default:
//        }
//    }
}
