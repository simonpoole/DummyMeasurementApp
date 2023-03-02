package de.westnordost.streetmeasure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Dummy extends Activity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent resultIntent = new Intent("de.westnordost.streetmeasure.RESULT_ACTION");
        resultIntent.putExtra("meters", 1.23);
        setResult(RESULT_OK, resultIntent);
        finish();
    }
}
