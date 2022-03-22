package com.example.challenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.challenge3.databinding.FragmentKeduaBinding


class FragmentKedua : Fragment() {

    var _binding: FragmentKeduaBinding? = null
    val binding get() = _binding!!


    companion object{
        val EXTRA_NAME = "EXTRA_NAME"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentKeduaBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnToScreen3.setOnClickListener {
            val mBundle = Bundle()
            val name = binding.etName.text.toString()
            mBundle.putString(EXTRA_NAME, name)
            it.findNavController().navigate(R.id.action_fragmentKedua2_to_fragmentKetiga)
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}