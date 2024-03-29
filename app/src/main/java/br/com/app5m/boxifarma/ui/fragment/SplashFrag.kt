package br.com.app5m.boxifarma.ui.fragment

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import br.com.app5m.boxifarma.R


class SplashFrag : Fragment() {
    var navigation = view?.let { Navigation.findNavController(it) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigation = Navigation.findNavController(view)
        Handler().postDelayed({

            navigation?.navigate(R.id.action_splashFrag_to_introContainerFrag)

        }, 1500)


    }





}