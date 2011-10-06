
package src.mp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Contact extends Fragment {
	static Contact newInstance(){
		Contact c = new Contact();
		return c;
		
		
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
		
		LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.contact_fragment, null);
		ImageView ivGmailLogo = (ImageView) ll.findViewById(R.id.iv_gmail);
		ImageView ivLinkedinLogo = (ImageView) ll.findViewById(R.id.iv_linkedin);
		TextView tvGmail = (TextView)ll.findViewById(R.id.tv_gmail_address);
		TextView tvTwitter = (TextView)ll.findViewById(R.id.tv_twitter_name);
		TextView tvLinkedIn = (TextView)ll.findViewById(R.id.linkedin_name);
		Linkify.addLinks(tvGmail, Linkify.EMAIL_ADDRESSES);
		tvTwitter.setText(Html.fromHtml("<a href=\"http://twitter.com/#!/jrm2k6\">jrm2k6</a>"));
		tvTwitter.setMovementMethod(LinkMovementMethod.getInstance());
		tvLinkedIn.setText(Html.fromHtml("<a href=\"http://ca.linkedin.com/in/jeremydagorn\">jeremydagorn</a>"));
		tvLinkedIn.setMovementMethod(LinkMovementMethod.getInstance());
		
		
		

		
		return ll;
	}
}
