package com.example.tablayoutdemo.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tablayoutdemo.CallsFragment;
import com.example.tablayoutdemo.CameraFragment;
import com.example.tablayoutdemo.ChatsFragment;
import com.example.tablayoutdemo.StatusFragment;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){

            case 1:
               return new StatusFragment();
            case 2:
                return new CallsFragment();
            case 3:
                return new ChatsFragment();
        }
        return new ChatsFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
