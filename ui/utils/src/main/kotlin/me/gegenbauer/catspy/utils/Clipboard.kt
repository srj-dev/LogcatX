package me.gegenbauer.catspy.utils

import java.awt.Toolkit
import java.awt.datatransfer.StringSelection

object Clipboard {

    fun copyToClipboard(content: String) {

        try {
            if (content.isNotEmpty()) {
                val clipboard = Toolkit.getDefaultToolkit().systemClipboard
                clipboard.setContents(StringSelection(content), null)
            }
        } catch (e: Exception) {
            // Handle error gracefully
            e.printStackTrace()
        }
    }
}
