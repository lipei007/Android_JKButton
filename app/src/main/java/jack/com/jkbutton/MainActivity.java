package jack.com.jkbutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final JKButton btn = findViewById(R.id.pop_btn);

        btn.setTitleForState(JKButton.JKButtonState.JKButtonStateNormal,"Normal");
        btn.setTitleForState(JKButton.JKButtonState.JKButtonStateHighlight,"Highlight");
        btn.setTitleForState(JKButton.JKButtonState.JKButtonStateSelected,"Selected");

        btn.setTitleColorForState(JKButton.JKButtonState.JKButtonStateNormal, Color.BLACK);
        btn.setTitleColorForState(JKButton.JKButtonState.JKButtonStateHighlight,Color.GREEN);
        btn.setTitleColorForState(JKButton.JKButtonState.JKButtonStateSelected,Color.RED);


        btn.setBackgroundDrawableForState(JKButton.JKButtonState.JKButtonStateNormal,getResources().getDrawable(R.drawable.actionsheet_round_corner_normal_bg));
        btn.setBackgroundDrawableForState(JKButton.JKButtonState.JKButtonStateHighlight,getResources().getDrawable(R.drawable.actionsheet_round_corner_highlight_bg));
        btn.setBackgroundDrawableForState(JKButton.JKButtonState.JKButtonStateSelected,getResources().getDrawable(R.drawable.actionsheet_round_corner_selected_bg));

    }
}
