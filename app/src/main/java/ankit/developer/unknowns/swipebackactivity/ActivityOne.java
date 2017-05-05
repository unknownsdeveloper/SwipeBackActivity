package ankit.developer.unknowns.swipebackactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

public class ActivityOne extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        //left,top,right,bottom
        setDragEdge(SwipeBackLayout.DragEdge.LEFT);
    }
}
