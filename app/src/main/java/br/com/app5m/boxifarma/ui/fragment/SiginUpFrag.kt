package br.com.app5m.boxifarma.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import br.com.app5m.boxifarma.R
import kotlinx.android.synthetic.main.fragment_sigin_up.*
import androidx.activity.OnBackPressedCallback




class SiginUpFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sigin_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navigation = Navigation.findNavController(view)



        next_siginUp_bt.setOnClickListener {
            navigation?.navigate(R.id.action_siginUpFrag_to_phoneValidation1Frag)

        }
        back_sigin_up.setOnClickListener {
/*
            requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), this);
*/



        }
    }
 /*   fun handleOnBackPressed(): Boolean {
        //Do your job here
        //use next line if you just need navigate up
        //NavHostFragment.findNavController(this).navigateUp();
        //Log.e(getClass().getSimpleName(), "handleOnBackPressed");
        return true
    }*/
}