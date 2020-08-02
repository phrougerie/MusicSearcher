package com.phrougerie.musicsearcher.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth
import com.phrougerie.musicsearcher.R
import com.phrougerie.musicsearcher.databinding.RegisterFragmentBinding
import com.phrougerie.musicsearcher.viewModels.RegisterViewModel
import kotlinx.android.synthetic.main.connection_fragment.view.*
import kotlinx.android.synthetic.main.register_fragment.view.*

class RegisterFragment : Fragment() {
    private  lateinit var  mAuth: FirebaseAuth

    companion object {
        fun newInstance() =
            RegisterFragment()
    }

    private lateinit var viewModel: RegisterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : RegisterFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.register_fragment, container,false)
        binding.registerVM = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mAuth = FirebaseAuth.getInstance()
        view.validation.setOnClickListener{
            Log.v("test1",viewModel.email.value)
        }

    }



}