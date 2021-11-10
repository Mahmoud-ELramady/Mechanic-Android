package com.elramady.mechanic.User.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.elramady.mechanic.R
import com.elramady.mechanic.User.fragment_requests.CurrentRequestsFragment
import com.elramady.mechanic.User.fragment_requests.PreviousRequestsFragment


private val TAB_TITLES = arrayOf(
    R.string.tab_text_2,
    R.string.tab_text_1
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        var frag:Fragment?=null
        when(position){
            0 ->{frag= PreviousRequestsFragment.newInstance("","")
            }
            1 ->{frag= CurrentRequestsFragment.newInstance("","")
            }
        }
        return frag!!
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }
}