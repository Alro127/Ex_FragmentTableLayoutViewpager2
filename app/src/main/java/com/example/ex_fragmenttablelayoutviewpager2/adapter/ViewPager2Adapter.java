package com.example.ex_fragmenttablelayoutviewpager2.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.ex_fragmenttablelayoutviewpager2.fragment.CancleFragment;
import com.example.ex_fragmenttablelayoutviewpager2.fragment.DanhGiaFragment;
import com.example.ex_fragmenttablelayoutviewpager2.fragment.DeliveryFragment;
import com.example.ex_fragmenttablelayoutviewpager2.fragment.NewOrderFragment;
import com.example.ex_fragmenttablelayoutviewpager2.fragment.PickupFragment;

public class ViewPager2Adapter extends FragmentStateAdapter {
    public ViewPager2Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new NewOrderFragment();
            case 1:
                return new PickupFragment();
            case 2:
                return new DeliveryFragment();
            case 3:
                return new DanhGiaFragment();
            case 4:
                return new CancleFragment();
            default:
                return new NewOrderFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
