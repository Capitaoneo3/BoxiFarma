package br.com.app5m.boxifarma.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import br.com.app5m.boxifarma.R
import kotlinx.android.synthetic.main.fragment_details_patient.*
import kotlinx.android.synthetic.main.fragment_type_of_evolution2.*

class TypeOfEvolution2Frag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_type_of_evolution2, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navigation = Navigation.findNavController(view)


        nextTypeOfEvolution2_bt.setOnClickListener {
            navigation?.navigate(R.id.action_typeOfEvolution2Frag_to_homeFrag)

        }


    }
}