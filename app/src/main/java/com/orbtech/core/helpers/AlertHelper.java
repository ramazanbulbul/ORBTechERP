package com.orbtech.core.helpers;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;

import com.orbtech.core.data.enums.AlertType;

public class AlertHelper {
    public Activity _activity;
    public Context _context;
    public AlertHelper(Activity activity){
        _activity = activity;
        _context = activity.getApplicationContext();
    }
    public void Show(AlertType alertType, String title, String message, String positiveButtonTitle, DialogInterface.OnClickListener positiveButtonOnClickEvent, String negativeButtonTitle, DialogInterface.OnClickListener negativeButtonOnClickEvent, boolean isCancelable, DialogInterface.OnCancelListener cancelButtonOnClickEvent){
        if (_context == null){
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(_context);
//        switch (alertType){
//            case INFO:
//                builder.setIcon(R.drawable.ic_info_24);
//                break;
//            case ERROR:
//                builder.setIcon(R.drawable.ic_error_24);
//                break;
//            case QUESTION:
//                builder.setIcon(R.drawable.ic_info_24);
//                break;
//            case SYSTEM_ERROR:
//                builder.setIcon(R.drawable.ic_error_24);
//                break;
//        }
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton(positiveButtonTitle, positiveButtonOnClickEvent);
        builder.setNegativeButton(negativeButtonTitle, negativeButtonOnClickEvent);
        builder.setCancelable(isCancelable);
        builder.setOnCancelListener(cancelButtonOnClickEvent);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private Drawable getIcon(AlertType alertType){
        switch (alertType){
            case INFO:
                return null;
            default:
                return null;
        }
    }
}
