package com.example.vampire.tinygobang.view.dialog;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;

import com.example.vampire.tinygobang.R;
import com.example.vampire.tinygobang.util.mdButton.ButtonRectangle;

/**
 * Created by X on 2016/4/23 0023.
 * 对方请求重新开始游戏弹出的对话框类
 */
public class RRestartDialog {
    public static AlertDialog dialog;
    public static Window window;
    public static ButtonRectangle agree;
    public static ButtonRectangle disagree;

    public static void init(Context context){
        dialog=new AlertDialog.Builder(context).create();
        dialog.setCancelable(false);
        window=dialog.getWindow();
        dialog.show();
        window.setContentView(R.layout.dialog_request_restart);

        agree= (com.example.vampire.tinygobang.util.mdButton.ButtonRectangle) window.findViewById(R.id.btn_agree);
        disagree= (com.example.vampire.tinygobang.util.mdButton.ButtonRectangle) window.findViewById(R.id.btn_disagree);
        agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }
}
