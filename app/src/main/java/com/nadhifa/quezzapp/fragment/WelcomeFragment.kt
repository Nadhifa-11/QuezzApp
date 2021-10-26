package com.nadhifa.quezzapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.nadhifa.quezzapp.R
import com.nadhifa.quezzapp.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {


    private lateinit var welcomeBinding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        welcomeBinding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return welcomeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        welcomeBinding.btnStart.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_quizFragment)
        )
    }
}