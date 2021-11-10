package com.elramady.mechanic.Mechanic.fragmentsDrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.elramady.mechanic.Mechanic.adapters.SectionsMechanicAdapter
import com.elramady.mechanic.R
import com.elramady.mechanic.User.adapters.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayout


class CurrentRequestsMechanicFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var v= inflater.inflate(R.layout.fragment_current_requests_mechanic, container, false)


        val sectionsPagerAdapter = SectionsMechanicAdapter(requireContext(), childFragmentManager)
        val viewPager: ViewPager = v.findViewById(R.id.view_pager_current_mechanic)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = v.findViewById(R.id.tablayout_current_mechanic)
        tabs.setupWithViewPager(viewPager)


        return v

    }

}