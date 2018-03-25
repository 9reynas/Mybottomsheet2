package proyect.my.of.example.miyuki.mybottomsheet;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // get the bottom sheet view
    LinearLayout llBottomSheet;
    BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llBottomSheet = (LinearLayout) findViewById(R.id.bottom_sheet);

        // init the bottom sheet behavior
         bottomSheetBehavior = BottomSheetBehavior.from(llBottomSheet);


   /*// change the state of the bottom sheet
bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);

// set the peek height
bottomSheetBehavior.setPeekHeight(340);

// set hideable or not
bottomSheetBehavior.setHideable(false);
*/

// set callback for changes

bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
    @Override
    public void onStateChanged(@NonNull View bottomSheet, int newState) {


        switch (newState){
            case BottomSheetBehavior.STATE_COLLAPSED:

                break;
            case BottomSheetBehavior.STATE_EXPANDED:
                break;

                case BottomSheetBehavior.STATE_HIDDEN:
                    Toast.makeText(getApplicationContext(),"escondida",Toast.LENGTH_SHORT).show();
                  // bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                    break;
        }
    }

    @Override
    public void onSlide(@NonNull View bottomSheet, float slideOffset) {

    }
});

    }
}
