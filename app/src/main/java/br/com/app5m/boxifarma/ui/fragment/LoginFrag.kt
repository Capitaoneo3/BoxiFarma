package br.com.app5m.boxifarma.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import br.com.app5m.boxifarma.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navigation = Navigation.findNavController(view)

        login_bt_login.setOnClickListener {
/*
            navigation?.navigate(R.id.action_siginInFragment_to_loginFrag)
*/

        }
        recoverPass_tv.setOnClickListener {
            navigation?.navigate(R.id.action_loginFrag_to_recoverPassFrag)

        }

    }
}