package com.android.jamalludin.imkprototypeportal;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (alertDialogBuilder == null) {
                alertDialogBuilder = new AlertDialog.Builder(this);
            }

            alertDialogBuilder.setTitle("Yakin untuk Keluar ?");
            alertDialogBuilder
                    .setMessage("Klik YA untuk keluar..")
                    .setCancelable(false)
                    .setPositiveButton("YA",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int id) {
                                    // menghancurkan activity / keluar aplikasi
                                    finish();
                                }
                            })
                    .setNegativeButton("TIDAK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int id) {

                                    dialog.cancel();
                                }
                            }).create().show();

        }
        return false;
    }
}
