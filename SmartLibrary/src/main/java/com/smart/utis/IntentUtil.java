package com.smart.utis;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.View;


/**
 * Created by jrvansuita on 10/02/17.
 */

public final class IntentUtil {


    private Context context;

    public IntentUtil(Context context) {
        this.context = context;
    }

    public Uri uri(int res, String user) {
        return Uri.parse(context.getString(res, user));
    }

    public Intent intent(Uri uri) {
        return new Intent(Intent.ACTION_VIEW, uri);
    }

    public Intent intent(int res, String user) {
        return intent(uri(res, user));
    }

    public View.OnClickListener clickUri(Uri uri) {
        return clickIntent(intent(uri));
    }

    public View.OnClickListener clickIntent(final Intent intent) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open(intent);
            }
        };
    }

    public void open(Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void open(Uri uri) {
        open(intent(uri));
    }

    private void tryPackage(int res) throws PackageManager.NameNotFoundException {
        context.getPackageManager().getPackageInfo(context.getString(res), 0);
    }


    public Intent openAddContact(String name, String phone) {
        Intent intent = new Intent(Intent.ACTION_INSERT);
        intent.setType(ContactsContract.Contacts.CONTENT_TYPE);

        intent.putExtra(ContactsContract.Intents.Insert.NAME, name);
        intent.putExtra(ContactsContract.Intents.Insert.PHONE, phone);

        return intent;
    }

    public Intent sendEmail(String email, String subject, String message) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);

        return intent;
    }



    public Intent shareThisApp(String subject, String message) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        return intent;
    }

}
