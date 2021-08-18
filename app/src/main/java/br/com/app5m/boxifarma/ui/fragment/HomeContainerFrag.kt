package br.com.app5m.boxifarma.ui.fragment

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.ui.NavigationUI
import br.com.app5m.boxifarma.Helper.BackButtonBehaviour
import br.com.app5m.boxifarma.Helper.setupWithNavController
import br.com.app5m.boxifarma.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeContainerFrag : Fragment() {
    private val bottomNavSelectedItemIdKey = "BOTTOM_NAV_SELECTED_ITEM_ID_KEY"
    private var bottomNavSelectedItemId = R.id.home_graph // Must be your starting destination
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home_container, container, false)
    }
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        savedInstanceState?.let {
            bottomNavSelectedItemId =
                savedInstanceState.getInt(bottomNavSelectedItemIdKey, bottomNavSelectedItemId)

        }
        setupBottomNavBar(view)

    }
    // Needed to maintain correct state over rotations
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(bottomNavSelectedItemIdKey, bottomNavSelectedItemId)
        super.onSaveInstanceState(outState)
    }

    @RequiresApi(Build.VERSION_CODES.S)
    private fun setupBottomNavBar(view: View) {


        val bottomNavView = view.findViewById<BottomNavigationView>(R.id.bottom_nav_view)
        val toolbar = view.findViewById<Toolbar>(R.id.bottom_nav_toolbar)
        // Your navGraphIds must have the same ids as your menuItem ids
        val navGraphIds = listOf(R.navigation.home_graph)




        addToolbarListener(toolbar)
        bottomNavView.selectedItemId = bottomNavSelectedItemId // Needed to maintain correct state on return

        val controller = bottomNavView.setupWithNavController(
            fragmentManager = childFragmentManager,
            navGraphIds = navGraphIds,
            backButtonBehaviour = BackButtonBehaviour.POP_HOST_FRAGMENT,
            containerId = R.id.bottom_nav_container,
            firstItemId = R.id.home, // Must be the same as bottomNavSelectedItemId
            intent = requireActivity().intent

        )

        controller.observe(viewLifecycleOwner, { navController ->
            NavigationUI.setupWithNavController(toolbar, navController)
            bottomNavSelectedItemId = navController.graph.id // Needed to maintain correct state on return
            toolbar.setTitle(R.string.toolbarNoTitle)

        })
    }

    private fun addToolbarListener(toolbar: Toolbar) {
        toolbar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
             /*   R.id.settings -> {
*//*
                    findNavController().navigate(R.id.settings)
*//*
                    true
                }*/
                else -> false
            }
        }
    }
}