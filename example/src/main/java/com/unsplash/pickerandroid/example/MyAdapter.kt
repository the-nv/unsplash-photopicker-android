package com.unsplash.pickerandroid.example

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class MyAdapter(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {

    // this is for fragment tabs
    override fun getItem(position: Int): Fragment {
        var fragment: Fragment = Fragment()
        when (position) {
            0 -> {
                return tab1()
            }
            1 -> {
                return tab2()
            }
            else -> return fragment
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}