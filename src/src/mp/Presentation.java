package src.mp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Presentation extends Fragment {
	String contentPresentation;
	
	static Presentation newInstance(String contentPresentation ){
		Presentation p = new Presentation();
		
		Bundle b = new Bundle();
		b.putString("data_bundle_presentation", contentPresentation);
		p.setArguments(b);
		return p;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.contentPresentation = getArguments().getString("data_bundle_presentation");
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.presentation_fragment, null);
		TextView tvContent = (TextView) ll.findViewById(R.id.tv_presentation_content);
		tvContent.setText(contentPresentation);
		return ll;
	}

}
