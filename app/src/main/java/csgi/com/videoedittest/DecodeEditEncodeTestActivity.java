package csgi.com.videoedittest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import csgi.com.cts.DecodeEditEncodeTest;
import csgi.com.cts.ExtractDecodeEditEncodeMuxTest;

public class DecodeEditEncodeTestActivity extends ActionBarActivity {

    ExtractDecodeEditEncodeMuxTest test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decode_edit_encode_test);

        test = new ExtractDecodeEditEncodeMuxTest();
        test.setContext(this);
        try {
            test.testExtractDecodeEditEncodeMuxQVGA();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_decode_edit_encode_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
