package src.mp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


public class Hobby extends Fragment {
	static Hobby newInstance(){
		Hobby h = new Hobby();
		return h;
		
		
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		RelativeLayout ll = (RelativeLayout) inflater.inflate(R.layout.hobby_fragment, null);
		return ll;
	}
}
