package com.example.uaalsample1003

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.view.WindowManager.LayoutParams.SCREEN_ORIENTATION_CHANGED
import androidx.constraintlayout.widget.ConstraintLayout
import com.unity3d.player.UnityPlayer
import com.unity3d.player.UnityPlayerActivity


class MainActivity : UnityPlayerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.clearFlags(SCREEN_ORIENTATION_CHANGED)
        findViewById<ConstraintLayout>(R.id.unity)?.addView(
            mUnityPlayer, ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        )
    }
}