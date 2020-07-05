package com.example.rev_android001_helloworld;

/*    安卓手機的開發人員選項：
        開啟步驟 : 進入"設定 > 關於手機 > 軟體資訊 > 輕觸「版本號碼」七次"。
        關閉步驟 : 開啟"設定 > 應用程式 > 設定 > 儲存位置 > 清除資料 > 刪除"。
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}