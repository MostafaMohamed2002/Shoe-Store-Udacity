package com.mostafadev.shoeappfirstsubmission.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.mostafadev.shoeappfirstsubmission.R
import com.mostafadev.shoeappfirstsubmission.databinding.FragmentLoginBinding
import com.mostafadev.shoeappfirstsubmission.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {
    private lateinit var binding: FragmentWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
         binding=DataBindingUtil.inflate(inflater,R.layout.fragment_welcome, container, false)
binding.outlinedButton.setOnClickListener { view:View ->
    view.findNavController().navigate(R.id.action_welcomeFragment_to_instructionFragment)

}
        return binding.root

    }


}