package com.example.demolivedata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class TransmationMapFragment : Fragment() {

    private lateinit var viewModel: TranFormMapViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_transision, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[TranFormMapViewModel::class.java]
        val textView = view.findViewById<TextView>(R.id.text1)

        viewModel.currentTimeString.observe(viewLifecycleOwner, {
            textView.text = it
        })

    }
}