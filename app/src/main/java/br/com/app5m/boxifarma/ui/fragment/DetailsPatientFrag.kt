package br.com.app5m.boxifarma.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import br.com.app5m.boxifarma.R
import br.com.app5m.boxifarma.model.Model
import br.com.app5m.boxifarma.ui.dialog.QrCodePatientDialog
import br.com.app5m.boxifarma.ui.dialog.QrCodePounchDialog
import br.com.app5m.boxifarma.ui.dialog.TypeTheCodeDialog
import kotlinx.android.synthetic.main.fragment_details_patient.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.avatarPerfil_iv

class DetailsPatientFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details_patient, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navigation = Navigation.findNavController(view)


        prescription_bt.setOnClickListener {
            navigation?.navigate(R.id.action_detailsPatientFrag_to_prescriptionFragment)
        }
        evolution_bt.setOnClickListener {
            navigation?.navigate(R.id.action_detailsPatientFrag_to_evolutionFrag)
        }
        relatives_bt.setOnClickListener {
            navigation?.navigate(R.id.action_detailsPatientFrag_to_relativesFrag)
        }
        TypeOfEvolution_bt.setOnClickListener {
            navigation?.navigate(R.id.action_detailsPatientFrag_to_typeOfEvolutionFrag)
        }

    }

}