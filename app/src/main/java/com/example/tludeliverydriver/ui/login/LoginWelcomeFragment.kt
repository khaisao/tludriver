package com.example.tludeliverydriver.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tludeliverydriver.R
import com.example.tludeliverydriver.databinding.FragmentLoginWelcomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginWelcomeFragment : Fragment() {

    private lateinit var binding: FragmentLoginWelcomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginWelcomeBinding.inflate(inflater)
        binding.tvSignIn.setOnClickListener {
            findNavController().navigate(
                LoginWelcomeFragmentDirections.actionLoginWelcomeFragmentToSignInFragment()
            )
        }
        binding.tvSignUp.setOnClickListener {
            findNavController().navigate(
                LoginWelcomeFragmentDirections.actionLoginWelcomeFragmentToSignUpFragment()
            )
        }
        return binding.root
    }

}