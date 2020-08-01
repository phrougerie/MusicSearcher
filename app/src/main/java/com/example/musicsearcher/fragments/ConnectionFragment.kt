package com.example.musicsearcher.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.musicsearcher.viewModels.ConnectionViewModel
import com.example.musicsearcher.R
import kotlinx.android.synthetic.main.connection_fragment.view.*

class ConnectionFragment : Fragment() {

    companion object {
        fun newInstance() =
            ConnectionFragment()
    }

    private lateinit var viewModel: ConnectionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.connection_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ConnectionViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.connection.setOnClickListener {
            val action = ConnectionFragmentDirections.actionConnectionFragmentToHomeFragment()
            Navigation.findNavController(view).navigate(action)
        }
        view.register.setOnClickListener{
            val action = ConnectionFragmentDirections.actionConnectionFragmentToRegisterFragment()
            Navigation.findNavController(view).navigate(action)
        }
    }

}