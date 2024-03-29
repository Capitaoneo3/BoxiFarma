package br.com.app5m.boxifarma.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.navigation.Navigation
import androidx.viewpager.widget.ViewPager
import br.com.app5m.boxifarma.R


import kotlinx.android.synthetic.main.fragment_intro_container.*

class IntroContainerFrag : Fragment() {

    var navigation = view?.let { Navigation.findNavController(it) }
    val me: Fragment = this


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_intro_container, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigation = Navigation.findNavController(view)
        configInitialViews()

    }
    private class SectionsPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm,
        BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
    ) {
        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> Intro1Frag()
                1 -> Intro2Frag()
                else -> Intro3Frag()
            }
        }

        override fun getCount(): Int {
            // Show 3 total pages.
            return 3
        }
    }
    private fun configInitialViews(){
        val adapter = fragmentManager?.let { SectionsPagerAdapter(it) }

        pagerView.adapter = adapter

        introIndicator.setViewPager(pagerView)

        pagerView.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

                if (position == 2) {
                    skip_intro_bt.visibility = View.VISIBLE
                } else {
                    skip_intro_bt.visibility = View.GONE

                }
            }
            override fun onPageSelected(position: Int) {

            }
            override fun onPageScrollStateChanged(state: Int) {}
        })

        loadClicks()

    }
    private fun loadClicks() {

      /*  skip_intro_bt.setOnClickListener {
            pagerView.currentItem++
        }
*/
        skip_intro_bt.setOnClickListener {

            navigation?.navigate(R.id.action_introContainerFrag_to_siginInFragment)

        }

    }

    override fun onResume() {
        super.onResume()
        pagerView.currentItem = 0

    }
}