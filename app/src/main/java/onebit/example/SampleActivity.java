package onebit.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.onebit.logger.Logger;

public class SampleActivity extends AppCompatActivity {
    private String TAG = "SampleActivity";
    private String simpleJson = "{\"glossary\":{\"title\":\"example glossary\",\"GlossDiv\":{\"title\":\"S\",\"GlossList\":{\"GlossEntry\":{\"ID\":\"SGML\",\"SortAs\":\"SGML\",\"GlossTerm\":\"Standard Generalized Markup Language\",\"Acronym\":\"SGML\",\"Abbrev\":\"ISO 8879:1986\",\"GlossDef\":{\"para\":\"A meta-markup language, used to create markup languages such as DocBook.\",\"GlossSeeAlso\":[\"GML\",\"XML\"]},\"GlossSee\":\"markup\"}}}}}";
    private String simpleStr = "Simple log text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        findViewById(R.id.btn_show_simple_log).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printSimpleLog();
            }
        });

        findViewById(R.id.btn_show_section_log).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printSectionLog();
            }
        });

        findViewById(R.id.btn_show_json_log).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printJsonLog();
            }
        });
    }

    private void printSimpleLog() {
        Logger.d(TAG, simpleStr);
    }

    private void printSectionLog() {
        Logger.dd("Simple section", simpleStr);
    }

    private void printJsonLog() {
        Logger.dd("Log with Json", simpleJson);
    }
}
