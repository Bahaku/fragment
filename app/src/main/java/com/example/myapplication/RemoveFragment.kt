package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class RemoveFragment: Fragment(){

    private var btnRemove: Button? = null
    private var listen: ChangeFragment? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listen = context as ChangeFragment
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_remove, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnRemove = view.findViewById(R.id.btnRemove)

        btnRemove?.setOnClickListener{
            listen?.fragmentChange1()
        }
    }
}