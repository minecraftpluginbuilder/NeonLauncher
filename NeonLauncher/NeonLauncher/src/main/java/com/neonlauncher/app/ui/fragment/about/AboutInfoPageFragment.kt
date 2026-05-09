package com.neonlauncher.app.ui.fragment.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.neonlauncher.app.R
import com.neonlauncher.app.databinding.FragmentAboutInfoPageBinding
import com.neonlauncher.app.utils.ZHTools

/**
 * NeonLauncher — About page
 * Clean: no upstream credits, no Neon/NeonLauncher Team references.
 */
class AboutInfoPageFragment() : Fragment(R.layout.fragment_about_info_page) {
    private lateinit var binding: FragmentAboutInfoPageBinding
    private var parentPager2: ViewPager2? = null

    constructor(parentPager: ViewPager2) : this() {
        this.parentPager2 = parentPager
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAboutInfoPageBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            dec1.text = "NeonLauncher lets you play Minecraft: Java Edition on your Android device for free."
            dec2.text = "Built with a dark neon UI inspired by Lunar Client. Supports mods, custom renderers, and offline play."
            dec3.text = "NeonLauncher is open-source under GPL v3. If you distribute it, keep the source open."

            githubButton.setOnClickListener {
                ZHTools.openLink(requireActivity(), "https://github.com/YOUR_USERNAME/NeonLauncher")
            }
            licenseButton.setOnClickListener {
                ZHTools.openLink(requireActivity(), "https://www.gnu.org/licenses/gpl-3.0.html")
            }
            discordButton.setOnClickListener {
                ZHTools.openLink(requireActivity(), "https://discord.gg/YOUR_INVITE")
            }

            // Hide QQ, sponsor, and credits recycler — not needed
            qqGroupButton.visibility = View.GONE
            sponsor.visibility = View.GONE
            aboutRecycler.visibility = View.GONE
            aboutTitle.visibility = View.GONE
            divider2.visibility = View.GONE
        }
    }
}
