package pdm.uninsubria.it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        EditText message_edittext = (EditText) findViewById(R.id.message_edittext);
        String message = message_edittext.getText().toString();
        Uri uri = Uri.parse("smsto:3803765019");
        Intent it = new Intent(Intent.ACTION_SENDTO, uri);
        it.putExtra("sms_body", message);
        startActivity(it);
    }
}
