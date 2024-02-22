package com.zeinabmallaki.mosacen_alfoad.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zeinabmallaki.mosacen_alfoad.databinding.SettingBinding

class SettingFragment: Fragment() {

    private lateinit var binding: SettingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SettingBinding.inflate(inflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.settingFragment.setOnClickListener {

        }
    }
}