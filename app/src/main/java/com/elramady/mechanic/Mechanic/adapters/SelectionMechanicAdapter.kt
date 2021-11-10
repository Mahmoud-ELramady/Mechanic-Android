package com.elramady.mechanic.Mechanic.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.elramady.mechanic.Mechanic.fragments.MechanicBookingFragment
import com.elramady.mechanic.Mechanic.fragments.StayingBookingFragment
import com.elramady.mechanic.R
import com.elramady.mechanic.User.fragment_requests.CurrentRequestsFragment
import com.elramady.mechanic.User.fragment_requests.PreviousRequestsFragment


private val TAB_TITLES = arrayOf(
    R.string.tab_text_3,
    R.string.tab_text_4
)


class SectionsMechanicAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        var frag:Fragment?=null
        when(position){
            0 ->{frag= StayingBookingFragment.newInstance("","")
            }
            1 ->{frag= MechanicBookingFragment.newInstance("","")
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