package com.example.challenge3

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.challenge3.databinding.FragmentKetigaBinding
import com.example.challenge3.direct.TekananHidrostatis

class FragmentKetiga : Fragment() {
    private var _binding: FragmentKetigaBinding? = null
    private val binding get() = _binding!!
    private val args : FragmentKetigaArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentKetigaBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val aName = args.name
        val model = args.hasil

        if (aName != null){
            binding.tvEP.visibility = View.GONE
            binding.tvGravitasi.visibility = View.GONE
            binding.tvMassa.visibility = View.GONE
            binding.tvTinggi.visibility = View.GONE
            binding.tvName.text = "Selamat Datang $aName"
        }
        else{
            val energiPotensial = model?.massa.toString().toInt() * model?.gravitasi.toString().toInt() * model?.tinggi.toString().toInt()
            binding.tvName.visibility = View.GONE
            binding.btnToScreen4.visibility = View.GONE
            binding.tvMassa.text = "Nilai Massa Input = ${model?.massa}"
            binding.tvGravitasi.text = "Nilai Gravitasi Input = ${model?.gravitasi}"
            binding.tvTinggi.text = "Nilai Tinggi Input = ${model?.tinggi}"


        }
        binding.btnToScreen4.setOnClickListener {
            val action = FragmentKetigaDirections.actionFragmentKetigaToFragmentKeempat(aName)
            findNavController().navigate(action)
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}