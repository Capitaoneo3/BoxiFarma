package br.com.app5m.boxifarma.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import br.com.app5m.boxifarma.R
import kotlinx.android.synthetic.main.fragment_phone_validation1.*
import kotlinx.android.synthetic.main.fragment_sigin_up.*
import kotlinx.android.synthetic.main.fragment_sigin_up.next_siginUp_bt

class PhoneValidation1Frag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_phone_validation1, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navigation = Navigation.findNavController(view)

        next_phoneVal1_bt.setOnClickListener {
            navigation?.navigate(R.id.action_phoneValidation1Frag_to_phonevalidation2Frag)

        }
    }
}