package com.example.rev_android001_helloworld;

/*    安卓手機的開發人員選項：
        開啟步驟 : 進入"設定 > 關於手機 > 軟體資訊 > 輕觸「版本號碼」七次"。
        關閉步驟 : 開啟"設定 > 應用程式 > 設定 > 儲存位置 > 清除資料 > 刪除"。
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;

//  所有Activity一定是繼承自某個Activity，否則會看不到

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    //  這邊會找父類別預設建構式

    //  onCreate是生命週期的方法，不能呼叫，只能定義
    //  生命週期方法只能被呼叫

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //  設定存取畫面是誰，code寫在他後面才能控制他。
        //  R --> Resource
        //  res/layout裡的activity_main
        setContentView(R.layout.activity_main);

        //  取得控制 (類似JS)
        //  不用new出物件，因為已經存在版面上。
        //  R裡面的id裡面的lottery (提示後面的=字串，是代表記憶體位置)
        textView = findViewById(R.id.lottery);
    }

    public void test(View view) {
        //  指定的 context 內具有 test 此方法
        //  存取修飾必為 public 不會有回傳，參數一定是 View
        //  這裡的 View 就是 Button (所有的View都可以被觸發)

        HashSet<Integer> set = new HashSet<>();

        while(set.size() < 6) {
            set.add((int)(Math.random()*49 + 1));
        }

        String temp = set.toString();

        //  將內容顯示在資料上 setText方法
        textView.setText(temp);
    }
}