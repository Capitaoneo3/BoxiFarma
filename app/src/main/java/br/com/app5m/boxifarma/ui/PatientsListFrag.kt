package br.com.app5m.boxifarma.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.app5m.boxifarma.Helper.RecyclerItemClickListener
import br.com.app5m.boxifarma.R
import br.com.app5m.boxifarma.model.Model
import br.com.app5m.boxifarma.ui.adapter.PounchAdapter
import kotlinx.android.synthetic.main.fragment_patients_list.*

class PatientsListFrag : Fragment(), RecyclerItemClickListener {
    private var listModel = ArrayList<Model>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_patients_list, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureInitialViews()

//        patients_rv
    }
    @SuppressLint("UseCompatLoadingForDrawables")
    fun configureInitialViews() {
        listModel.add(Model())
        listModel.add(Model())
        listModel.add(Model())



        patients_rv.apply {
            setHasFixedSize(true)
            val itemDecoration = DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
            itemDecoration.setDrawable(
                resources.getDrawable(
                    R.drawable.decor_layout_no_bg_horizontal,
                    null
                )
            )
            patients_rv.addItemDecoration(itemDecoration)

        }
        val patientsAdapter = PounchAdapter(requireContext(), listModel, this)

        val layoutPatientsManagerRv: RecyclerView.LayoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        patients_rv.layoutManager = layoutPatientsManagerRv

        patients_rv.adapter = patientsAdapter
    }
}