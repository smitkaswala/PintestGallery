package com.gallery.photosgallery.videogallery.pintestgallery.dialogs

import com.gallery.photosgallery.videogallery.pintestgallery.extensions.launchGrantAllFilesIntent
import com.simplemobiletools.commons.activities.BaseSimpleActivity
import com.simplemobiletools.commons.extensions.applyColorFilter
import com.simplemobiletools.commons.extensions.getAlertDialogBuilder
import com.simplemobiletools.commons.extensions.getProperTextColor
import com.simplemobiletools.commons.extensions.setupDialogStuff
import com.simplemobiletools.gallery.pro.databinding.DialogGrantAllFilesBinding

class GrantAllFilesDialog(val activity: BaseSimpleActivity) {
    init {
        val binding = DialogGrantAllFilesBinding.inflate(activity.layoutInflater)
        binding.grantAllFilesImage.applyColorFilter(activity.getProperTextColor())

        activity.getAlertDialogBuilder()
            .setPositiveButton(com.simplemobiletools.commons.R.string.ok) { dialog, which -> activity.launchGrantAllFilesIntent() }
            .setNegativeButton(com.simplemobiletools.commons.R.string.cancel, null)
            .apply {
                activity.setupDialogStuff(binding.root, this) { alertDialog -> }
            }
    }
}
