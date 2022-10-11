package com.mostafadev.shoeappfirstsubmission.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.mostafadev.shoeappfirstsubmission.R
import com.mostafadev.shoeappfirstsubmission.databinding.ActivityMainBinding
import com.mostafadev.shoeappfirstsubmission.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
   private lateinit var binding:FragmentLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val binding:FragmentLoginBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_login, container, false)

        binding.register.setOnClickListener { view:View ->
            view.findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment)
        }

        binding.login.setOnClickListener { view:View ->
            view.findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment)
        }
        return binding.root
    }


}