package br.com.app5m.boxifarma.ui.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import br.com.app5m.boxifarma.R

import kotlinx.android.synthetic.main.dialog_type_the_code.*

class TypeTheCodeDialog : DialogFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NORMAL, R.style.DialogNoBackground)

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_type_the_code, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        search_bt_typeCode.setOnClickListener {
            findNavController().navigate(R.id.action_homeFrag_to_detailsPounchFrag)


            dialog?.dismiss()
        }
        back_bt_consultTypeCode.setOnClickListener {
            dialog?.dismiss()
        }
    }


}