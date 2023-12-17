package me.capcom.smsgateway.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import me.capcom.smsgateway.R

class HolderFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_holder, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        childFragmentManager.commit {
            add(R.id.rootLayout, MessagesListFragment.newInstance())
        }
    }

    fun onBackPressed(): Unit {
        childFragmentManager.popBackStack()
    }

    companion object {
        fun newInstance() =
            HolderFragment().apply {

            }
    }
}