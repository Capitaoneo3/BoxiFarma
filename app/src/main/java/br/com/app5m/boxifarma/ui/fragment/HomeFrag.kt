package br.com.app5m.boxifarma.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import br.com.app5m.boxifarma.R
import br.com.app5m.boxifarma.ui.dialog.ConsultQrCodeDialog
import br.com.app5m.boxifarma.ui.dialog.TypeTheCodeDialog
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navigation = Navigation.findNavController(view)

        counsultPounch_cv.setOnClickListener {
//            navigation?.navigate(R.id.action_homeFrag_to_consultPounchFrag)
            val dialog = ConsultQrCodeDialog()

            dialog.setTargetFragment(this, 1)
            fragmentManager?.let { it1 -> dialog.show(it1, "AdresseDialog") }
        }
        avatarPerfil_iv.setOnClickListener {
            navigation?.navigate(R.id.action_homeFrag_to_perfilFragment)

        }
        typeCode_pounch_cv.setOnClickListener {
            val dialog = TypeTheCodeDialog()

            dialog.setTargetFragment(this, 1)
            fragmentManager?.let { it1 -> dialog.show(it1, "AdresseDialog") }
        }
    }
}