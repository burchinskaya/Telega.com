package com.example.telegacom.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.telegacom.R

class ProfileFragment : Fragment() {

     override fun onCreateView(inflater: LayoutInflater,
                               container: ViewGroup?,
                               savedInstanceState: Bundle?) : View?
    {
        val view = LayoutInflater.from(getActivity()).inflate(R.layout.profile_fragment, container, false);

        return view
    }

}