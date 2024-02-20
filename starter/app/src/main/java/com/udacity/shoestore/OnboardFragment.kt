package com.udacity.shoestore

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.udacity.shoestore.databinding.FragmentOnboardBinding
import java.lang.String


class OnboardFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentOnboardBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_onboard, container, false)

        binding.apply {
            val res = resources
            greetingText.text = String.format(res.getString(R.string.onboard_greeting), "Hiep")
            greetingText.setTextColor(Color.parseColor("#bdbdbd"))
        }

        return binding.root
    }
}