package com.example.hirono.fragmentsample;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;



public class MyActivity extends Activity {

    private void d(final String msg) {
        Log.d("MyActivity", "" + this.hashCode() + " - " + msg);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        d("onCreate()");
        setContentView(R.layout.activity_my);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        d("onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        d("onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        d("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        d("onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        d("onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        d("onDestroy()");
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            d("onCreateView()");
            View rootView = inflater.inflate(R.layout.fragment_my, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            d("onAttach()");
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            d("onCreate()");
        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            d("onViewCreated()");
        }

        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            d("onActivityCreated()");
        }

        @Override
        public void onStart() {
            super.onStart();
            d("onStart()");
        }

        @Override
        public void onResume() {
            super.onResume();
            d("onResume()");
        }

        @Override
        public void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            d("onSaveInstanceState()");
        }

        @Override
        public void onPause() {
            super.onPause();
            d("onPause()");
        }

        @Override
        public void onStop() {
            super.onStop();
            d("onStop()");
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            d("onDestroyView()");
        }

        @Override
        public void onDestroy() {
            super.onDestroy();
            d("onDestroy()");
        }

        @Override
        public void onDetach() {
            super.onDetach();
            d("onDetach()");
        }

        private void d(final String msg) {
            Log.d("Fragment", "" + this.hashCode() + " - " + msg);
        }
    }
}
