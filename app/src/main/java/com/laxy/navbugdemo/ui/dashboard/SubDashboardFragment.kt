package com.laxy.navbugdemo.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.laxy.navbugdemo.databinding.FragmentDashboardBinding
import com.laxy.navbugdemo.ui.home.HomeFragmentDirections

class SubDashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.textDashboard.text = "SubDashboardFragment"
        binding.textDashboard.setOnClickListener {
            val action = SubDashboardFragmentDirections.actionSubdashboardToSubhome("from sub dashboard fragment")
            findNavController().navigate(action)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}