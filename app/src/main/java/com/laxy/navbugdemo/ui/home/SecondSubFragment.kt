package com.laxy.navbugdemo.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.laxy.navbugdemo.databinding.FragmentSubHomeBinding
import com.laxy.navbugdemo.databinding.FragmentSubSecondBinding
import com.laxy.navbugdemo.ui.dashboard.SubDashboardFragment

class SecondSubFragment : Fragment() {

    private var _binding: FragmentSubSecondBinding? = null
    private val args: SubHomeFragmentArgs by navArgs()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSubSecondBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        textView.text = args.from
        textView.setOnClickListener {
            val a = SecondSubFragmentDirections.actionSecondSubToSubhome("")
            val b = SecondSubFragmentDirections.actionSubdashboardToSubhome("")
            findNavController().navigate(a)
            findNavController().navigate(b)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}