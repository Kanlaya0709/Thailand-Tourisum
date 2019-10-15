package com.example.thailandtourisum


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.thailandtourisum.databinding.FragmentProvinceBinding

/**
 * A simple [Fragment] subclass.
 */
class provinceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentProvinceBinding>(inflater
            ,R.layout.fragment_zone,container,false)

        return  binding.root
    }


}
