package in.jaaga.calculator;

import java.util.Locale;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	EditText one, two;
	Button plus, minus, multiply, divide;
	TextView showres;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final TextToSpeech voice = new TextToSpeech(MainActivity.this, null);
		voice.setLanguage(Locale.UK);

		one = (EditText) findViewById(R.id.editText1);
		two = (EditText) findViewById(R.id.editText2);
		plus = (Button) findViewById(R.id.button1);
		minus = (Button) findViewById(R.id.button2);
		multiply = (Button) findViewById(R.id.button3);
		divide = (Button) findViewById(R.id.button4);
		showres = (TextView) findViewById(R.id.textView3);

		plus.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try {

					int n1 = Integer.parseInt(one.getText().toString());
					int n2 = Integer.parseInt(two.getText().toString());
					int sum = n1 + n2;
					showres.setText(""+sum);
					voice.speak(n1+"plus"+n2 +"is equal to"+ sum ,TextToSpeech.QUEUE_FLUSH,null);
					
				} catch (Exception e) {

				}
			}
		});

		minus.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try {

					int n1 = Integer.parseInt(one.getText().toString());
					int n2 = Integer.parseInt(two.getText().toString());
					int minus = n1 - n2;
					showres.setText(""+minus);
					voice.speak(n1+"minus"+n2 +"is equal to"+ minus ,TextToSpeech.QUEUE_FLUSH,null);
				} catch (Exception e) {

				}

			}
		});

		multiply.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try {

					int n1 = Integer.parseInt(one.getText().toString());
					int n2 = Integer.parseInt(two.getText().toString());
					int multiplication = n1 * n2;
					showres.setText(""+multiplication);
					voice.speak(n1+"mulptiply by"+n2 +"is equal to"+ multiplication ,TextToSpeech.QUEUE_FLUSH,null);
				} catch (Exception e) {

				}

			}
		});

		divide.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try {

					int n1 = Integer.parseInt(one.getText().toString());
					int n2 = Integer.parseInt(two.getText().toString());
					int dividation = n1 / n2;
					showres.setText(""+dividation);
					voice.speak(n1+"devide by"+n2 +"is equal to"+ dividation ,TextToSpeech.QUEUE_FLUSH,null);
				} catch (Exception e) {

				}

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
