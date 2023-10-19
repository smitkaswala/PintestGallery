package com.gallery.photosgallery.videogallery.pintestgallery.interfaces

import com.gallery.photosgallery.videogallery.pintestgallery.models.ThumbnailItem
import com.simplemobiletools.commons.models.FileDirItem

interface MediaOperationsListener {
    fun refreshItems()

    fun tryDeleteFiles(fileDirItems: ArrayList<FileDirItem>, skipRecycleBin: Boolean)

    fun selectedPaths(paths: ArrayList<String>)

    fun updateMediaGridDecoration(media: ArrayList<ThumbnailItem>)
}
