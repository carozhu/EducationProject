package edu.simple.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import edu.simple.R;
import edu.simple.builder.AboutBuilder;
import edu.simple.presenter.SampleHelper;


public class FragmentPersonCenter extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_c, container, false);
        loadAbout(rootView);
        return rootView;
    }

    public void loadAbout(View rootView) {
        final FrameLayout flHolder = (FrameLayout) rootView.findViewById(R.id.about);

        flHolder.addView(
                AboutBuilder.with(getContext())
                        .setAppIcon(R.mipmap.ic_launcher)
                        .setAppName(R.string.app_name)
                        .setPhoto(R.mipmap.profile_picture)
                        .setCover(R.mipmap.profile_cover)
                        .setLinksAnimated(true)
                        .setDividerDashGap(13)
                        .setName("Your Full Name")
                        .setSubTitle("Mobile Developer")
                        .setLinksColumnsCount(4)
                        .setBrief("I'm warmed of mobile technologies. Ideas maker, curious and nature lover.")
                        .addGooglePlayStoreLink("8002078663318221363")
                        .addGitHubLink("jrvansuita")
                        .addBitbucketLink("jrvansuita")
                        .addFacebookLink("user")
                        .addTwitterLink("user")
                        .addInstagramLink("jnrvans")
                        .addGooglePlusLink("+JuniorVansuita")
                        .addYoutubeChannelLink("CaseyNeistat")
                        .addDribbbleLink("user")
                        .addLinkedInLink("arleu-cezar-vansuita-júnior-83769271")
                        .addEmailLink("vansuita.jr@gmail.com")
                        .addWhatsappLink("Jr", "+554799650629")
                        .addSkypeLink("user")
                        .addGoogleLink("user")
                        .addAndroidLink("user")
                        .addWebsiteLink("site")
                        /*
                        .addFiveStarsAction()
                        .addMoreFromMeAction("Vansuita")
                        .setVersionNameAsAppSubTitle()
                        .addShareAction(R.string.app_name)
                        .addUpdateAction()
                        .setActionsColumnsCount(2)
                        .addFeedbackAction("vansuita.jr@gmail.com")
                        .addIntroduceAction((Intent) null)
                        .addHelpAction((Intent) null)
                        .addChangeLogAction((Intent) null)
                        .addRemoveAdsAction((Intent) null)
                        .addDonateAction((Intent) null)
                        */
                        .setWrapScrollView(true)
                        .build());
    }
}
