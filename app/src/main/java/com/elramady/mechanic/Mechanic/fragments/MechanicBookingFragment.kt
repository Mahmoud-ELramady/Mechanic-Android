package com.elramady.mechanic.Mechanic.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.elramady.mechanic.R

class MechanicBookingFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mechanic_booking, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MechanicBookingFragment().apply {
                arguments = Bundle().apply {
                    putString("key1", param1)
                    putString("key2", param2)
                }
            }
    }
}