package com.example.rangamadushan.chat;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by rangamadushan on 3/23/18.
 */

class SectionsPagerAdapter extends FragmentPagerAdapter {


    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0: RequestsFragment requestsFragment = new RequestsFragment(); return requestsFragment;

            case 1: ChatsFragment chatsFragment = new ChatsFragment(); return chatsFragment;

            case 2: FriendsFragment friendsFragment = new FriendsFragment(); return friendsFragment;

            default: return null;

        }


    }

    @Override
    public int getCount() {
        return 3; //apita tab 3k tiyen nisa 3 danwa
    }
    //me uda method 3m ona wenwa fragment walat


    //meka hadnne fragment wlata title denna
    public CharSequence getPageTitle(int position){

        switch (position){

            case 0: return "REQUEST";
            case 1: return "CHATS";
            case 2: return "FRIENDS";
            default: return null;

        }

    }



}//class
