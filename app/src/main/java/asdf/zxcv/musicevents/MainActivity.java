package asdf.zxcv.musicevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import asdf.zxcv.musicevents.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements MusicEventFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(MusicEvents item) {

    }
}
