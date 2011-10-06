package src.mp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class ViewPagerIndicatorActivity extends FragmentActivity {
	PagerAdapter mPagerAdapter;
	ViewPager  mViewPager;
	ViewPagerIndicator mIndicator;


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Create our custom adapter to supply pages to the viewpager.
		mPagerAdapter = new PagerAdapter(getSupportFragmentManager());
		mViewPager = (ViewPager)findViewById(R.id.pager);
		mViewPager.setAdapter(mPagerAdapter);

		// Start at a custom position
		mViewPager.setCurrentItem(0);

		// Find the indicator from the layout
		mIndicator = (ViewPagerIndicator)findViewById(R.id.indicator);

		// Set the indicator as the pageChangeListener
		mViewPager.setOnPageChangeListener(mIndicator);

		// Initialize the indicator. We need some information here:
		// * What page do we start on.
		// * How many pages are there in total
		// * A callback to get page titles
		mIndicator.init(0, mPagerAdapter.getCount(), mPagerAdapter);
		Resources res = getResources();
		Drawable prev = res.getDrawable(R.drawable.indicator_prev_arrow);
		Drawable next = res.getDrawable(R.drawable.indicator_next_arrow);
		mIndicator.setFocusedTextColor(new int[]{255, 0, 0});

		// Set images for previous and next arrows.
		mIndicator.setArrows(prev, next);

		mIndicator.setOnClickListener(new OnIndicatorClickListener());
	}

	class OnIndicatorClickListener implements ViewPagerIndicator.OnClickListener{
		@Override
		public void onCurrentClicked(View v) {
			//Toast.makeText(ViewPagerIndicatorActivity.this, "Hello", Toast.LENGTH_SHORT).show();
		}

		@Override
		public void onNextClicked(View v) {
			mViewPager.setCurrentItem(Math.min(mPagerAdapter.getCount() - 1, mIndicator.getCurrentPosition() + 1));
		}

		@Override
		public void onPreviousClicked(View v) {
			mViewPager.setCurrentItem(Math.max(0, mIndicator.getCurrentPosition() - 1));
		}

	}

	class PagerAdapter extends FragmentPagerAdapter implements ViewPagerIndicator.PageInfoProvider{
		final String[] titleSections = {"Presentation","Education","Experience", "Competences", "Hobbies", "Contact"}; 
		public PagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int pos) {
			Fragment p = null;
			switch (pos){
			case 0:
				p = Presentation.newInstance("My name is Jeremy Dagorn and I am finishing my studies in Computer Science, in Software Engineering specialty.\n\n" +
						"I am actually at Laval University, as an exchange student. I am seeking for an end-of-studies internship, from May to September/October.\n\n" +
						"I am someone passionate with new technologies, enjoyable, open-minded, dynamic and always doing his best in his differents projects\n\n"+
						"I am always ready to learn new things, whatever the topic. I learn quickly and efficiently.\n\n"+
						"This little homemade app shows you my educational background, my work experiences and differents projects I have done.\n\n"+
						"Don't hesitate to contact me if you have any question, my contact information are in the Contact tab :)");
				break;
			case 1:
				p = Education.newInstance();
				break;
			case 2 : 
				p = Experience.newInstance();
				break;
			case 3:
				p = Competence.newInstance();
				break;
			case 4 :
				p = Hobby.newInstance();
				break;
			case 5:
				p= Contact.newInstance();
				break;
			default:
				p = Experience.newInstance();
				break;

			}

			return p;
		}

		@Override
		public int getCount() {
			return titleSections.length;
		}

		@Override
		public String getTitle(int pos){
			return titleSections[pos];
		}
	}
}



