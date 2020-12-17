package com.example.demolivedata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FragmentMain : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.bt1).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_liveDataDefaultFragmet)
        }

        view.findViewById<Button>(R.id.bt2).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_transisionFragment)
        }

        view.findViewById<Button>(R.id.bt3).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_switchMapFragment)
        }

        view.findViewById<Button>(R.id.bt4).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_mediatorFragment)
        }

        view.findViewById<Button>(R.id.bt5).setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_SInger1Fragment)
        }
    }
}